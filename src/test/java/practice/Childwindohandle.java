package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Childwindohandle {

	public static void main(String[] args) {

		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();

		String parentwindAdd=driver.getWindowHandle();
		System.out.println(parentwindAdd);

		Set<String> allAddress=driver.getWindowHandles();
		System.out.println(allAddress);
	
		Iterator<String> it=allAddress.iterator();
        while(it.hasNext()) {
        	String childwindowAddress=it.next();
        	
        	if(!parentwindAdd.equals(childwindowAddress)){
        		driver.switchTo().window(childwindowAddress);
        	    driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("123456");
        	}
        }
        
		
	}

}
