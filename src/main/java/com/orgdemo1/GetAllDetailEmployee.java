package com.orgdemo1;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllDetailEmployee {
	
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
	
	//.body("data.employee_name",equalTo("Tiger Nixon"))
	//.body("data.employee_salary",equalTo(320800));
	
	
	

}
}
