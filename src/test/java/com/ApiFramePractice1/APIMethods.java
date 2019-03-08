package com.ApiFramePractice1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIMethods {

	public static Response GetCall(RequestSpecification req)
	{
		Response res=req.spec(req).get();
		return res;
		
	}
}
