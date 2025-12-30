package api;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetUsersApiTest {

    @Test
    public void getUsersTest() {
        RestAssured.baseURI = "https://reqres.in/api";

        given()
        .when()
            .get("/users?page=2")
        .then()
            .statusCode(200)
            .body("data", notNullValue());
    }
}
