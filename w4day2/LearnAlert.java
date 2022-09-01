package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {
	public static void main(String[] args) {
		/*Lauch the url https://www.leafground.com/alert.xhtml
			Click the button under Prompt Dialog
			Handle the Alert either accept or Dismiss
			Hint: Before accept/dismiss use senkeys to the alertbox
			Verify it */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("yes, i'm here" );
		alert.accept();
		
		String AlertText=driver.findElement(By.xpath("//span[contains(text(),'User entered ')]")).getText();
		System.out.println(AlertText);
		
		
		
		
		
		
	}

}
