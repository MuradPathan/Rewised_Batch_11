package TestNG;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_3 extends BaseClass_1 {

	
	@Test(groups="Regression")
	public void m2() throws Exception {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("64654206");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("316454");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
