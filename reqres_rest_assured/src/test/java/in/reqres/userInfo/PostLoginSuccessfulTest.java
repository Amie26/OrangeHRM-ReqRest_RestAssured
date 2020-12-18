package in.reqres.userInfo;

import in.reqres.model.LoginPojo;
import in.reqres.testbase.TestBaseClass;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostLoginSuccessfulTest  extends TestBaseClass {
    @Test
    public void postLogin(){
        LoginPojo loginPojo=new LoginPojo();
        loginPojo.setEmail(("eve.holt@reqres.in"));
        loginPojo.setPassword("cityslicka");

        Response response= given()
                .header("Content-Type","application/Json")
                .when()
                .body(loginPojo)
                .post("/api/login");
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
