package seleniumProgram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod_Study {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> ele = driver.findElements(By.tagName("p"));
for(WebElement e:ele) {
	System.out.println(e.getText());
}
System.out.println(ele.size());
	}

	
}
