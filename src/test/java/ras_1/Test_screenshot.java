package ras_1;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_screenshot {

	public static void main(String[] args) throws  Exception {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();  
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);

        String rm=RandomString.make(3);		
		String path="C:\\Users\\mrpat\\eclipse-workspace\\ras_1\\screenshot";
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File(path+"//"+rm+".png");
		
		FileUtils.copyFile(src, destn);

		
		
		
		

	}

}
