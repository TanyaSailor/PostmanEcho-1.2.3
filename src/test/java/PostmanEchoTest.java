import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {


    @Test
    void shouldGet() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Have a good day!")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Have a good day!"))
        ;
    }

}