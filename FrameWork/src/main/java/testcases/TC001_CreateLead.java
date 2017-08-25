package testcases;

import org.testng.annotations.Test;

public class TC001_CreateLead extends Sample_TestNg {
	
	
	@Test	
		public void createLead(){		
		
		enterInput(locateElement("id", "username"), "DemoSalesManager");
		enterInput(locateElement("id", "password"), "crmsfa");
		click(locateElement("className", "decorativeSubmit"));		
		click(locateElement("linkText", "CRM/SFA"));		
		click(locateElement("linkText", "Create Lead"));
		enterInput(locateElement("id", "createLeadForm_companyName"), "Standard Company");
		enterInput(locateElement("id", "createLeadForm_firstName"), "Lakshmi");
		enterInput(locateElement("id", "createLeadForm_lastName"), "Narayanan");
		selectByVisibleText(locateElement("id", "createLeadForm_dataSourceId"), "Conference");
		selectByVisibleText(locateElement("id", "createLeadForm_marketingCampaignId"), "Automobile");
		enterInput(locateElement("id", "createLeadForm_primaryPhoneNumber"), "65285206");
		enterInput(locateElement("id", "createLeadForm_primaryEmail"), "test@test.com");
		click(locateElement("className", "smallSubmit"));
		
		String lead=getText(locateElement("id", "viewLead_companyName_sp"));
		
		String leadid=lead.replaceAll("[a-z,A-Z,( )]", "");
		System.out.println(leadid);
		
		
}
		
		
	

}
