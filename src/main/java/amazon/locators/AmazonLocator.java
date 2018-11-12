package amazon.locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazon.actions.ABaseclass;

public class AmazonLocator extends ABaseclass{
	public AmazonLocator() {
		PageFactory.initElements(getDriver(), this);
		
	}
	
	@FindBy(xpath="//div[@id='nav-tools']//a[@id='nav-link-yourAccount']//span[contains(text(),'Hello')]")
	public WebElement navigateTOLogin;
	
	
	@FindBy(xpath="//input[@id='ap_email']")
	public WebElement userName;
	
	@FindBy(xpath="//input[@id='continue']")
	public WebElement continueUser;
	
	@FindBy(xpath="//input[@id='ap_password']")
	public WebElement userPassword;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	public WebElement continuePass;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	public WebElement bookText;
	
	@FindBy(xpath="//span[@id='nav-search-submit-text']//following-sibling::input[1]")
	public WebElement Button;
	
	
	
}
