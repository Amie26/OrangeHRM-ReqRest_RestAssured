package in.reqres.extractingResponseData;

import in.reqres.testbase.TestBaseClass;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class SearchJsonPath extends TestBaseClass {

   @BeforeClass
    public static void init (){
       RestAssured.baseURI = "https://reqres.in/";

   }


}
