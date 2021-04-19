# Spring Boot REST API To Fetch JSON From A Link
A REST API that fetches data as JSON from some given link using Spring Boot.

In this repo, a simple spring boot API is designed that fetches data from a link, accepts it in JSON format, and prints it to the web browser.
A controller is there that uses an instance of REST Template through which we call a function getForEntity() [ restTemplete.getForEntity("https://jsonplaceholder.typicode.com/posts", User.class); ] and it accepts two following parameters.
1. A link from which we want to fetch data.
2. A model that will accept the values from the link.

The model contains all the required attributes and getters & setters methods that our link will send to it.

Finally, the application sends the values to the browser.

The service should perform the following tasks:

Count endpoint :
Tally the number of unique user Ids in the JSON and return in a JSON response.

 
Updated User List endpoint :
Modify the 4th JSON array item.

Return the modified JSON object to the controller class from the service then in the endpoint JSON response.
Unit tests runnable via “mvn test”

TODO - written to test all aspects of the application (include mock of the feed).

 

Requirements:                                 

Use Java 1.8+
Use Spring Boot
Use Maven
Use JUnit and Mockito
All dependencies should be publicly available or properly included with the project and referenced within the POM
