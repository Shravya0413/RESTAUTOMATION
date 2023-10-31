package com.orgdemo1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;


public class Resources {

	
	@Test
	public void allresources() {
		RestAssured.baseURI = "https://reqres.in";
		RestAssured.basePath="/api/unknown";
		 
		 Response res = given()
		
		.when()
		
		.get()
		
		
		.then()
		.log().all()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.body("data[2].name",equalTo("true red"))
		.body("data[5].color",equalTo("#53B0AE"))
		.body("data[3].year", equalTo(2003))
		.body("data.name",hasItems("aqua sky","tigerlily","blue turquoise","cerulean"))
		.extract().response();
		
		System.out.println(res.asString());
		
		
		
		
		
		
				
		
		
		
		
	}
}
