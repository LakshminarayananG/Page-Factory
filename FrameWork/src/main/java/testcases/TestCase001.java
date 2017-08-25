package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase001 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:/Lakshmi/Test Leaf/Softwares and Videos/Softwares/drivers/geckodriver-64 bit.exe");
		
		//ChromeDriver driver=new ChromeDriver();
		
		FirefoxDriver driver=new FirefoxDriver();
		
		
		//Maximize the browser
		//driver.manage().window().maximize();
		
		//Launch the application URL
		driver.get("http://leaftaps.com/opentaps");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//Enter username and password and click on login
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		
		//Clicking on CRMSFA link
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Clicking on Create lead link
		driver.findElementByLinkText("Create Lead").click();
		
		//Entering company name
		driver.findElementById("createLeadForm_companyName").sendKeys("sample company");
		
		//Entering First and last name
		driver.findElementById("createLeadForm_firstName").sendKeys("Lakshmi");
		driver.findElementById("createLeadForm_lastName").sendKeys("Narayanan");
		
		
		//Selecting source
		WebElement source=driver.findElementById("createLeadForm_dataSourceId");
		Select sel=new Select(source);
		sel.selectByVisibleText("Conference");
		
		
		//Selecting marketing campaign
		Select marcamp= new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		marcamp.selectByVisibleText("Automobile");
		
		
		//Entering phone number and email address
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("65285206");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("test@test.com");
		
		
		//Clicking on create lead
		driver.findElementByClassName("smallSubmit").click();
		
		
		
		//Capturing lead id
		String lead=driver.findElementById("viewLead_companyName_sp").getText();
		String leadid=lead.replaceAll("[a-z,( )]", "");
		
		
		System.out.println(leadid);
		
		
		
		//Closing the browser
		driver.quit();
		
		
		
		
		
	}

}
