package test;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C01_Get_ApiSorgulama {

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

        // 1- Gonderecegimiz Request icin gerekli olan URL ve ihtiyacimiz varsa Body hazirla

        String url="https://restful-booker.herokuapp.com/booking/282";

        // 2- Eger soruda bize verilmisse Expected Data hazirla

        // 3- Bize donen Response'i Actual Data olarak kaydet

        Response response = given().when().get(url);

        response.prettyPrint();

        System.out.println("Status Code:" + response.getStatusCode());
        System.out.println("Content Type:" + response.getContentType());
        System.out.println("Server Header'inin Degeri:" + response.getHeader("Server"));
        System.out.println("Status Line:" + response.getStatusLine());
        System.out.println("Response Suresi:" + response.getTime());
        // 4- Expected Data ile Actual Data karsilastirmasi - ASSERTİON



    }
}
