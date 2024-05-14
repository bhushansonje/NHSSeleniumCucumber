package seleniumpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import org.testng.Assert;

import common.Page_BasePage;


public class Page_NHSBSAJOBSEARCHPage extends Page_BasePage {

	By cookies = By.xpath("//button[text()='Accept analytics cookies']");

	By lnkGoToSearch = By.xpath("//*[text()='Go to search']");


	Page_Common common = new Page_Common();

	public void openNHSSBAPage() throws InterruptedException
	{
		common.navigateToPage("https://www.jobs.nhs.uk/candidate");

	    common.setImplicitWait(driver,10);

		driver.findElement(cookies).click();
	
	Thread.sleep(2000);
	
	}

	public void verifyHomePageTitle() {
		String title = driver.getTitle();

		System.out.println("title:  " + title);

		Assert.assertEquals(title,"NHS Jobs");
	}
	
	public void clickOnGoToSearchLink() throws InterruptedException
	
	{
		WebElement lnkGoToSearchElement = common.waitUntilElementIsClickable(driver, lnkGoToSearch, 10);

		lnkGoToSearchElement.click();
		//driver.findElement(lnkGoToSearch).click();
		
		//Thread.sleep(1000);
		
	}
	

	
	
	
	
	
}
