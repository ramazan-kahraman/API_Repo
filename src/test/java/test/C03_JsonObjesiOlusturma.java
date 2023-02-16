package test;

import org.json.JSONObject;
import org.junit.Test;

public class C03_JsonObjesiOlusturma {

    /*
            Asagıdaki Json objesini olusturup konsolda yazdirin

          {
            "title":"Ahmet",
            "body":"Merhaba",
            "userId":1
          }

     */
    @Test
    public void jsonobje01(){

        JSONObject ilkJsonObje=new JSONObject();

        ilkJsonObje.put("title","Ahmet");
        ilkJsonObje.put("body","Merhaba");
        ilkJsonObje.put("UserId",1);

        System.out.println(ilkJsonObje);
    }

    @Test
    public void jsonObje02(){
/*
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
        JSONObject innerJsonObje=new JSONObject();

        innerJsonObje.put("checkin","2018-01-01");
        innerJsonObje.put("checkin","2019-01-01");

        JSONObject body=new JSONObject();

        body.put("firstname","Jim");
        body.put("additionalneeds","Breakfast");
        body.put( "bookingdates",innerJsonObje);
        body.put("totalprice",111);
        body.put("depositpaid",true);
        body.put("lastname","Brown");

        System.out.println(body);


    }
}
