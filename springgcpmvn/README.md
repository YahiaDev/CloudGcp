**SpringGcpMvn:**<br/>
A web application developed using spring boot. It expose a simple rest controller.
Using appengine maven pluguin the application will be deployed on App Engine Google Cloud platform.

1 -   GCP deployment: .**/mvnw package appengine:deploy** <br/>
2 -   Display the end point: **gcloud app browse** (should add /api/sayhello at the end of URL). 
