package com.ApiFramePractice1;

public interface AppContext {
	
	public static final String baseUri=GetData.GetDataFromProprties("baseUri");
	public static final String portNo=GetData.GetDataFromProprties("port");
	public static final String basePath=GetData.GetDataFromProprties("basepath");
}
