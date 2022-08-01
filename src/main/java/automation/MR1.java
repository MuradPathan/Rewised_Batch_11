package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MR1 {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
	    WebDriver driver=new EdgeDriver();
	    driver.get("https://www.youtube.com/");
	    driver.manage().window().maximize();
	    
	    driver.close();
	    
	}

}
