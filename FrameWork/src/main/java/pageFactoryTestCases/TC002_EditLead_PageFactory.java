package pageFactoryTestCases;

import org.testng.annotations.Test;

import pageFactory.LoginPage;
import testcases.Sample_TestNg;



public class TC002_EditLead_PageFactory extends Sample_TestNg{

	@Test
	public void editLead() throws InterruptedException {

	
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.enterfnameFindLead()
		.clickFirstResultingLead()
		.getCompanyName()
		.clickEditLead()
		.editLeadCompanyName()
		.clickUpdateLead()
		.verifynewCompanyName();
		
		
		
		

	}

}
