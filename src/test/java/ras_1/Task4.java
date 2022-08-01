package ras_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Task4 {

	public static void main(String[] args)throws Exception {
          
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		
		//x path by attribute.
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("murad");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9960412320");
		WebElement Login=driver.findElement(By.xpath("//div[text()='Log In']"));
		
		if(Login.isEnabled()==true) {
			
			Login.click();
		}else {
			
			System.out.println("Login button is disable");
			
		}
	}

}
