package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng1 {

	WebDriver driver;
	@BeforeMethod
	public void M1() {
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
	}
	
	@Test
	public void M2() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("refgu@6542gmailcoon");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
	}
	
	@AfterMethod
	public void M3() {
		driver.close();
	}

}
