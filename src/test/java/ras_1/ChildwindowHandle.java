package ras_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildwindowHandle {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		String ParentWindowAddress=driver.getWindowHandle();
		System.out.println(ParentWindowAddress);
		Set<String> AllAddress=driver.getWindowHandles();
		System.out.println(AllAddress);
		
		Iterator<String> it=AllAddress.iterator();
		while(it.hasNext()) {
			String ChildWindowAddress=it.next();
			if(!ParentWindowAddress.equals(ChildWindowAddress)){
				driver.switchTo().window(ChildWindowAddress);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("1232456"); 
			}
		}
		
		
	}

}
