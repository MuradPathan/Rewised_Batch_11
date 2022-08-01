package practice;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Facebook {

	public static void main(String[] args) throws IOException, Exception {

		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("grhngv");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("354136");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		Thread.sleep(5000);
		String rm2=RandomString.make(3);
		String path="C:\\Users\\mrpat\\eclipse-workspace\\ras_1\\screenshot";
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src2=ts.getScreenshotAs(OutputType.FILE);
		File destn2=new File(path+"//"+rm2+".png");
		
        FileUtils.copyFile(src2, destn2);

		
		
		

		
		
		
		
		
		
		
	}

}
