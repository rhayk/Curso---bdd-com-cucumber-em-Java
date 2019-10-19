package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(name="txtUsername")
	private WebElement campoLogin;
	
	@FindBy(name="txtPassword")
	private WebElement campoPassword;
	
	@FindBy(name="Submit")
	private WebElement botaoEntrar;

	
	public void realizarLogin() {
		campoLogin.sendKeys("Admin");
		campoPassword.sendKeys("admin123");
		botaoEntrar.click();
		
	}
	
	@FindBy(name="txtPassword")
	public WebElement campoPassword2;

}
