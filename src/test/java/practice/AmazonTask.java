package practice;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class AmazonTask {

	public static void main(String[] args) throws Exception {

		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/ref=as_li_TF8&linkCode=ll2&tag=enin-edge-topsites-curate-ana-21&linkId=fbedcb44d04a4bae8eae32722a2f41c2&language=en_IN");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsungmobilephone");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		String parentwindAdd=driver.getWindowHandle();
		System.out.println(parentwindAdd);
		Set<String> allAddress=driver.getWindowHandles();
		System.out.println(allAddress);
		
        Iterator<String> it=allAddress.iterator();
        while(it.hasNext()) {
        	String ChildWinAdd=it.next();
        	if(!parentwindAdd.equals(ChildWinAdd)) {
        		driver.switchTo().window(ChildWinAdd);
        		Thread.sleep(3000);
        		
        		JavascriptExecutor js=(JavascriptExecutor) driver;
        		WebElement AddToCart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
        		
        		js.executeScript("arguments[0].scrollIntoView()", AddToCart);
        		AddToCart.click();
        		
        		Thread.sleep(10000);
        		
        		String RM=RandomString.make(5);
        		String path="C:\\Users\\mrpat\\eclipse-workspace\\ras_1\\screenshot";
        		TakesScreenshot ts=(TakesScreenshot) driver;
        		File source=ts.getScreenshotAs(OutputType.FILE);
        		File destn=new File(path+"//"+RM+".png");
        		FileUtils.copyFile(source, destn);
        		
        		Thread.sleep(9000);
        		
        		driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']")).click();
        		Thread.sleep(3000);
        	
        		WebElement Cart=driver.findElement(By.xpath("(//span[@class='nav-line-2'])[3]"));
        		
        		js.executeScript("arguments[0].scrollIntoView()", Cart);
        		Cart.click();
        		
        		Thread.sleep(6000);
        		
        		driver.findElement(By.xpath("//input[@value='Delete']")).click();
        		Thread.sleep(4000);
        		
        		String actualtitle=driver.getTitle();
        		System.out.println(actualtitle);
        		
        		
        		
        		Thread.sleep(7000);
        		
        		
        		TakesScreenshot ts1=(TakesScreenshot) driver;
        		File source1=ts1.getScreenshotAs(OutputType.FILE);
        		File destn1=new File(path+"//"+RM+".png");
        		FileUtils.copyFile(source1, destn1);
        		
        		Thread.sleep(7000);
        		
        	}
        	
        }
        
        driver.quit();
		
	}

}
