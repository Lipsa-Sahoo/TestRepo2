package com.ApiFramePractice1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class DummyBooksCall {

public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
	ObjectMapper objMap=new ObjectMapper();
	DummyBooks testBk=new DummyBooks();
	testBk.setId(123);
	testBk.setTitle("Api Testing");
	testBk.setAuthor("Mukesh");
	
	List<String> skillSet=new ArrayList<String>();
	skillSet.add("java");
	skillSet.add("selenium");
	testBk.setSkills(skillSet);
	
	Map<String, String> mapAuthor=new HashMap<String, String>();
	mapAuthor.put("firstName", "Lipsa");
	mapAuthor.put("LastName", "Sahoo");
	testBk.setAuthorDetails(mapAuthor);
	
	objMap.writeValue(new File("C:\\Users\\lisahoo\\OneDrive - Adobe Systems Incorporated\\Desktop\\wiki\\Book.json"), testBk);
	String jsonInString=objMap.writeValueAsString(testBk);
	System.out.println("*************************************");
	System.out.println(jsonInString);
	
	// prettyprint
	jsonInString=objMap.writerWithDefaultPrettyPrinter().writeValueAsString(testBk);
	System.out.println("*******************************");
	System.out.println(jsonInString);
	/*{
		  "id" : 123,
		  "title" : "Api Testing",
		  "author" : "Mukesh",
		  "skills" : [ "java", "selenium" ],
		  "authorDetails" : {
		    "firstName" : "Lipsa",
		    "LastName" : "Sahoo"
		  }
		}*/
}


}
