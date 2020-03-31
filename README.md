## Summary
This Springboot project using RESTful API provides the underwater salinity at a given temperature and depth. 


## Design
Unique design features in this project include:

i) Using logger to log the given depth and temperature.

ii) Creating a json body with detph and temperature while performing a POST request in Postman to get the salinity.

iii)Instead of a repository, the salinity is stored in the application.properties file and the response to the http request fetches this data.


