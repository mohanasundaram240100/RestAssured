package RestAssured_Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class BasicTests {
	
	public static void main (String[] args) {
		
		RestAssured.baseURI="https://reqres.in/api/users";
		
		
	}

}
