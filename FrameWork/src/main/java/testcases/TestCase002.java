package testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase002 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/Lakshmi/Test Leaf/Softwares and Videos/Softwares/drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
				
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Launch the application URL
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//Enter username and password and click on login
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		
		//Clicking on CRMSFA link
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Click on leads link
		driver.findElementByLinkText("Leads").click();
		
		
		//Clicking on Find Leads link
		driver.findElementByLinkText("Find Leads").click();
		
		
		//clicking on phone
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("65285206");
		
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		//clicking on first lead
		String firstlead=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		System.out.println(firstlead);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
		driver.findElementByXPath("//a[contains(text(),'Delete')]").click();
		
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//input[@name='id']").sendKeys(firstlead);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(5000);
		
		String result=driver.findElementByClassName("x-paging-info").getText();
		System.out.println(result);
		if(result.contains("No records")){
			System.out.println("Record deleted");
		}
		
		else{
			System.out.println("Record still exists");
		}
		
		driver.quit();
		
		
	}

}
