package ras_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_Drag {

	public static void main(String[] args) {

		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement target=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement src1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement target1=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		
		act.dragAndDrop(src, target).build().perform();
		act.dragAndDrop(src1, target1).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
