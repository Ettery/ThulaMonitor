# Thula Baby Centre REST API

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

Outstanding issues 2016/06/12
---
1. Setup both systems to run at boot and restart on crash
1. Install in the fridge and start getting readings
1. Temperature date/time values returned by the REST interface are always the same value
1. Write a monitoring application for the server ASAP
1. Add filtering to temperature and client query APIs
1. Security warning - RPi needs certificate registered
1. Error handling and logging on both sides needs to be improved and more consistent

Outstanding issues 2016/05/29
---
1. Only the data for Sensor 2 is being saved to the database - FIXED
1. Needs to read basic auth username and password from config - both sides - FIXED
1. *thularest* needs to remove legacy config and replace with DropWizard config - FIXED
1. RPiTempCmd must gracefully handle the REST API disappearing without data loss - FIXED






