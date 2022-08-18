package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		    driver.findElement(By.id("username")).sendKeys("demosalesManager");
		    driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			driver.findElement(By.linkText("Leads")).click();
			
			driver.findElement(By.linkText("Create Lead")).click();
			
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testLeaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nethaji");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("thirunavukkarsu");
			
			WebElement Source = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select obt =new Select(Source);
			 obt.selectByValue("CATRQ_AUTOMOBILE");
			
			WebElement Source1 = driver.findElement(By.id("createLeadForm_industryEnumId"));
			Select obt1 = new Select(Source1);
			obt1.selectByIndex(5);
			
			WebElement Source2 = driver.findElement(By.id("createLeadForm_currencyUomId"));
			Select obt2 = new Select(Source2);
			obt2.selectByVisibleText("INR - Indian Rupee");
			
			String title =driver.getTitle();
			System.out.println(title);
			 
			driver.close();
			
			
			
	}

}
