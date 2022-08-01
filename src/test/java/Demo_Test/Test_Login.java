package Demo_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject.LoginPOM;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Login {
	
	WebDriver driver;

	@Test
	public void test_1() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();	
		
		LoginPOM login=PageFactory.initElements(driver, LoginPOM.class);
		login.getText_email().sendKeys("Test");
		login.getText_password().sendKeys("123456");
		login.getBtn_login().click();
	}
	
	
	
	
}
