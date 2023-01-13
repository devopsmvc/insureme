package com.hdfc.insureme;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@SpringBootTest
class InsuremeApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void testCreatePolicy() {
		Policy policy = new Policy(12345, "Mahesh", 98765);
		PolicyService pService = new PolicyService();
		assertEquals(policy.getPolicyID(), pService.generateDummyPolicy().getPolicyID());
	}
	
	@Test
	void testCreatePolicy1() {
		RestAssured.baseURI="http://65.2.123.255:8082/CreatePolicy";
		RequestSpecification httpRequest = RestAssured.given();
		Response response =httpRequest.request(Method.POST);
		System.out.println(response.getStatusCode());
		assertEquals(response.statusCode(), 200);
				
	}

	@Test
	void testGetEmployeeDetails() {
		RestAssured.baseURI="http://65.2.123.255:8082/ViewPolicy";
		RequestSpecification httpRequest = RestAssured.given();
		Response response =httpRequest.request(Method.GET,"/1");
		System.out.println(response.getStatusCode());
		assertEquals(response.statusCode(), 200);
				
	}
//	
//	@Test
//	void testUpdateEmployeeDetails() {
//		RestAssured.baseURI="http://13.127.141.134:8082/UpdatePolicy";
//		RequestSpecification httpRequest = RestAssured.given();
//		httpRequest.contentType(ContentType.JSON);
//	    httpRequest.body(new Policy(10, "Doe", 5555));
//		Response response =httpRequest.put("10");
//		System.out.println(response.getStatusCode());
//		assertEquals(response.statusCode(), 200);
//				
//	}
//
}
