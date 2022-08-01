package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void m1() {
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();	
	}

	@Test
	public void m2() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("64654206");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("316454");
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void m3() {
		driver.close();
	}
	

}
