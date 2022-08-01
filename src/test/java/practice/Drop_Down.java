package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_Down {

	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement Dropp_Country=driver.findElement(By.xpath("//select[@name='country']"));
		Select sel=new Select(Dropp_Country);
	
		
		
		//Select by index
		sel.selectByIndex(5);
		Thread.sleep(5000);
		
		//Select by value
		sel.selectByValue("INDIA");
		Thread.sleep(5000);
		
		//Select by Visible text
		sel.selectByVisibleText("INDIA");
		
       	
		
		
	}

}
