package pom_Use;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Inventory {

	@FindBy(xpath = "(//button[text()='ADD TO CART'])[2]")private WebElement addtocart;
	public Inventory(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void clickAddToCart() {
		addtocart.click();
	}
	
	
}
