package dev;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;


public class aayodhya {
@Test	
public void sendotp()
{
	HashMap mp=new HashMap();
	mp.put("mobile number","9039838050");
	mp.put("username","Ektaji");
	given()
	.body(mp)
	
	.when()
	.get("https://ishtadev.intelliatech.in/api/sendOtp")
	
	.then()
	.statusCode(200);
}
}
