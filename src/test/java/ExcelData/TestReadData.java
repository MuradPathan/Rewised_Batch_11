package ExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestReadData {

	WebDriver driver;
	
	@BeforeMethod
	public void BM() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test_1() throws Exception{
		
		String path="C:\\Users\\mrpat\\eclipse-workspace\\ras_1\\TestData\\Data.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		String text1=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(text1);
		String test2=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(test2);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(text1);
		WebElement Password=driver.findElement(By.xpath("//input[@id='pass']"));
		Password.sendKeys(test2);
		
	}
	
	@AfterMethod
	public void AM() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	
}
