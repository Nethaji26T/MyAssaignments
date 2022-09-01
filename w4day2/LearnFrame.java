package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {
		/*1_ Open Chrome
		2_ Load https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm
		3_ Click TryIt 
		4_ Click Cancel/ on the alert
		5_ Print the resulting text
		 Hint:
		-----
		Switch to the frame
		Then click Try It with xpath
		Switch to the alert
		Then perform accept / dismiss
		Get the text using id 
		Verify the text based on the action */
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
       
		Alert alert= driver.switchTo().alert();
		alert.dismiss();
		
		WebElement findElement = driver.findElement(By.id("demo"));
		System.out.println(findElement.getText());
		
		
	}

}
