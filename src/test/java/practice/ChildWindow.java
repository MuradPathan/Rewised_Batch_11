package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindow {

	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
		
	
		String ParentAdd=driver.getWindowHandle();
		System.out.println(ParentAdd);
		
		Set<String> AllAdd=driver.getWindowHandles();
		System.out.println(AllAdd);
		
		Iterator<String>it=AllAdd.iterator();
		while(it.hasNext()) {
			String ChildWindow=it.next();
			
			if(!ParentAdd.equals(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("hbvne354");
				driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
				
			}
			
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
