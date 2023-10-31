package com.orgdemo1;

import org.testng.annotations.Test;

import   io.restassured.RestAssured;


import static  io.restassured.RestAssured.given;// for given import this one 

public class Demo2Test {
	
	
@Test
	public void shravs() {	
		RestAssured.baseURI="https://reqres.in";
		RestAssured.basePath="/api/users?page=2";
	given()	
	
	.when()
	.get()
	.then()
	.statusCode(200)
	.statusLine("HTTP/1.1 200 OK")
	.log().all();
	
		
		
	}
	
	
	
	

}
