package test;

import org.json.JSONObject;
import org.junit.Test;

public class kldc {

    /*
    Asagidaki JSON Objesini olusturup konsolda yazdirin.
{
     "firstname":"Jim",
     "additionalneeds":"Breakfast",
     "bookingdates":{
             "checkin":"2018-01-01",
             "checkout":"2019-01-01"
	                },
      "totalprice":111,
      "depositpaid":true,
      "lastname":"Brown"
 }
     */
    @Test
    public void test(){
        JSONObject innerObj=new JSONObject();

        innerObj.put("checkin","2018-01-01");
        innerObj.put("checkout","2019-01-01");

        JSONObject disObje=new JSONObject();

        disObje.put("firstname","Jim");
        disObje.put("additionalneeds","Breakfast");
        disObje.put("bookingdates",innerObj);
        disObje.put("totalprice",111);
        disObje.put("depositpaid",true);
        disObje.put("lastname","Brown");

        System.out.println(disObje);

    }

}
