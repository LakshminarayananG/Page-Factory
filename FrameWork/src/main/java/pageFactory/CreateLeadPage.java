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

	public CreateLeadPage enterCompanyName(String compyname){
		enterInput(CreateLead_CompanyName, compyname);
		return this;
	}


	@FindBy(how=How.ID, using="createLeadForm_firstName")
	WebElement CreateLead_FirstName;

	public CreateLeadPage enterFirstName(String fname){
		enterInput(CreateLead_FirstName, fname);
		return this;
	}



	@FindBy(how=How.ID, using="createLeadForm_lastName")
	WebElement CreateLead_LastName;
	public CreateLeadPage enterLastName(String lname){
		enterInput(CreateLead_LastName, lname);
		return this;
	}

	@FindBy(how=How.ID, using="createLeadForm_dataSourceId")
	WebElement CreateLead_DataSource;
	public CreateLeadPage selectDataSource(String confvalue){
		selectByVisibleText(CreateLead_DataSource, confvalue);
		return this;
	}


	@FindBy(how=How.ID, using="createLeadForm_marketingCampaignId")
	WebElement CreateLead_Marketing_Campaign;
	public CreateLeadPage selectMarketingCampaign(String marcampaign){
		selectByVisibleText(CreateLead_Marketing_Campaign, marcampaign);
	return this;
	}


	@FindBy(how=How.ID, using="createLeadForm_primaryPhoneNumber")
	WebElement CreateLead_Primary_PhoneNumber;
	public CreateLeadPage enterPrimaryPhoneNumber(String phnumber){
		enterInput(CreateLead_Primary_PhoneNumber, phnumber);
		return this;
	}

	
	@FindBy(how=How.ID, using="createLeadForm_primaryEmail")
	WebElement CreateLead_Email_Address;
	public CreateLeadPage enterEmailAddress(String email){
		enterInput(CreateLead_Email_Address, email);
		return this;
	}


	@FindBy(how=How.CLASS_NAME, using="smallSubmit")
	WebElement CreateLead_ConfirmationButton;
	public ViewLead clickCreateLead(){
		click(CreateLead_ConfirmationButton);
		return new ViewLead();
	}

}
