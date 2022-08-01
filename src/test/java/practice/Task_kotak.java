package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_kotak {

	public static void main(String[] args) throws Exception {

		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://kotakcherry.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' Deposits ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h2[text()='Fixed deposit']")).click();
		
		
		
		
		
	}

}
