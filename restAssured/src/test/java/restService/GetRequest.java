package restService;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 5 important things need to know //
		// URI, header, body,httpverbs,end points //
		
		
		RestAssured.baseURI="https://www.google.com";
		
		RequestSpecification res=RestAssured.given();
		Response response=res.get();
		
		System.out.println(response.asString());
		
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getTime());
		
	

}
	
}
