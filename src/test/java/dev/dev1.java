package dev;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Ignore;
import org.testng.annotations.Test;


public class dev1 {
//@Ignore	
//@Test
	    public void getusers() {
	    	//HashMap mp=new HashMap();
	        //mp.put("mobile number", "9039838050");
	        //mp.put("username", "Ektaji");

	        given()
	       //.body(mp)

	        .when()
	            .get("https://reqres.in//api/users/2")
	        .then();
	            
	    }
@Test
 public void getuser()
 {
	 
	 given()
	 
	 .when()
	 .get("https://reqres.in/api/users/2")
	 
	 .then();
 }
	


}
