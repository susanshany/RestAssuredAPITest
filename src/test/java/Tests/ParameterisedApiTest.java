package Tests;

import Base.Base;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class ParameterisedApiTest {
    Base baseClass = new Base();

    @Test
    public void getUser() {

        //Verify 200 OK message is returned
        String response = given().when().get(baseClass.endpoint).then().assertThat()
                .statusCode(200).extract().response().asString();
        JsonPath js = new JsonPath(response);
        int count = js.getInt("name.size()");
        //Verify that there are 10 users in the results
        assert count == 10 : "Number of users are Ten";
        System.out.println("Number of users: " + count + " And status code: 200");


    }
}



 //@Test
//public void getUserById(){
  //String endpoint="https://jsonplaceholder.typicode.com/users";
//TC2: Verify GET User request by Id
//Verify 200 OK message is returned
/*var response=given().when().queryParam("id", 8).get(endpoint).then().log().body()
        .assertThat()
        .statusCode(200);*/
 /*       String response=given().when().queryParam("id", 8).get(baseClass.endpoint).then().assertThat()
                .statusCode(200).extract().response().asString();
 System.out.println(response);
JsonPath js=new JsonPath(response);
 String name= js.getString("name");

//Verify if user with id8 is Nicholas Runolfsdottir V
Assert.assertEquals(name,"[Nicholas Runolfsdottir V]");

}


//@Test
public void addUser(){
        Users user=new Users();
        user.setId("11");
        user.setName("APatricia Lebsack");
        user.setUsername("AKarianne");
        user.setEmail("AJulianne.OConner@kory.org");
        user.setAddress();
// TC3: Verify POST Users request
// Verify 201 Created message is returned
// Verify that the posted data are showing up in the result*/
//String endpoint="https://jsonplaceholder.typicode.com/users";*/
        /*String body="""
        {
             "id": 11,
             "name": "APatricia Lebsack",
             "username": "AKarianne",
             "email": "AJulianne.OConner@kory.org",
             "address": {
                 "street": "AHoeger Mall",
                 "suite": "AApt. 692",
                 "city": "ASouth Elvis",
                 "zipcode": "53919-4257",
                 "geo": {
                     "lat": "29.4572",
                     "lng": "-164.2990"
                 }
             },
             "phone": "493-170-9623 x156",
             "website": "akale.biz",
             "company": {
                 "name": "ARobel-Corkery",
                 "catchPhrase": "AMulti-tiered zero tolerance productivity",
                 "bs": "atransition cutting-edge web services"
             }
         }
         """;*/
 /*   Users response=given().expect().defaultParser(Parser.JSON).when().post(baseClass.endpoint).then()
            .assertThat()
            .statusCode(201).extract().response().as(Users.class);*/
   /* String response=given().body(body).when().post(baseClass.endpoint).then().assertThat()
            .statusCode(201).extract().response().asString();*/
/*var response=given().body(body).when().post(endpoint).then().assertThat()
.statusCode(201);
    response.log().body();*/
/*  System.out.println(response);
//JsonPath js=new JsonPath(response);
//String id= js.getString("id");
    String id= response.getId("id");


//Verify if user with id8 is Nicholas Runolfsdottir V
Assert.assertEquals(id,"11");




 }
}*/
