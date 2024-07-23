package com.sgtesting.api.restassured;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class User {
	public static String user_id=null;

	@Test(priority=1)
	public void createUser()
	{
		try {
			RestAssured.baseURI="http://localhost:8081/springboot-sgsoftwaretestinginstitute-sgtesting/users";
			RequestSpecification httpRequest=RestAssured.given();
			
			Map<String,String> obj=new HashMap<String,String>();
			obj.put("address", "RPC Layout");
			obj.put("emailId", "demo1@gmail.com");
			obj.put("firstName", "harigreat");
			obj.put("lastName", "lokare");
			obj.put("phoneNumber", "91080151815");
			obj.put("stateName", "Karnataka");
			obj.put("userRole", "Automation engineer");
			obj.put("zipcode", "560040");
			httpRequest
			.header("Content-Type","application/json");
			httpRequest.body(obj);
			
			Response response=httpRequest.post();
			String content=response.asString();
			System.out.println(content);
			
			JsonPath jpath=response.jsonPath();
			user_id=jpath.getString("id");
			System.out.println("user_id:"+user_id);
						
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void getUser()
	{
		try {
			RestAssured.baseURI="http://localhost:8081/springboot-sgsoftwaretestinginstitute-sgtesting/users/"+user_id;
			RequestSpecification httpRequest=RestAssured.given();
			
			httpRequest.header("Content-Type","application/json");
			
			Response response=httpRequest.get();
			String content=response.asString();
			System.out.println(content);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	public void deleteUser()
	{
		try {
			RestAssured.baseURI="http://localhost:8081/springboot-sgsoftwaretestinginstitute-sgtesting/users/"+user_id;
			RequestSpecification httpRequest=RestAssured.given();
			
			httpRequest.header("Content-Type","application/json");
			
			Response response=httpRequest.delete();
			String content=response.asString();
			System.out.println(content);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}