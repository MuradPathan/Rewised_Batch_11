package ExcelData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestData__1 {

	WebDriver driver;
	@BeforeMethod
	public void BM() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Test1() throws Exception {
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		String text1=ExcelDataProvider.getstringData("Sheet1", 0, 0);
		email.sendKeys(text1);
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		String text2=ExcelDataProvider.getstringData("Sheet1", 0, 1);
		pass.sendKeys(text2);
		
	}
	
	@AfterMethod
	public void AM() {
		//driver.close();
	}
	
	
	
}
