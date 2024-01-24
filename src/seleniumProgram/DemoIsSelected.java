package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoIsSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(1000);
        WebElement gender= driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		
		boolean result = gender.isSelected();
		System.out.println("Before click "+result);
		gender.click();
		boolean result2 = gender.isSelected();
		System.out.println("After Click "+result2);
	}

}
