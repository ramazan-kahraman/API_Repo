package test;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C02_Get_ResponseBilgileriAssertion {

    /*
            https://restfull-booker.herokuapp.com/booking/256884 url'ine
            bir GET request gonderdigimizde donen Response'un

            starus code'unun 200,
            ve content type'inin application/json; charset=utf-8,
            ve server isimli Header'in degerinin Cowboy,
            ve status Line'in HTTP/1.1 200 OK
            ve response suresinin 5 sn'den kısa oldugunu manuel olarak tets ediniz
     */

    @Test
    public void get01(){

        // 1-Gerekli olan URL ve BODy'i hazirla

        String url = "https://restful-booker.herokuapp.com/booking/282";

        // 2-Soruda isteniyorsa Expected Data hazirla

        // 3-Donen Response'i kaydet

        Response response= given().when().get(url);

        response.prettyPrint();

        // 4-Assertion

        response.
                then().
                assertThat().
                statusCode(200).
                contentType("application/json; charset=utf-8").
                header("Server", "Cowboy").
                statusLine("HTTP/1.1 200 OK");

    }
}
