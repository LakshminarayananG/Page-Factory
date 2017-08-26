package pageFactoryTestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageFactory.LoginPage;
import testcases.Sample_TestNg;

public class TC001_CreateLead_PageFactory extends Sample_TestNg {


	@BeforeClass
	public void setSheetValue(){
		dataSheetName="TC001_CreateLead";
	}

	@Test(dataProvider="getData")	
	public void createLead(String username, String pasword,String compyname, 
			String fname,String lname,String marcampaign,String confvalue,String phnumber,
			String email){		

		new LoginPage()
		.enterUserName(username)
		.enterPassword(pasword)
		.clickLoginButton()
		.clickCRMSFA()
		.clickCreateLead()
		.enterCompanyName(compyname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.selectMarketingCampaign(marcampaign)
		.selectDataSource(confvalue)
		.enterPrimaryPhoneNumber(phnumber)
		.enterEmailAddress(email)
		.clickCreateLead()
		.getLeadID();

	}




}
