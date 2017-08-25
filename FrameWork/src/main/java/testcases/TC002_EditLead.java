package testcases;

import org.testng.annotations.Test;



public class TC002_EditLead extends Sample_TestNg{

	@Test
	public void editLead() throws InterruptedException {

	
		enterInput(locateElement("id", "username"), "DemoSalesManager");
		enterInput(locateElement("id", "password"), "crmsfa");		
		click(locateElement("xpath", "//input[@value='Login']"));				
		click(locateElement("linkText", "CRM/SFA"));			
		click(locateElement("linkText", "Leads"));						
		click(locateElement("linkText", "Find Leads"));				
		enterInput(locateElement("xpath", "(//input[@name='firstName'])[3]"),"bb");
		click(locateElement("xpath", "//button[text()='Find Leads']"));		
		Thread.sleep(5000);		
        click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
        
        boolean checkTitle = verifyTitle("View Lead | opentaps CRM");
        if(checkTitle){
        	        	
            click(locateElement("linkText", "Edit"));        	           
            enterInput(locateElement("id", "updateLeadForm_companyName"),"Glencore");
        	            
            click(locateElement("xpath", "//input[@value='Update']"));
            
        	String companyName = getText(locateElement("id", "viewLead_companyName_sp"));
        	
        	if(companyName.contains("Glencore")){
        		System.out.println("The Company Name is updated");
        	}
        }
        else{
        	System.out.println("The Title did not match");
        }

		

	
		
		
		

	}

}
