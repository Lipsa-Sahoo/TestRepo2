package com.ApiFramePractice1;


import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;


public class TestBase {
	RequestSpecification req;
	@BeforeSuite
	public void SetUp() 
	{
		req=RestAssured.given();
		req.baseUri(AppContext.baseUri);
		req.basePath(AppContext.basePath);
		req.port(Integer.parseInt(AppContext.portNo));
	}
	@BeforeMethod
	public void RequestHeaders()
	{
		
		HashMap<String, String> hmap = new HashMap<String, String>();
		hmap.put("Content-Type", "application/json");

		for (Map.Entry<String, String> m : hmap.entrySet()) {
			req.header(m.getKey(), m.getValue());
		}
	}
	@AfterMethod
	public void TearDown()
	{
		
	}
	
	@AfterSuite
	public void cleanUp() 
	{
		
	}

}
