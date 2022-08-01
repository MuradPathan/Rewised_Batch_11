package Demo_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject.SignUP;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_SignUP {

	WebDriver driver;
	@Test
	public void test_2() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.manage().window().maximize();	
		
		SignUP signup=PageFactory.initElements(driver, SignUP.class);
		Thread.sleep(3000);
		
		
		signup.getText_email().sendKeys("muradcjhc@gmail.com");
		Thread.sleep(3000);
		signup.getText_name().sendKeys("pmr");
		
	}
	
	
	
	
	
	
	
}
