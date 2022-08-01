package TestNG;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataReader {

	@Test
	public void test_read() throws Exception {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String path="C:\\Users\\mrpat\\eclipse-workspace\\ras_1\\TestData\\Data.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		String textdata=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String textdata1=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(textdata);
		System.out.println(textdata1);
		
		WebElement Username=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement Password=driver.findElement(By.xpath("//input[@id='pass']"));
		
		Username.sendKeys(textdata);
		Password.sendKeys(textdata1);
		
	}
}
