package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {
	
	
	public HomePage(){
		PageFactory.initElements(event, this);
	}


	@FindBy(how=How.LINK_TEXT, using="CRM/SFA")
	WebElement CRMSFA_Link;
	
	public LeadsPage clickCRMSFA(){
		click(CRMSFA_Link);
		return new LeadsPage();
	}




}
