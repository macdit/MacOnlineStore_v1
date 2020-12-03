# E-Commerce Management Portal

# Product Description
This dynamic web application is an e-commerce management portal which allowed its regular user to view items, signup to be a member and place order. The administrator will be allowed to perform generic CRUD operations (Create, Read, update and delete) and other additional features like controlling items, orders and customers’ actions.

# This application was created using the following software tools
-	JDK 1.8 
-	Tomcat 9.0
-	PostgreSQL 13.0
-	Junit
-	Apache Maven
-	JDBC Driver 
-	Postman for testing api

# API Description
-	Endpoints/Routes
-	Effect on the database
-	Response body

Locally: http://localhost:8080/{endpoint}{options}

# GET /items Endpoint
•	Route:  GET  http://localhost:8080/items/ 
•	Request Body:
•	Effect on database: get all items/resources from the macditstore database
•	Response Status Code: 200 (OK)
•	 Response Body: 

  {
    “items”: [
      {
      “id”: 1, 
      “name”: “Iphone Z”,
      “Descritpion”: “The last IPhone release with today and tomorrow features”,
      “Price: ”: 899.00
      },
    {
      “id”: 2, 
      “name”: “Dell Fire”,
      “Descritpion”: “The Dell Fire Desktop that is best suitable for video gaming and AI simulation and modeling applications”,
      “Price: ”: 900
      }  
     ] 
    }
    
# GET /items/{specific id} Endpoint
•	Route:  GET  http://localhost:8080/items/1/
•	Request Body:
•	Effect on database: get only the specific item from the macditstore database using specified id
•	Response Status Code: 200 (OK)
•	 Response Body: 

  {
    “items”: [
      {
      “id”: 1, 
      “name”: “Iphone Z”,
      “Descritpion”: “The last IPhone release with today and tomorrow features”,
      “Price: ”: 899.00
      } 
    ]
  }

•	When using HTTP GET method all parameters and their values will be send in URL

# POST /items Endpoint
•	Route:  POST  http://localhost:8080/items/
•	Request Body:
  {
    “items”: 
        {
        “id”: 3, 
        “name”: “Amazon Echo Dot”,
        “Descritpion”: “The Amazon Echo Dot 360 used to control your smart home IoT devices”,
        “Price: ”: 99.99
        } 
  }

•	Effect on database: create a new item/resource inside the macditstore database
•	Response Status Code: 201 (CREATED)
•	 Response Body: 
  {
    “items”: 
        {
          “id”: 3, 
          “name”: “Amazon Echo Dot”,
          “Descritpion”: “The Amazon Echo Dot 360 used to control your smart home IoT devices”,
          “Price: ”: 99.99
       } 
  }




# PUT /items/{specific id}  Endpoint
•	Route:  PUT http://localhost:8080/items/2
•	Request Body:
  {
    “items”: 
      {
      “id”: 3, 
      “name”: “Amazon Echo Dot”,
      “Descritpion”: “The Amazon Echo Dot 360 used to control your smart home IoT devices”,
      “Price: ”: 120.00
      } 
  }

•	Effect on database: the PUT methods request change/replace the item with given id in the  macditstore database. 
•	Response Status Code: 200 means update/replacement was successfully
•	 Response Body: Not necessary to return body

# DELETE  /items/{specific id} Endpoint
•	Route:  DELETE http://localhost:8080/items/3
•	Request Body:
•	Effect on database:  the delete method request will remove an existing item based on the supplied id in the database.
•	Response Status Code: 204 (No Content)
•	 Response Body: No return body


#How to startup the Application
#prerequisites
In order to run this application successfully, the following software tools are required to be download and install in your local host:
•	JDK 1.8 
•	Apache Tomcat 9.0
•	PostgreSQL 13
•	IDE prepared Eclipse or NetBeans
In addition make sure the following environment are configure correctly in your local machine
•	JDK  JAVA_HOME
•	Tomcat  CATALINA_HOME 
•	Maven  MAVEN_HOME & M2_HOME


#Setup
1-	Download the following to your local host using the following url
> git clone [Application_URL]
2-	Run macditstore-setup.sql file to create required database and tables for the application
3-	Setup Tomcat server
4-	Manually perform the following actions in order:
•	Use maven build tool to package the application into war file:
> mvn clean package
•	Deploy the application locally using the Tomcat server by copy generatd war file in step 4 above to  webapps folder in Tomcat directory.
•	Run startup.sh/startup.bat in the Tomcat folder
•	Go to your browser address bar and supply the landing package url as followed:
http//localhost:8080/items/

# Contributors

# External Resources


