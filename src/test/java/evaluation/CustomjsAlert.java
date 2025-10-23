package evaluation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomjsAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://sweetalert2.github.io/");
		//Alert alert=  driver.switchTo().alert();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Show normal alert']")).click();
		
		Thread.sleep(2000);
		
		//Switch to alert
		Alert alert =driver.switchTo().alert();
		System.out.println("Alert text"+ alert.getText());
		
		//Accept alert
		alert.accept();
		System.out.println("Alert accepted");
		alert.dismiss();
		System.out.println("Alert dismissed");
	}
		
		
	}


