package pom_Use;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_withoutPageFactory {
	@FindBy(id = "user-name")
	private WebElement userName;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "login-button")
	private WebElement loginBtn;
	@FindBy(xpath = "//h3")
	private WebElement errormsg;

	POM_withoutPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void enterUserName(String uname) {
		userName.sendKeys(uname);
	}

	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickLoginButton() {
		loginBtn.click();
	}

	public boolean displayErrorMsg() {
		try {return errormsg.isDisplayed();
			
		} catch (Exception e) {
			return false;
			
		}
		
	}

}
