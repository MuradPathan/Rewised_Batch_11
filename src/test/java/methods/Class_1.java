package methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import net.bytebuddy.utility.RandomString;

public class Class_1 {
	
	       
	public static void get_capture(WebDriver driver) throws IOException {
		
		String rm=RandomString.make(3);		
		String path="C:\\Users\\mrpat\\eclipse-workspace\\ras_1\\screenshot";
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File(path+"//"+rm+".png");
		FileUtils.copyFile(src, destn);
	}
	
	public static void main(String[] args) {

	}

}
