package in.reqres.userInfo;

import in.reqres.model.UserPojo;
import in.reqres.testbase.TestBaseClass;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostCreateUserTest extends TestBaseClass {

    @Test
    public void createUser() {

        UserPojo userPojo = new UserPojo();
        userPojo.setFirstName("morphus");
        userPojo.setJob("leader");

        Response response = given()
                .header("Content-Type", "application/Json")
                .when()
                .body(userPojo)
                .post("/api/users");
        response.then().statusCode(201);
        response.prettyPrint();


    }

    }
