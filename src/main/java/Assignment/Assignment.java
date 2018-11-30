package Assignment;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class Assignment 
{

	@Test
	
	public void testSearch()
	{
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		
		driver.findElement(By.linkText("Add Tariff Plan")).click();

		
		driver.findElement(By.id("rental1")).sendKeys("1000");
		driver.findElement(By.id("local_minutes")).sendKeys("1000");
		driver.findElement(By.id("inter_minutes")).sendKeys("1000");
		driver.findElement(By.id("sms_pack")).sendKeys("100");
		driver.findElement(By.id("minutes_charges")).sendKeys("5");
		driver.findElement(By.id("inter_charges")).sendKeys("10");
		driver.findElement(By.id("sms_charges")).sendKeys("1");
		driver.findElement(By.name("submit")).click();
		

		
		
		//driver.close();
		//driver.quit();
	}
}
