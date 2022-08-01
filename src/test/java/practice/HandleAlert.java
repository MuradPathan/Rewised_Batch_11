package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlert {

	public static void main(String[] args) throws Exception {

		//Step 1) open browser "https://demo.guru99.com/test/delete_customer.php"
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		// Step 2) Enter customer ID
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
		
		// Step 3) Click on Submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		// Step 4) Verify text on alert 
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());        //Do you really want to delete this Customer?
		
		// Step 5) Click on OK button
		//alt.accept();     //click on OK button
		alt.dismiss();
		
		// Second Alert
//		Thread.sleep(2000);
//		System.out.println(alt.getText());
//		alt.accept();
		
		
		
		
	}

}
