package ras_1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrooling {

	public static void main(String[] args) throws Exception {

		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Scrolling by Pixel
		
	    JavascriptExecutor js=(JavascriptExecutor) driver; 
//	    js.executeScript("window.scrollBy(0,500)", " ");
//	    Thread.sleep(3000);
//	    js.executeScript("window.scrollBy(0,-500)", " ");
		
		//Scrolling by finding element
		WebElement english_element=driver.findElement(By.xpath("//li[text()='English (UK)']"));
		js.executeScript("arguments[0].scrollIntoView()", english_element);
	
		
		
		
		
		
		
		
		
		
	}

}
