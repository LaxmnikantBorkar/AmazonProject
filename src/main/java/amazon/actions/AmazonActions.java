package amazon.actions;

import amazon.locators.AmazonLocator;

public class AmazonActions {
	
	AmazonLocator amazonaction=new AmazonLocator();
	
	public void navigateTOSite() {
		amazonaction.navigateTOLogin.click();
	}
	public void enterUserName(String UserName) {
		amazonaction.userName.sendKeys(UserName);
	}
	
	public void clickTOContinue() {
		amazonaction.continueUser.click();	
	}
	public void enterUsePassword(String Password) {
		amazonaction.userPassword.sendKeys(Password);
	}
	
	public void clickTOLogin() {
		amazonaction.continuePass.click();	
	}
	
	public void navigateToSearchText(String Authorname) {
		amazonaction.bookText.sendKeys(Authorname);
	}
	public void clickForBook() {
		amazonaction.Button.click();	
	}
}
