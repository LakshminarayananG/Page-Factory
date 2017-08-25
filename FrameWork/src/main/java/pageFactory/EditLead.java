package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditLead extends AbstractPage {
	
	public static String newCompName="Narayanan";
	public EditLead(){
		PageFactory.initElements(event, this);
	}


	@FindBy(how=How.ID, using="updateLeadForm_companyName")
	WebElement editLeadCname;
	
	public EditLead editLeadCompanyName(){
		
		enterInput(editLeadCname, newCompName);
		return this;
	}

	
	
	
	@FindBy(how=How.XPATH, using="//input[@value='Update']")
	WebElement clickUpdateLead;
	
	public ViewLead clickUpdateLead(){
		click(clickUpdateLead);
		return new ViewLead();
	}
}
