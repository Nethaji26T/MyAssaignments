package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFaceBook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pablo");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Escobar");
		
		driver.findElement(By.xpath("(//div[contains(@class,'uiSticky')]/input)[3]")).sendKeys("pablo.myway@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'uiSticky')]/input)[4]")).sendKeys("pablo.myway@gmail.com");
		
		driver.findElement(By.xpath("(//div[contains(@class,'uiSticky')]/input)[5]")).sendKeys("New password");
		
		WebElement source=driver.findElement(By.xpath("//select[@id='day']"));
        Select obj= new Select(source);
        obj.selectByIndex(0);
        
        WebElement source1 =driver.findElement(By.xpath("//select[@id='month']"));
        Select obj1= new Select(source1);
        obj1.selectByIndex(11);
         
        WebElement source2= driver.findElement(By.xpath("//select[@id='year']"));
        Select obj2= new Select(source2);
        obj2.selectByValue("1949");
        
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        
	}

}
