package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.chrome.ChromeDriver;

import common.Page_BasePage;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import seleniumpages.Page_Common;
import seleniumpages.Page_NHSBSAJOBSEARCHPage;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.BeforeClass;
import org.testng.ITestContext;


public class StepDefs_jobsearch extends Page_BasePage {

	Page_NHSBSAJOBSEARCHPage nhspage = new Page_NHSBSAJOBSEARCHPage();
	Page_Common common = new Page_Common();

	@Given("I am on the NHS Jobs website homepage")
	public void I_am_on_the_NHS_Jobs_website_homepage() throws InterruptedException {
		System.out.println("OPENING NHS PAGE");
		   
		nhspage.openNHSSBAPage();
	}

	@When("I verify the title of the homepage")
	public void i_verify_the_title_of_the_homepage() {
		System.out.println("Verifying Title");
		nhspage.verifyHomePageTitle();
	}


	@When("I click on the Go to search link")
	public void I_click_on_the_Go_to_search_link() throws InterruptedException {
		System.out.println("CLICKING ON GO TO Search Link");

		nhspage.clickOnGoToSearchLink();
	}

//	@When("I enter {string} in the search box")
//	public void i_enter_in_the_search_box(String string) {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}



}
