# Thula Baby Centre REST API

##Status
This temperature monitoring system has been running in 2 clinics for 7 months, with notifications and escalations.  On two occassions we have been notified of problems with fridges which, without the system, would probably have resulted in the loss of vaccines.

We now have plenty of data to build additional functionality on top of, and we have ironed out a number of real-life issues.  Some challenges which remain are not easy to deal with:

* False positives when fridges are opened for stock takes or on busy days
* Sensor positioning is important, as most fridges appear to have warm and cold spots, which have wide temperature fluctuations over time.


###Client & Appointments API
####GET
* `/api/v1/clients`
* `/api/v1/clients?filter="a"`
* `/api/v1/appointments`
* `/api/v1/appointments?start-date=yyyy/mm/dd&end-date=yyyy/mm/dd`

Temperatures API
---
####GET
* `/api/v1/temperatures`
* `/api/v1/temperatures?start-date=yyyy/mm/dd&end-date=yyyy/mm/dd`

####POST
* `/api/v1/temperatures`

How to start the thularest application
---

1. Start application with `java -jar thularest-1.0.jar server config.yml`
1. To check that your application is running enter url `https://localhost:8444`


Health Check
---

To see your applications health enter url `https://localhost:8444/healthcheck`

Still to do 2017/01/05
---
1. Provide an SPA Javascript UI for reviewing and reporting tempratures over time


Outstanding issues 2016/06/12
---
1. Setup both systems to run at boot and restart on crash - DONE
1. Install in the fridge and start getting readings - DONE
1. Temperature date/time values returned by the REST interface are always the same value - FIXED
1. Write a monitoring application for the server ASAP - DONE
1. Add filtering to temperature and client query APIs - DONE
1. Security warning - RPi needs certificate registered - DONE
1. Error handling and logging on both sides needs to be improved and more consistent - DONE

Outstanding issues 2016/05/29
---
1. Only the data for Sensor 2 is being saved to the database - FIXED
1. Needs to read basic auth username and password from config - both sides - FIXED
1. *thularest* needs to remove legacy config and replace with DropWizard config - FIXED
1. RPiTempCmd must gracefully handle the REST API disappearing without data loss - FIXED






