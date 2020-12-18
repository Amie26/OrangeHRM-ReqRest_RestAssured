package in.reqres.userInfo;

import in.reqres.testbase.TestBaseClass;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetSingleUserTest extends TestBaseClass {

@Test
    public void getSingleUser() {

        Response response = given()
                .pathParam("id", 2)
                .when()
                .get("/api/users/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}