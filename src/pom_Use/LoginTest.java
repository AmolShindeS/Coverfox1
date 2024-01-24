package pom_Use;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		String usernamearray[]= {
				"standard_user",
				"locked_out_user",
				"problem_user",
				"performance_glitch_user"	
		};
		for(int i=0;i<usernamearray.length;i++) {
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/v1/");
		POM_withoutPageFactory p1 = new POM_withoutPageFactory(driver);
		p1.enterUserName(usernamearray[i]);
		p1.enterPassword("secret_sauce");
		p1.clickLoginButton();
        boolean Result = p1.displayErrorMsg();
        if(Result) {
        	System.out.println("User is not able to login "+ usernamearray[i]);
        }
        else {
        	System.out.println("User is logged In "+ usernamearray[i]);
        	
        }
        driver.quit();
		}
        
	}

}
