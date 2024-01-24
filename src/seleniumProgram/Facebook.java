package seleniumProgram;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		//driver.manage().window().getSize();
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(1000);
		// screen size
		
		Dimension d=new Dimension(600, 700);
		driver.manage().window().setSize(d);
		
		
	}

	}
