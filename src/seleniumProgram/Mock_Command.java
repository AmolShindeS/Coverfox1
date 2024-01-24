package seleniumProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock_Command {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// web driver is interface and chromedriver is child API
		driver.get("https://www.w3schools.com/");
		// for opening default screen
		driver.manage().window().maximize();
		// for maximize displayed default screen
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		// for display full screen
		Thread.sleep(2000);
		driver.manage().window().minimize();
		// for minimize displayed screen/ Focused Tab
		Thread.sleep(2000);
//		driver.close();

		driver.navigate().to("https://www.youtube.com/");
		// for change required web page
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		// for refresh the focused Tab
		String s1 = driver.getTitle();
		// for opening page title displayed on URL
		System.out.println(s1);
		String s2 = driver.getPageSource();
		// for opening page source code data
		System.out.println(s2);

	}

}
