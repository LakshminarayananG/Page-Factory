package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FindLeadsPage extends AbstractPage {
	
	public static String leadid;
	public FindLeadsPage(){
		PageFactory.initElements(event, this);
	}


	@FindBy(how=How.XPATH, using="//span[text()='Phone']")
	WebElement Phone_Link;
	
	public FindLeadsPage clickPhoneOption(){
		click(Phone_Link);
		return this;
	}
	
	
	@FindBy(how=How.XPATH, using="//input[@name='phoneNumber']")
	WebElement enterPhoneNumber;
	
	public FindLeadsPage enterPhoneNumber(){
		enterInput(enterPhoneNumber, "65285206");
		return this;
	}
	
	
	@FindBy(how=How.XPATH, using="//button[text()='Find Leads']")
	WebElement FindLeads_Button;
	
	public FindLeadsPage clickFindLead(){
		click(FindLeads_Button);
		return this;
	}
	

	@FindBy(how=How.XPATH, using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement FirstResultingLead;
	
	public FindLeadsPage getFirstResultingLead(){
		String lead=getText(FirstResultingLead);
		leadid=lead.replaceAll("[a-z,A-Z,( )]", "");
		System.out.println(leadid);
		return this;
	}
	
	
	@FindBy(how=How.XPATH, using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement clickFirstResultingLead;
	
	public ViewLead clickFirstResultingLead(){
		click(clickFirstResultingLead);
		return new ViewLead();
	}
	
	
	
	
	@FindBy(how=How.XPATH, using="//input[@name='id']")
	WebElement enterLeadID;
	
	public FindLeadsPage enterLeadID(){
		enterInput(enterLeadID, leadid);
		return this;
	}
	
	
	
	
	@FindBy(how=How.CLASS_NAME, using="x-paging-info")
	WebElement NoRecordText;
	
	public FindLeadsPage getLeadResult() throws InterruptedException{
		Thread.sleep(3500);
		String result=getText(NoRecordText);
		System.out.println(result);
		if(result.contains("No records")){
			System.out.println("Record deleted");
		}
		
		else{
			System.out.println("Record still exists");
		}
		return this;
	}
	
	
	@FindBy(how=How.XPATH, using="(//input[@name='firstName'])[3]")
	WebElement enterFirstName;
	
	public FindLeadsPage enterfnameFindLead(){
		enterInput(enterFirstName, "Lakshmi");
		return this;
	}





}
