package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.redbus.in/");
	    WebElement element = driver.findElement(By.xpath("//h1"));
	    System.out.println(element.getText());
	    driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Mumbai");
driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Pune");
driver.findElement(By.xpath("//button[@id='search_button']")).click();

	}

}
