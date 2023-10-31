package com.orgdemo1;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Demo6Test {
	@Test
	public void getrequesttyepecode2() {
	 RestAssured.baseURI="https://jsonplaceholder.typicode.com";
	 RestAssured.basePath="/comments?postId=1";
	 given()
	 .when()
	 .get()
	 .then()
	 .statusCode(200)
	 .log().all()
	 .statusLine("HTTP/1.1 200 OK");
		

}
}
