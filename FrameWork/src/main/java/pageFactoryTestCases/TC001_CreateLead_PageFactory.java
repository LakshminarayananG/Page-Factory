package pageFactoryTestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageFactory.LoginPage;
import testcases.Sample_TestNg;

public class TC001_CreateLead_PageFactory extends Sample_TestNg {
	
	
	@DataProvider
	public Object[][] getData(){
		
		
	
		Object[][] data=new Object[0][8];
		data[0][0]="DemoSalesManager";
		data[0][1]="crmsfa";
		data[0][2]="BMW";
		data[0][3]="Lakshmi";
		data[0][4]="Narayanan";
		data[0][5]="Automobile";
		data[0][6]="Conference";
		data[0][7]="65285206";
		data[0][8]="test@test.com";
	
	return data;
	}
	
	@Test(dataProvider="getData")	
		public void createLead(String username, String pasword,String compyname, String fname,String lname,String marcampaign,String confvalue,String phnumber,
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
