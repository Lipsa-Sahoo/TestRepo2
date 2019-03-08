package com.ApiFramePractice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetData {
	 
	public static String GetDataFromProprties(String key)
	{
		FileInputStream fis;
		Properties prop = null;
		try {
			fis = new FileInputStream("C:\\Users\\lisahoo\\Desktop\\AEM walden Ref docs\\eclipseWorkspace\\MyApiFrameworkTest1\\src\\main\\resources\\config.properties");
			prop= new Properties();
			prop.load(fis);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return prop.getProperty(key);
		}

}
