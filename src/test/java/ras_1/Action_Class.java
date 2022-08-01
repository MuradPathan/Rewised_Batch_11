package ras_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Class {

	public static void main(String[] args) {

		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// email----Test
		WebElement EmailAdd=driver.findElement(By.xpath("//input[@id='email']"));
		Actions act=new Actions(driver);
		act.keyDown(EmailAdd, Keys.SHIFT).sendKeys("test").keyUp(Keys.SHIFT).build().perform();
		
		
		// password
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		WebElement Pass=driver.findElement(By.xpath("//input[@type='password']"));
		Pass.click();
		
		act.keyDown(Pass, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		driver.findElement(By.xpath("//button[@name='login']")).sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
		
	}

}
