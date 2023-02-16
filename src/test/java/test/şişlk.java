package test;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

public class şişlk {
    /*
    {
    "firstName": "John",
    "lastName": "doe",
    "age": 26,
    "address": {
        "streetAddress": "naist street",
        "city": "Nara",
        "postalCode": "630-0192"
    },
    "phoneNumbers": [
        {
            "type": "iPhone",
            "number": "0123-4567-8888"
        },
        {
            "type": "home",
            "number": "0123-4567-8910"
        }
    ]
}

        JSON Path'ini olustur
     */


    @Test
    public void path01(){

        JSONObject evtelbilgi=new JSONObject();

        evtelbilgi.put("type", "home");
        evtelbilgi.put("number", "0123-4567-8910");

        JSONObject ceptelbilgi=new JSONObject();

        ceptelbilgi.put("type", "iPhone");
        ceptelbilgi.put("number", "0123-4567-8888");

        JSONObject adresbilgi=new JSONObject();

        adresbilgi.put("streetAddress", "naist street");
        adresbilgi.put("city", "Nara");
        adresbilgi.put("postalCode", "630-0192");

        JSONObject kisibilgi=new JSONObject();

        JSONArray phone=new JSONArray();
        phone.put(evtelbilgi);
        phone.put(ceptelbilgi);

        kisibilgi.put("firstName", "John");
        kisibilgi.put("lastName", "doe");
        kisibilgi.put("age", 26);
        kisibilgi.put("adress",adresbilgi);
        kisibilgi.put("phoneNumbers",phone);

        System.out.println(kisibilgi);


    }
}
