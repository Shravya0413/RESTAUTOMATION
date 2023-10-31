package com.orgdemo1;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Demo4Test {
	@Test
	public void getrequesttyepecode() {
	 RestAssured.baseURI="https://jsonplaceholder.typicode.com";
	 RestAssured.basePath="/posts";
	 given()
	 .when()
	 .get()
	 .then()
	 .statusCode(200)
	 .log().all()
	 .statusLine("HTTP/1.1 200 OK");
		
	}

}
