package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPage extends AbstractPage {

	public CreateLeadPage(){
		PageFactory.initElements(event, this);

	}


	@FindBy(how=How.ID, using="createLeadForm_companyName")
	WebElement CreateLead_CompanyName;

	public CreateLeadPage enterCompanyName(){
		enterInput(CreateLead_CompanyName, "BMW");
		return this;
	}


	@FindBy(how=How.ID, using="createLeadForm_firstName")
	WebElement CreateLead_FirstName;

	public CreateLeadPage enterFirstName(){
		enterInput(CreateLead_FirstName, "Lakshmi");
		return this;
	}



	@FindBy(how=How.ID, using="createLeadForm_lastName")
	WebElement CreateLead_LastName;
	public CreateLeadPage enterLastName(){
		enterInput(CreateLead_LastName, "Narayanan");
		return this;
	}

	@FindBy(how=How.ID, using="createLeadForm_dataSourceId")
	WebElement CreateLead_DataSource;
	public CreateLeadPage selectDataSource(){
		selectByVisibleText(CreateLead_DataSource, "Conference");
		return this;
	}


	@FindBy(how=How.ID, using="createLeadForm_marketingCampaignId")
	WebElement CreateLead_Marketing_Campaign;
	public CreateLeadPage selectMarketingCampaign(){
		selectByVisibleText(CreateLead_Marketing_Campaign, "Automobile");
	return this;
	}


	@FindBy(how=How.ID, using="createLeadForm_primaryPhoneNumber")
	WebElement CreateLead_Primary_PhoneNumber;
	public CreateLeadPage enterPrimaryPhoneNumber(){
		enterInput(CreateLead_Primary_PhoneNumber, "65285206");
		return this;
	}

	
	@FindBy(how=How.ID, using="createLeadForm_primaryEmail")
	WebElement CreateLead_Email_Address;
	public CreateLeadPage enterEmailAddress(){
		enterInput(CreateLead_Email_Address, "test@test.com");
		return this;
	}


	@FindBy(how=How.CLASS_NAME, using="smallSubmit")
	WebElement CreateLead_ConfirmationButton;
	public ViewLead clickCreateLead(){
		click(CreateLead_ConfirmationButton);
		return new ViewLead();
	}

}
