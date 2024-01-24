package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelceted {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(1000);
//        WebElement gender= driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
//		
//		boolean result = gender.isSelected();
//		System.out.println("Before click "+result);
//		gender.click();
		
		
		WebElement MaleGender = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		boolean result = MaleGender.isSelected();
		System.out.println("Gender Selection status is "+ result);
		MaleGender.click();
		Thread.sleep(500);
		boolean result1 = MaleGender.isSelected();
		System.out.println("Gender selection status is "+ result1);
		
	}

}
