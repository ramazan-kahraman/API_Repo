package test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.internal.RealSystem;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class şlkişl {

/*
    https://restful-booker.herokuapp.com/booking/14018 url’ine
            bir GET request gonderdigimizde donen Response’un,
            status code’unun 200,
            ve content type’inin application-json,
            ve response body’sindeki
                    "firstname“in,"James",
                    ve "lastname“in, "Brown",
                    ve "totalprice“in, 111,
                    ve "depositpaid“in,true,
                    ve "additionalneeds“in,"Breakfast"
             oldugunu test edin
 */

    @Test
    public void get01(){

        String url="https://restful-booker.herokuapp.com/booking/10";

        Response response=given().when().get(url);

        response.prettyPrint();
        response.then().assertThat().statusCode(200).contentType(ContentType.JSON).
                body("firstname", equalTo("Sally"),
                        "lastname",equalTo("Jones"),
                       "totalprice",equalTo(819),
                        "depositpaid",equalTo(true),
                        "additionalneeds",equalTo("null"));

    }

}
