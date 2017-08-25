package pageFactoryTestCases;

import org.testng.annotations.Test;

import pageFactory.LoginPage;
import testcases.Sample_TestNg;

public class TC003_DeleteLead_PageFactory extends Sample_TestNg {


	@Test	
	public void deleteLead() throws InterruptedException{		

		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickPhoneOption()
		.enterPhoneNumber()
		.clickFindLead()
		.getFirstResultingLead()
		.clickFirstResultingLead()
		.clickDeleteLead()
		.clickFindLeads()
		.enterLeadID()
		.clickFindLead()
		.getLeadResult();

	}




}
