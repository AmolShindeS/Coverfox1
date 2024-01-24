package seleniumProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Class {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/watch?v=w5qvWgJyXug");
	driver.manage().window().maximize();
	}

}
