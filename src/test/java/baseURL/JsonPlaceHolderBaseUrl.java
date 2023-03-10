package baseURL;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import org.junit.runner.Request;

public class JsonPlaceHolderBaseUrl {

    protected RequestSpecification specJsonPlace;

    @Before
    public void setUp(){

        specJsonPlace = new RequestSpecBuilder().
                        setBaseUri("https://jsonplaceholder.typicode.com").
                        build();
    }

}
