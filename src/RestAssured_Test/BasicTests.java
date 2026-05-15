package RestAssured_Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class BasicTests {
	
	public static void main (String[] args) {
		
		String response= given().formParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com").formParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
		.formParam("grant_type", "client_credentials").formParam("scope", "trust").when().post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").toString();
		
		System.out.println(response);
		
		JsonPath js = new JsonPath(response);
		String accessToken= js.getString("access_token");
		
	
		String CourseResponse= given().queryParam(accessToken).when().get("https://rahulshettyacademy.com/oauthapi/getCourseDetails").toString();
		System.out.println(CourseResponse);
	
		
		
		
	}

}
