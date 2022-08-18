package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		   driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesManager");
		 
		   driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		   driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		   
		   driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	       driver.findElement(By.xpath("//a[text()='Leads']")).click();
	       
	       driver.findElement(By.xpath("(//div[@class='frameSectionBody']//li)[3]")).click();
	       driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Tony");
	       driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	       
	       driver.findElement(By.linkText("19998")).click();
           Thread.sleep(2000);		

	}

}
