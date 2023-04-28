package Tests;

import Base.Base;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Address;
import models.Company;
import models.Geo;
import models.Users;
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

    @Test
    public void getUserById() {
        String endpoint = "https://jsonplaceholder.typicode.com/users";
        //TC2: Verify GET User request by Id
        //Verify 200 OK message is returned
        String response = given().when().queryParam("id", 8).get(baseClass.endpoint).then().assertThat()
                .statusCode(200).extract().response().asString();
        System.out.println(response);
        JsonPath js = new JsonPath(response);
        String name = js.getString("name");
        name=name.substring(1, name.length() - 1);

        //Verify if user with id8 is Nicholas Runolfsdottir V
        Assert.assertEquals(name, "Nicholas Runolfsdottir V");

    }


@Test
public void addUser(){
        Users user=new Users();


        user.setId("11");
        user.setName("APatricia Lebsack");
        user.setUsername("AKarianne");
        user.setEmail("AJulianne.OConner@kory.org");
        user.setPhone("493-170-9623 x156");
        user.setWebsite("akale.biz");
        user.setStreet( "AHoeger Mall");
        user.setSuite("AApt. 692");
        user.setCity("ASouth Elvis");
        user.setZipcode( "53919-4257");
        user.setLat("29.4572");
        user.setLng("-164.2990");
        user.setName("ARobel-Corkery");
        user.setCatchPhrase("AMulti-tiered zero tolerance productivity");
        user.setBs("atransition cutting-edge web services");

        // TC3: Verify POST Users request
        // Verify 201 Created message is returned
        // Verify that the posted data are showing up in the result*/

        String response=given().body(user).when().post(baseClass.endpoint).then().assertThat()
            .statusCode(201).extract().response().asString();
        var res=given().body(user).when().post(baseClass.endpoint).then();
    System.out.println( res.log().body());


    JsonPath js=new JsonPath(response);
        String id= js.getString("id");
    System.out.println( id);
        //Verify if user with id8 is Nicholas Runolfsdottir V
        //Assert.assertEquals(id,user.getName());

 }
}
