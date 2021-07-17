package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPageObjects;
import pageObjects.MailingPageObject;
import utilFunctions.BaseClass;
import utilFunctions.CommonFunctions;

public class MailingStepDef extends BaseClass{

	LoginPageObjects lpo;
	MailingPageObject mpo;
//	WebDriver driver;

	@Given("^Yahoo app is launched$")
	public void yahoo_app_is_launched() throws Throwable {
		driver = driverInit();
		openApp();
	}

	@When("^User entered (.+) and (.+)$")
	public void user_entered_and(String username, String password) throws Throwable {
		loginApp(username, password);
	}

	@And("^User clicked on submit button$")
	public void user_clicked_on_submit_button() throws Throwable {
		lpo = new LoginPageObjects(driver);
		lpo.getLoginBtn().click();
	}

	@When("^User hovers on the mail$")
	public void user_hovered_on_the_mail() throws Throwable {
		mpo = new MailingPageObject(driver);
		WebElement icon= mpo.getEmailIcon();
		customWaitersByVisibleOfElement(icon);
		hoverAction(icon);

	}

	@When("^User entered  toEmailAddress and SubjectLine$")
	public void user_entered_toemailaddress_and_subjectline() throws Throwable {

	}

	@Then("^Verify user navigates to Compose page$")
	public void verify_user_navigates_to_compose_page() throws Throwable {

	}

	@Then("^User clicks on Send Button$")
	public void user_clicks_on_send_button() throws Throwable {

	}

	@And("^User clicked on compose button$")
	public void user_clicked_on_compose_button() throws Throwable {
		customWaitersByElementToBeClickable(mpo.getComposeBtn());
		mpo.getComposeBtn().click();
	}

	@And("^User entered Body Content$")
	public void user_entered_body_content() throws Throwable {

	}
	
	@And("^close the driver$")
	public void closeDriver(){
		driver.close();
	}
	
}
