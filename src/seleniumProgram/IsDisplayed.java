package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(1000);
		boolean result = driver.findElement(By.id("displayed-text")).isDisplayed();
		System.out.println("Displayed result is ="+ result);
		Thread.sleep(1000);
		driver.findElement(By.id("show-textbox")).click();
		result = driver.findElement(By.id("displayed-text")).isDisplayed();
		System.out.println("Displayed result is ="+ result);
		Thread.sleep(1000);
		driver.findElement(By.name("show-hide")).sendKeys("Amol Bharat Shinde");
		

	}

}
