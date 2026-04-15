package RestAssured_Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class StatuscodeValidation {

	public static void main(String[] args) {
		
		//Status code validation
		//200-OK
		//201-Created
		//204-No content
		//400-Bad request
		//401-Unauthorized
		//403-Forbidden
		//404-Not found
		//500-Internal server error
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given().queryParam(DEFAULT_BODY_ROOT_PATH, null)
		.when().get("/api/endpoint")
		.then().assertThat().statusCode(200);

	}

}
