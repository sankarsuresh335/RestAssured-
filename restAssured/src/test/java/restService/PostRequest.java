package restService;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="http://139.59.91.96:3000";
		
		RequestSpecification request=RestAssured.given();
		
		Header header = new Header("Content-Type", "application/json");
		
		request.header(header);
		
		request.body("{\r\n"
				+ "\"email\": \"jatinvsharma@gmail.com\",\r\n"
				+ "\"password\": \"123123123\"\r\n"
				+ "}");
		
		Response response=request.post("/user/signin");
		
		System.out.println( response.asString());
		
		System.out.println("stsus code" + response.getStatusCode());
		
		
		
		
		
		
		
				
		
	}

}
