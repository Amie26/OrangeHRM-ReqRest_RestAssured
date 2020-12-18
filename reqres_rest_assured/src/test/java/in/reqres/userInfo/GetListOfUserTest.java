package in.reqres.userInfo;

import in.reqres.testbase.TestBaseClass;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetListOfUserTest extends TestBaseClass {

    @Test
    public void getRecord (){
        Response response = given()
                .when()
                .get("/api/users");
                response.then().statusCode(200);
        response.prettyPrint();


    }

}
