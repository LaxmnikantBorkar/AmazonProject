package amazon.steps;

import amazon.actions.AmazonActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonSteps {
	AmazonActions actions = new AmazonActions();

	@When("^User Navigate To AmazonSite and click for Login$")
	public void user_Navigate_To_AmazonSite_and_click_for_Login() throws Throwable {
		actions.navigateTOSite();

	}

	@When("^User enters Username \"(.*)\"$")
	public void user_enters_Username(String UserName) throws Throwable {
		actions.enterUserName(UserName);
	}

	@When("^User click on Continue Button$")
	public void user_click_on_Continue_Button() throws Throwable {
		actions.clickTOContinue();
	}

	@When("^User enters Password \"(.*)\"$")
	public void user_enters_Password(String Password) throws Throwable {
		actions.enterUsePassword(Password);
	}

	@When("^User clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
		actions.clickTOLogin();
	}

	@Then("^User is successfully logged in$")
	public void user_is_successfully_logged_in() throws Throwable {
		System.out.println("User is logged in");
	}

	@When("^User enters Authorname \"(.*)\"$")
	public void entersAuthorname(String Authorname) throws Throwable {
		actions.navigateToSearchText(Authorname);
	}

	@When("^User click on SearchTab button$")
	public void clickonSearchTab() throws Throwable {
		actions.clickForBook();
	}

	@When("^Validate Book \"(.*)\"$")
	public void validateBook(String arg1) throws Throwable {

	}

}
