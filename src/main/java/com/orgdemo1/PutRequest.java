package com.orgdemo1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

import java.util.HashMap;

public class PutRequest {
	@Test
	public void putdemo() {
		RestAssured.baseURI ="https://reqres.in/";
		RestAssured.basePath="api/users/2";
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("Neha", "doctor");
		map.put("shravs", "engineer");
		map.put("Maduri", "software");
		
		given()
		.contentType("application/json")
		.body(map)
		
		.when()
		.put()
		
		
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.log().all();

}
}