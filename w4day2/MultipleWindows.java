package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		 
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		Set<String> WindowHandles = driver.getWindowHandles();
		List<String> list=new ArrayList<String>(WindowHandles);
		
		//Get the size of available Windows
		System.out.println("no.of windows : "+list.size());
		
        //switch to last window & Get the Title of the Window
		driver.switchTo().window(list.get(2));
		System.out.println("title of the last window: "+driver.getTitle());
		
		//Close all the windows except last window
		driver.switchTo().window(list.get(0)).close();
		driver.switchTo().window(list.get(1)).close();
		driver.quit();
		
	}

}
