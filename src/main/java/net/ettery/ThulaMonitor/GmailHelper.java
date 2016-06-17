package net.ettery.ThulaMonitor;

import com.google.api.client.googleapis.auth.oauth2.*;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.Base64;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.GmailScopes;
import com.google.api.services.gmail.model.Label;
import com.google.api.services.gmail.model.ListLabelsResponse;
import com.google.api.services.gmail.model.Message;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class GmailHelper {
    private static final String APPLICATION_NAME = "ThulaMonitor";
    private static FileDataStoreFactory DATA_STORE_FACTORY;
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static HttpTransport HTTP_TRANSPORT;

    /**
     * Global instance of the scopes required by this quickstart.
     * <p>
     * If modifying these scopes, delete your previously saved credentials
     * at ~/.credentials/gmail-java-quickstart.json
     */
    private static final List<String> SCOPES = Arrays.asList(GmailScopes.GMAIL_COMPOSE, GmailScopes.GMAIL_SEND, GmailScopes.GMAIL_LABELS);
    private static java.io.File DATA_STORE_DIR;
    private static Configuration _configuration;

    public static void initialise(Configuration configuration){
        _configuration = configuration;
        DATA_STORE_DIR = new java.io.File(configuration.getGmailClientSecretPath(), ".credentials/gmail-thula-monitor.json");
        try {
            HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
            DATA_STORE_FACTORY = new FileDataStoreFactory(DATA_STORE_DIR);
        } catch (Throwable t) {
            t.printStackTrace();
            System.exit(1);
        }
    }

//    /**
//     * Creates an authorized Credential object.
//     *
//     * @return an authorized Credential object.
//     * @throws IOException
//     */
//    public static Credential authorize() throws IOException {
//        // Load client secrets.
//        InputStream in = new FileInputStream(new File(_configuration.getGmailClientSecretPath(), _configuration.getGmailClientSecretFile()));
//        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));
//
//        // Build flow and trigger user authorization request.
//        GoogleAuthorizationCodeFlow flow =
//                new GoogleAuthorizationCodeFlow.Builder(
//                        HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
//                        .setDataStoreFactory(DATA_STORE_FACTORY)
//                        .setAccessType("offline")
//                        .build();
//        Credential credential = new AuthorizationCodeInstalledApp(flow, new LocalServerReceiver()).authorize("user");
//
//        System.out.println("Credentials saved to " + DATA_STORE_DIR.getAbsolutePath());
//
//        return credential;
//    }

    public static Credential authorize(String gmailUserId) throws IOException {
        InputStream in = new FileInputStream(new File(_configuration.getGmailClientSecretPath(), _configuration.getGmailClientSecretFile()));
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                                            HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                                            .setDataStoreFactory(DATA_STORE_FACTORY)
                                            .setAccessType("offline")
                                            .build();

        String userId = gmailUserId;    // username@gmail.com
        Credential credential = flow.loadCredential(userId);

        // Should only enter this code once.  After that, the authenticated credentials are
        // stored in the .credentials folder with your client secrets file
        if (credential == null) {
            GoogleAuthorizationCodeRequestUrl authorizationUrl = flow.newAuthorizationUrl();
            String url = authorizationUrl.setRedirectUri(GoogleOAuthConstants.OOB_REDIRECT_URI).build();

            System.out.println("Please open the following URL in your browser then type the authorization code:\n" + url);

            // Read code entered by user.
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String code = br.readLine();

            GoogleAuthorizationCodeTokenRequest tokenRequest = flow.newTokenRequest(code);
            tokenRequest.setRedirectUri(GoogleOAuthConstants.OOB_REDIRECT_URI);
            GoogleTokenResponse tokenResponse = tokenRequest.execute();
            credential = flow.createAndStoreCredential(tokenResponse, userId);   // This stores the credentials for future use
        }
        return credential;
    }

    /**
     * Build and return an authorized Gmail client service.
     *
     * @return an authorized Gmail client service
     * @throws IOException
     */
    public static Gmail getGmailService() throws IOException {
        Credential credential = authorize(_configuration.getGmailSender());
        return new Gmail.Builder(HTTP_TRANSPORT, JSON_FACTORY, credential)
                .setApplicationName(APPLICATION_NAME)
                .build();
    }

    public static void ReadLabels() throws IOException {
        // Build a new authorized API client service.
        Gmail service = getGmailService();

        // Print the labels in the user's account.
        String user = "me";   // "me" == authenticated user
        ListLabelsResponse listResponse = service.users().labels().list(user).execute();
        List<Label> labels = listResponse.getLabels();
        if (labels.size() == 0) {
            System.out.println("No labels found.");
        } else {
            System.out.println("Labels:");
            for (Label label : labels) {
                System.out.printf("- %s\n", label.getName());
            }
        }
    }

    private static MimeMessage createEmail(String to, String from, String subject, String bodyText) throws MessagingException {
        Properties props = new Properties();
        Session session = Session.getDefaultInstance(props, null);

        MimeMessage email = new MimeMessage(session);
        email.setFrom(new InternetAddress(from));
        email.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(to));
        email.setSubject(subject);
        email.setText(bodyText);
        return email;
    }

    private static Message createMessageWithEmail(MimeMessage email) throws MessagingException, IOException {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        email.writeTo(bytes);
        String encodedEmail = Base64.encodeBase64URLSafeString(bytes.toByteArray());
        Message message = new Message();
        message.setRaw(encodedEmail);
        return message;
    }

    public static void sendMessage(String to, String from, String subject, String bodyText) throws MessagingException, IOException {
        MimeMessage email = createEmail(to, from, subject, bodyText);
        Message message = createMessageWithEmail(email);

        message = getGmailService().users().messages().send(from, message).execute();

        System.out.println("Message id: " + message.getId());
        System.out.println(message.toPrettyString());
    }

}
