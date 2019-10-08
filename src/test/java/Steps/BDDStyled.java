package Steps;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class BDDStyled {

    public static void ViewCart(JSONObject search,String API_URL,int Status_Expected,int CountofJson){
        given().
                contentType(ContentType.JSON).
                body(search.toJSONString()).
                when().post(API_URL).
                then().
                statusCode(Status_Expected).
                and().body("Items.size()",is(CountofJson));
    }
    public static void Addtocart(JSONObject search, String API_URL, int Status_Expected){
        given().
                contentType(ContentType.JSON).
                body(search.toJSONString()).
                when().post(API_URL).
                then()
                .statusCode(Status_Expected);
    }
    public static void DeleteCart(JSONObject search,String API_URL,int Status_Expected){
        given().
                contentType(ContentType.JSON).
                body(search.toJSONString()).
                when().post(API_URL).
                then().
                assertThat()
                .statusCode(Status_Expected);
    }
}
