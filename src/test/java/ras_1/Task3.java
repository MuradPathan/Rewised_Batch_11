package ras_1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Task3 {

	public static void main(String[] args) {
		
		 
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Locator by name
		WebElement emailAddress=driver.findElement(By.name("email"));
		emailAddress.sendKeys("muradpathan@1123");
		
		//Locator by id
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("12234565");
		
		WebElement login=driver.findElement(By.name("login"));
		login.click();	
		
	}

}
