package evaluation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.className("email-input")).sendKeys("arya");
		driver.findElement(By.className("form-control")).sendKeys("1285556");
		driver.findElement(By.xpath("//button[@name='proceed']")).click();
		// driver.quit();
}
}
