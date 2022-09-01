package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindow {
	public static void main(String[] args)  {
		/*
		 * 1. Load https://www.irctc.co.in/
              2. Click on OK button in the dialog  
              3. Click on FLIGHTS link            
              4. Go to the Flights tab
              5. Print title of the child window and close the window
              6. close all windows
		 */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		
		
		
        Set<String> windowHandles = driver.getWindowHandles();  	
		List<String> winList= new ArrayList<String>(windowHandles);
		
		int size= winList.size();
		System.out.println("size: "+size);
		
		driver.switchTo().window(winList.get(size-1));
		System.out.println("title of child window: "+driver.getTitle());
		
		driver.close();
		
		driver.quit();
	}

}
