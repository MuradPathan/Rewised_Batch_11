package ras_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehandling {

	public static void main(String[] args){
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement Selenium=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		act.moveToElement(Selenium).click().build().perform();
		
		
		
		
		
		
		
		
		

	}

}
