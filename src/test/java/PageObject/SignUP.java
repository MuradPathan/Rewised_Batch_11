package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUP {

	@FindBy(how=How.XPATH,using="//input[@name='emailOrPhone']")private WebElement text_email;
	@FindBy(how=How.XPATH,using="//input[@name='fullName']")private WebElement text_name;
	public WebElement getText_email() {
		return text_email;
	}
	
	public WebElement getText_name() {
		return text_name;
	}
	
	
	
	
}
