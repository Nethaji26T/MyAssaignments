package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main"); 
		
		   driver.manage().window().maximize();
		 
		   driver.findElement(By.xpath("//input[@id='username' and @type='password']")).sendKeys("demosalesManager");
		 
		   driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		   driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		   
		   driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		   String title=driver.getTitle();
		   System.out.println(title);
		   
	       driver.findElement(By.xpath("//a[text()='Leads']")).click();
	       String title1=driver.getTitle();
	       System.out.println(title1);
	       
	       driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	       String title2=driver.getTitle();
	       System.out.println(title2);
	       
	       driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TestLeaf");
	       driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Nethaji");
	       driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Thirunavukkarasu");
	
           driver.findElement(By.xpath("//input[@name='submitButton']")).click();
           String title3=driver.getTitle();
	       System.out.println(title3);
	       
	        
	       driver.close();
	
	
	}

}
