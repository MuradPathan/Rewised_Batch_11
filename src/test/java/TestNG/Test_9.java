package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_9 {

	@Test
	public void P1() {
		
		//soft assert
		
		SoftAssert soft=new SoftAssert();
		System.out.println("User Name");
		System.out.println("Password");
		System.out.println("Login");
		String Expectedtitle="test";
		String Actualtitle="test1";
		
		soft.assertEquals(Actualtitle, Expectedtitle);
		System.out.println("Browser close");
		soft.assertAll();
		System.out.println("Open the browser");
	}
	
}
