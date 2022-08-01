package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPOM {

	//Encapsulation
	
	@FindBy(how=How.XPATH,using="//input[@id='email']") private WebElement text_email;
	@FindBy(how=How.XPATH,using="//input[@id='pass']")private WebElement text_password;
	@FindBy(how=How.XPATH,using="//button[@name='login']")private WebElement btn_login;
	public WebElement getText_email() {
		return text_email;
	}
	
	public WebElement getText_password() {
		return text_password;
	}
	
	public WebElement getBtn_login() {
		return btn_login;
	}
	
}
