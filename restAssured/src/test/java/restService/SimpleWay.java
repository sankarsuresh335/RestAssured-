package restService;

import static io.restassured.RestAssured .*;

import io.restassured.response.Response;

public class SimpleWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		baseURI="http://139.59.91.96:3000";
		Response response=given().header("Content-Type", "application/json").body("{\r\n"
				+ "\"email\": \"jatinvsharma@gmail.com\",\r\n"
				+ "\"password\": \"123123123\"\r\n"
				+ "}").post("/user/signin");
		
		System.out.println(response.asString());
		
		System.out.println(response.getStatusCode());

	}

}
