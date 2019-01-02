package Generic;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Basepage2 
{
	public WebDriver driver;
	public Basepage2(WebDriver driver)
	{
		this.driver=driver;
	}
	public void elementvisiblity(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("element is displayed",true);
			driver.findElement(By.xpath("//div[@class='popup_menu_icon tips_icon']")).click();
			Thread.sleep(2000);
}
		catch(Exception e)
		{
			Reporter.log("element not displayed", true);
			Assert.fail();
		}
}
}