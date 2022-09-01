package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		//Click on Widget of 'From Contact' 
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		
		Set<String> WindowHandles=driver.getWindowHandles();
		List<String> windowList= new ArrayList<String>(WindowHandles);
		driver.switchTo().window(windowList.get(1));
		//Click on First Resulting Contact 
		driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
		
		driver.switchTo().window(windowList.get(0));
		
		//Click on Widget of 'To Contact'
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		 
		Set<String> WindowHandles1= driver.getWindowHandles();
		List<String> WinList= new ArrayList<String>(WindowHandles1);
		driver.switchTo().window(WinList.get(1));
		//Click on Second Resulting Contact
		driver.findElement(By.xpath("//a[text()='DemoLBCust']")).click();
		
		driver.switchTo().window(WinList.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		Alert alert = driver.switchTo().alert();
        alert.accept();
        
        //Verify the title of the page
        System.out.println("page Title: "+driver.getTitle());
        driver.quit();
        
		
		
	}

}
