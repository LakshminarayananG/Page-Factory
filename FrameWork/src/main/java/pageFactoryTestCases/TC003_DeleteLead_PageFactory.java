package pageFactoryTestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageFactory.LoginPage;
import testcases.Sample_TestNg;

public class TC003_DeleteLead_PageFactory extends Sample_TestNg {

	@BeforeClass
	public void setSheetValue(){
		dataSheetName="TC003_DeleteLead";
	}

	@Test(dataProvider="getData")
	public void deleteLead(String username, String pasword, String phnumber) throws InterruptedException{		

		new LoginPage()
		.enterUserName(username)
		.enterPassword(pasword)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickPhoneOption()
		.enterPhoneNumber(phnumber)
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
