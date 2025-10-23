package evaluation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatewindow {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hotstar.com/");
		driver.getTitle();
		driver.getCurrentUrl();
		driver.navigate().to("https://www.netflix.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		 String windowHandle = driver.getWindowHandle();
	        driver.switchTo().window(windowHandle);
	        driver.quit();
		
		
		
	}

}
