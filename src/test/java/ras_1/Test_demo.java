package ras_1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_demo {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.linkedin.com/?trk=msn-top-in");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("session_key")).sendKeys("muradpathan@gmial.com");
		driver.findElement(By.name("session_password")).sendKeys("9960134964");
		
		
		

	}

}
