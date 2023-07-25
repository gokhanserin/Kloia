package APITest;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class createPet {

    String requestBody;
    long idCreated;

    @BeforeClass
    public void setUpClass() {
        baseURI = "https://petstore.swagger.io/v2";
    }


    @Test
    public void test1() {
        Map<String, Object> petMap = new HashMap<>();

        Map<String, Object> categoryMap = new HashMap<>();
        categoryMap.put("id", 0);
        categoryMap.put("name", "Pets");
        ArrayList photoUrlsArraylist = new ArrayList<>();
        photoUrlsArraylist.add(0, "scout.png");
        ArrayList tagsArraylist = new ArrayList<>();
        Map<String, Object> tagsMap = new HashMap<>();
        tagsMap.put("id", 0);
        tagsMap.put("name", "pet-dog");
        tagsArraylist.add(tagsMap);

        petMap.put("category", categoryMap);
        petMap.put("name", "Scout");
        petMap.put("photoUrls", photoUrlsArraylist);
        petMap.put("tags", tagsArraylist);
        petMap.put("status", "available");


        Response response = given().accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(petMap)
                .when().post("/pet");

        response.prettyPrint();

        assertEquals(response.statusCode(), 200);
        assertTrue(response.body().asString().contains("id"));
        assertEquals(response.contentType(), "application/json");
        assertFalse(response.header("date").isEmpty());

        JsonPath jsonPath = response.jsonPath();
        String name = jsonPath.getString("name");
        assertEquals(name, "Scout");

        idCreated = jsonPath.getLong("id");

        requestBody = response.body().asString();

        System.out.println("requestBody = " + requestBody);

    }

    @Test
    public void test2() {

        Response response2 = given().accept(ContentType.JSON)
                .pathParam("id", idCreated)
                .when().get("/pet/{id}");
        response2.prettyPrint();

        assertEquals(response2.statusCode(), 200);
        assertEquals(response2.contentType(),"application/json");
        assertFalse(response2.header("date").isEmpty());
        String retreivedBody = response2.body().asString();
        assertEquals(retreivedBody, requestBody);

    }

    @Test
    public void test3(){
        Response response3 = given().accept(ContentType.JSON)
                .pathParam("id", idCreated)
                .when().delete("/pet/{id}");
        response3.prettyPrint();

        assertEquals(response3.statusCode(), 200);
        assertEquals(response3.contentType(),"application/json");

        JsonPath jsonPath3 = response3.jsonPath();
        long message = jsonPath3.getLong("message");
        String type = jsonPath3.getString("type");
        System.out.println("message = " + message);
        System.out.println("idCreated = " + idCreated);
        assertEquals(message,idCreated);
        assertEquals(type,"unknown");


    }


}
