package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_8 {

	@Test
	public void A1() {
		
		System.out.println("User Name");
		System.out.println("Password");
		System.out.println("Login");
		String Expectedtitle="test";
		String Actualtitle="test1";
		 Assert.assertEquals(Actualtitle, Expectedtitle);
		 System.out.println("Browser close");
	}
	
}


