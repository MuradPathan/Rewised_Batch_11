package ras_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Attribute {

	public static void main(String[] args) throws Exception {
       
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement CreateAccount=driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]"));
		CreateAccount.click();
		Thread.sleep(10000);
		WebElement firstname=driver.findElement(By.name("firstname"));
		firstname.sendKeys("murad");
		Thread.sleep(10000);
		WebElement Surname =driver.findElement(By.xpath("//input[@name='lastname']"));
	    Surname.sendKeys("pathan");
	    Thread.sleep(10000);
	    WebElement emailaddress =driver.findElement(By.xpath("//input[@name='reg_email__']"));
	    emailaddress.sendKeys("pathanmurad10230@gmail.com");
	    Thread.sleep(10000);
	    WebElement newpassword =driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	    newpassword.sendKeys("pathan@2133");
	    Thread.sleep(10000);
		
		WebElement Gender=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		Gender.click();
		
		
		
	}

}
