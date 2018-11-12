package amazon.steps;



import amazon.actions.ABaseclass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class AmazonHooks extends ABaseclass {
	
	@Before
	public void beforeAmazonHooks() {
		createLocalDriver();
	}
	
	@After
public void afterAmazonHooks() {
	closeDriver();
		
	}
}
