package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage extends AbstractPage {
	
	
	public LeadsPage(){
		PageFactory.initElements(event, this);
	}


	@FindBy(how=How.LINK_TEXT, using="Create Lead")
	WebElement CreateLead_Link;
	
	public CreateLeadPage clickCreateLead(){
		click(CreateLead_Link);
		return new CreateLeadPage();
	}
	
	
	@FindBy(how=How.LINK_TEXT, using="Find Leads")
	WebElement FindLeads_Link;
	public FindLeadsPage clickFindLeads(){
		click(FindLeads_Link);
		return new FindLeadsPage();
	}

	
	@FindBy(how=How.LINK_TEXT, using="Leads")
	WebElement Leads_Link;
	public LeadsPage clickLeads(){
		click(Leads_Link);
		return this;
	}
	
	



}
