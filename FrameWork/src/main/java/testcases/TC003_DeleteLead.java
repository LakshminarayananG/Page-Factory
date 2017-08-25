package testcases;

import org.testng.annotations.Test;

public class TC003_DeleteLead extends Sample_TestNg {
	
	
	@Test	
		public void deleteLead() throws InterruptedException{		
	
	
		
		enterInput(locateElement("id", "username"), "DemoSalesManager");
		enterInput(locateElement("id", "password"), "crmsfa");
		click(locateElement("className", "decorativeSubmit"));		
		click(locateElement("linkText", "CRM/SFA"));		
		click(locateElement("linkText", "Leads"));
		click(locateElement("linkText", "Find Leads"));
		click(locateElement("xpath", "//span[text()='Phone']"));
		Thread.sleep(3500);
		enterInput(locateElement("xpath", "//input[@name='phoneNumber']"), "65285206");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(2000);
		
		
		String firstlead=getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		System.out.println(firstlead);
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("xpath", "//a[contains(text(),'Delete')]"));
		click(locateElement("linkText", "Find Leads"));
		enterInput(locateElement("xpath", "//input[@name='id']"), firstlead);
		click(locateElement("xpath","//button[text()='Find Leads']"));
		
		Thread.sleep(3500);
		String result=getText(locateElement("className", "x-paging-info"));
		System.out.println(result);
		if(result.contains("No records")){
			System.out.println("Record deleted");
		}
		
		else{
			System.out.println("Record still exists");
		}
		
		
}
		
		
	

}
