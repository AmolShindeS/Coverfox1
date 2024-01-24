package seleniumProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WeekendMock {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Create new account")).click();
		// Thread.sleep(2000);
		
		
		WebElement day = driver.findElement(By.cssSelector("#day"));
		Select sday = new Select(day);
		sday.selectByValue("1");
		
		WebElement month = driver.findElement(By.cssSelector("#month"));
		Select smonth =new Select(month);
		smonth.selectByValue("10");
		
		WebElement year = driver.findElement(By.cssSelector("#year"));
		Select syear = new Select(year);
		syear.selectByValue("1991");

	}

}
