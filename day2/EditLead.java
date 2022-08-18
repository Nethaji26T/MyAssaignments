package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("StarkIndustries");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='20093']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).clear();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Tony");
		 
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).clear();
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Stark");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		
	}

}
