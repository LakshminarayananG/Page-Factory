package pageFactoryTestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageFactory.LoginPage;
import testcases.Sample_TestNg;



public class TC002_EditLead_PageFactory extends Sample_TestNg{

	
	@BeforeClass
	public void setSheetValue(){
		dataSheetName="TC002_EditLead";
	}
	
	@Test(dataProvider="getData")
	public void editLead(String username, String pasword,String finame) throws InterruptedException {

	
		new LoginPage()
		.enterUserName(username)
		.enterPassword(pasword)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.enterfnameFindLead(finame)
		.clickFirstResultingLead()
		.getCompanyName()
		.clickEditLead()
		.editLeadCompanyName()
		.clickUpdateLead()
		.verifynewCompanyName();
		
		
		
		

	}

}
