package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import wrappers.WDMethods;

public class Sample_TestNg extends WDMethods {


	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void beforetest(){
		System.out.println("Before test");
	}

	@BeforeGroups
	public void beforeGroups(){
		System.out.println("Before groups");
	}

	@BeforeClass
	public void beforeClass(){
		System.out.println("Before class");
	}

	@DataProvider
	public void dataProvider(){
		System.out.println("Data Provider");
	}





	@BeforeMethod
	public void beforeMethod(){
		invokeApp("chrome", "http://leaftaps.com/opentaps");
	}	



	@AfterMethod
	public void afterMethod(){
		closeApp();
	}

	@AfterClass
	public void afterClass(){
		System.out.println("After class");
	}

	@AfterGroups
	public void afterGroups(){
		System.out.println("After Groups");
	}


	@AfterTest
	public void afterTest(){
		System.out.println("After Test");
	}

	@AfterSuite
	public void afterSuite(){
		System.out.println("After Suite");
	}


}





