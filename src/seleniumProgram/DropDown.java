package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Click on Sign-up button   
				driver.findElement(By.linkText("//a[contains(roll='button')]")).click();
				Thread.sleep(1000);
				
	
				
				WebElement day = driver.findElement(By.id("day"));

				Select sday = new Select(day);
				boolean days = sday.isMultiple();  
				System.out.println("Can we select multiple days? "+days);
				sday.selectByIndex(1);   //15
				
				WebElement month = driver.findElement(By.id("month"));
				Select smonth =new Select(month);
				boolean months = smonth.isMultiple();
				System.out.println("Can we select multiple months?  "+months);
				smonth.selectByValue("10");
				
				WebElement year = driver.findElement(By.id("year"));
				Select syear = new Select(year);
				boolean years = syear.isMultiple();
				System.out.println("Can we select multiple years? "+years);
				syear.selectByVisibleText("1991");
				

	}

}
