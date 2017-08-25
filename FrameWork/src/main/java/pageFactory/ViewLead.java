package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewLead extends AbstractPage {
	public static String companyName1;
	
	public ViewLead(){
		PageFactory.initElements(event, this);
	}


	@FindBy(how=How.ID, using="viewLead_companyName_sp")
	WebElement LeadId;
	
	public ViewLead getLeadID(){
		String lead=getText(LeadId);
		String leadID=lead.replaceAll("[a-z,A-Z,( )]", "");
		System.out.println(leadID);
		return this;
	}

	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Delete')]")
	WebElement clickDeleteLead;
	
	public LeadsPage clickDeleteLead(){
		click(clickDeleteLead);
		return new LeadsPage();
	}


	
	@FindBy(how=How.LINK_TEXT, using="Edit")
	WebElement clickEditLead;
	
	public EditLead clickEditLead(){
		click(clickEditLead);
		return new EditLead();
	}
	
	
	
	@FindBy(how=How.ID, using="viewLead_companyName_sp")
	WebElement getFnameViewLead;
	
	public ViewLead getFirstNameViewlead(){
		String lead=getText(getFnameViewLead);
		if(lead.contains("Lakshmi")){
			System.out.println("The Company Name is updated");
		}
	
	else
		System.out.println("Name not updated");
	
	
		return this;
	}
	
	
	@FindBy(how=How.ID, using="viewLead_companyName_sp")
	WebElement companyName;
	
	public ViewLead getCompanyName(){
		String lead=getText(companyName);
		companyName1=lead.replaceAll("[0-9,( )]", "");
		System.out.println(companyName1);
		return this;
	}
	
	
	@FindBy(how=How.ID, using="viewLead_companyName_sp")
	WebElement newcompanyName;
	
	public ViewLead verifynewCompanyName() throws InterruptedException{
		Thread.sleep(3500);
		String lead=getText(newcompanyName);
		String companyName2=lead.replaceAll("[0-9,( )]", "");
		System.out.println(companyName2);
		if(companyName1.equalsIgnoreCase(companyName2)){
			System.out.println("Update not successful");
		}
		
		else
			System.out.println("Update Successful");
		return this;
	}


}
