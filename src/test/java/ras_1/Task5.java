package ras_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task5 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
        WebElement FirstName=driver.findElement(By.name("firstName"));
        FirstName.sendKeys("Murad");
        WebElement LastName=driver.findElement(By.name("lastName"));
        LastName.sendKeys("Pathan");
        WebElement PhoneNumber=driver.findElement(By.name("phone"));
        PhoneNumber.sendKeys("8668323987");
        WebElement EmailAddress=driver.findElement(By.name("userName"));
        EmailAddress.sendKeys("muradpathan1311@gmail.com");
        WebElement Address=driver.findElement(By.name("address1"));
        Address.sendKeys("At.Tawashi Tad TQ.Ausa Dist.Latur");
        WebElement City=driver.findElement(By.name("city"));
        City.sendKeys("Ausa");
        WebElement State=driver.findElement(By.name("state"));
        State.sendKeys("Maharashtra");
        WebElement PostalCode=driver.findElement(By.name("postalCode"));
        PostalCode.sendKeys("413520");
        WebElement Country=driver.findElement(By.xpath("//select[@name='country']"));
        Country.sendKeys("INDIA");		
        WebElement UserName=driver.findElement(By.id("email"));
        UserName.sendKeys("Murad");
        WebElement Password=driver.findElement(By.name("password"));
        Password.sendKeys("123456");
        WebElement ConfirmPassword=driver.findElement(By.name("confirmPassword"));
        ConfirmPassword.sendKeys("123456");
        Thread.sleep(3000);
        WebElement Login=driver.findElement(By.name("submit"));
        Login.click();
        WebElement SignIn=driver.findElement(By.xpath("//a[text()=' sign-in ']"));
        SignIn.click();
   
	}

}
