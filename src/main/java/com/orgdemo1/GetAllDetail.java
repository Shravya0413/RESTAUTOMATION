package com.orgdemo1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetAllDetail {
	
	@Test
	public void shravya() {	
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1/employee";
		RestAssured.basePath="/1";
	given()	
	
	.when()
	.get()
	.then()
	.statusCode(200)
	.statusLine("HTTP/1.1 200 OK")
	.log().all()
	.body("data.employee_name",equalTo("Tiger Nixon"))
	.body("data.employee_salary",equalTo(320800));
	
	
	}

}
