package pageFactoryTestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageFactory.LoginPage;
import testcases.Sample_TestNg;

public class TC003_DeleteLead_PageFactory extends Sample_TestNg {

	@DataProvider
	public Object[][] getData(){
	
		Object[][] data=new Object[0][8];
		data[0][0]="DemoSalesManager";
		data[0][1]="crmsfa";
			return data;
	}
	

	@Test(dataProvider="getData")
	public void deleteLead(String username, String pasword) throws InterruptedException{		

		new LoginPage()
		.enterUserName(username)
		.enterPassword(pasword)
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
