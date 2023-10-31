package com.orgdemo1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

import javax.annotation.meta.When;
public class Demo3Test {

@Test
 public void ravi() {
	 
	 RestAssured.baseURI = "https://reqres.in";
	 RestAssured.basePath ="/api/users?page=2";
	 given()
	.when()
	.get()
	.then()
	.statusCode(200)
	 .log().all()
	 .statusLine("HTTP/1.1 200 OK");
	 
	 
	 
	 
 }
 }