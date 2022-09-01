package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceCustomer {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Password#123");
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winList= new ArrayList<String>(windowHandles);
		driver.switchTo().window(winList.get(1));
		
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		System.out.println("Title of the redirecting page: "+driver.getTitle());
        driver.switchTo().window(winList.get(0));
        driver.quit();
		
			
		
	}

}
