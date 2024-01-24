package screenshot_Study;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.io.FileHandler;

import javax.print.attribute.standard.Destination;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class Screenshot_Demo {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(Source);
//		String rs = RandomString.make(3);
		Date currentDate = new Date(); 
		System.out.println(currentDate);
		String screenshotfilename = currentDate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(screenshotfilename);
		//System.out.println(rs);
        File Destination = new File("C:\\Users\\91779\\OneDrive\\Desktop\\Screenshot_Study\\Sample"+screenshotfilename+".png");
        
        FileHandler.copy(Source, Destination);
        
        
        
        
        
//       WebElement Section = driver.findElement(By.id("1f3c25b0-bd75-4b7e-a03e-f082837ffc24"));
//       File src = Section.getScreenshotAs(OutputType.FILE);
//       File Output = new File("C:\\Users\\91779\\OneDrive\\Desktop\\Screenshot_Study\\Sample1"+src+".png");
//       FileHandler.copy(src, Output);
	}

}
