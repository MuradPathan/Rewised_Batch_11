package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	
	WebDriver driver;
	
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void BM(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();	
	}
	
	@AfterMethod
	public void AM() {
		driver.close();
	}
}
