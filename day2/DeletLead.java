package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeletLead {

	public static void main(String[] args) throws InterruptedException {
	     WebDriverManager.chromedriver().setup();
	     ChromeDriver driver= new ChromeDriver();
	     driver.get("http://leaftaps.com/opentaps/control/main");
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	     driver.manage().window().maximize();
	     
	      
	     driver.findElement(By.xpath("(//input[@class='inputLogin'])[1]")).sendKeys("demosalesManager");
	     driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
	     driver.findElement(By.xpath("(//form[@id='login']/p)[3]")).click();
	     
	     driver.findElement(By.partialLinkText("CRM/SFA")).click();
	     driver.findElement(By.linkText("Leads")).click();
	     driver.findElement(By.xpath("(//ul[@class='shortcuts']/li)[3]")).click();
	     
	     driver.findElement(By.xpath("//span[text()='Email']")).click();
	     driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("nethaji24@gmail.com");
	     driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	     
	     Thread.sleep(3000);
	     
	     driver.findElement(By.xpath("//a[text()='19996']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[text()='Delete']")).click();
	     driver.findElement(By.xpath("(//ul[@class='shortcuts']/li)[3]")).click();
	     Thread.sleep(6000);
	     driver.findElement(By.xpath("(//label[text()='Lead ID:']/following::input)[1]")).sendKeys("19996");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	     Thread.sleep(2000);
	     WebElement where=driver.findElement(By.xpath("//div[text()='No records to display']"));
	     Thread.sleep(2000);
	     String text = where.getText();
	     System.out.println(text);
	     
	     driver.close();
	}

}
