package Tests;
import Base.Base;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import static io.restassured.RestAssured.given;

public class ApiTest {
    Base baseClass=new Base();

    @Test
    public void getUser() {
        // TC1: Verify GET Users request


        //Verify 200 OK message is returned
        String response=given().when().get(baseClass.endpoint).then().assertThat()
                .statusCode(200).extract().response().asString();
        JsonPath js=new JsonPath(response);
        int count= js.getInt("name.size()");
        //Verify that there are 10 users in the results
        assert count == 10 :"Number of users are Ten";
        System.out.println("Number of users: "+count+ " And status code: 200");


    }


 @Test
public void getUserById(){
        //TC2: Verify GET User request by Id
        //Verify 200 OK message is returned
        String response=given().when().queryParam("id", 8).get(baseClass.endpoint).then().assertThat()
                .statusCode(200).extract().response().asString();

        //Verify if user with id8 is Nicholas Runolfsdottir V
        JsonPath js=new JsonPath(response);
        String name= js.getString("name");
        String id= js.getString("id");
        Assert.assertEquals(name,"[Nicholas Runolfsdottir V]");
        System.out.println("Name of user with id: "+id+ "is: "+name);

}


@Test
public void addUser(){

        // TC3: Verify POST Users request
        // Verify 201 Created message is returned

        String body="""
        {
             "id": "11","name": "APatricia Lebsack",
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
         """;
        //String body="{\"id\":\"11\",\"name\":\"APatricia Lebsack\",\"username\":\"AKarianne\",\"email\":\"AJulianne.OConner@kory.org\",\"address\":{\"street\":\"AHoeger Mall\",\"suite\":\"AApt. 692\",\"city\":\"ASouth Elvis\",\"zipcode\":\"53919-4257\",\"geo\":{\"lat\":\"29.4572\",\"lng\":\"-164.2990\"}},\"phone\":\"493-170-9623 x156\",\"website\":\"akale.biz\",\"company\":{\"name\":\"ARobel-Corkery\",\"catchPhrase\":\"AMulti-tiered zero tolerance productivity\",\"bs\":\"atransition cutting-edge web services\"}}";
        String response=given().body(body).when().post(baseClass.endpoint).then().assertThat()
            .statusCode(201).extract().response().asString();

        //Verify that the posted data are showing up in the result
        JsonPath js=new JsonPath(response);
        String id= js.getString("id");
        Assert.assertEquals(id,"11");
        System.out.println("User with id: "+id+ " is added to the list. And it's status code returned 201");


 }
}
