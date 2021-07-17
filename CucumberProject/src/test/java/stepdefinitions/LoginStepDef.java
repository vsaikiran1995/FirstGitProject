package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPageObjects;
import utilFunctions.BaseClass;

public class LoginStepDef extends BaseClass {

	LoginPageObjects lpo;
	HomePage hp;

    @Then("^verify the home page is displayed with user (.+)$")
    public void verify_the_home_page_is_displayed_with_user(String firstname) throws Throwable {
    	hp = new HomePage(driver);
    	Thread.sleep(2000);
    	String actualFirstName = hp.getFirstName().getText();
    	System.out.println("actualFirstName --> "+actualFirstName);
    	Assert.assertEquals(firstname, actualFirstName);
    }

    @And("^print the links from home page$")
    public void printLinks() throws Throwable {
    	hp = new HomePage(driver);
    	for (int i = 0; i < hp.getLinks().size(); i++) {
			System.out.println("links -> "+hp.getLinks().get(i).getAttribute("href"));
		}
    }
}
