package Generic;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Basepage1 
{
	public WebDriver driver;
	public Basepage1(WebDriver driver)
	{
		this.driver=driver;
	}
	public void titlewait(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		if(driver.getPageSource().contains("List of canned response")){
			System.out.println("Text is present");
			}else{
			System.out.println("Text is absent");
			}

}
}


