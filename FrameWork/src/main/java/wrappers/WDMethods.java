package wrappers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class WDMethods extends WDListener implements WDMethodsImpl {
	public WebDriver driver;
	public static EventFiringWebDriver event;
	public WebElement locateElement(String locatortype, String locator){

		WebElement element=null;
		switch(locatortype){

		case("id"):
			element=event.findElement(By.id(locator));
		break;


		case("name"):
			element=event.findElement(By.name(locator));
		break;


		case("xpath"):
			element=event.findElement(By.xpath(locator));
		break;


		case("linkText"):
			element=event.findElement(By.linkText(locator));
		break;


		case("className"):
			element=event.findElement(By.className(locator));
		break;


		case("partialLinkText"):
			element=event.findElement(By.partialLinkText(locator));
		break;


		case("cssSelector"):
			element=event.findElement(By.cssSelector(locator));
		break;


		case("tagName"):
			element=event.findElement(By.tagName(locator));
		break;

		case("type"):
			element=event.findElement(By.xpath("//*[@type='"+locator+"']"));
		break;
		
		
		default:
			System.out.println("The given input locator "+locatortype+" is not valid");
			break;


		}
		return element;
	}



	public void enterInput(WebElement element,String input){
		element.sendKeys(input);
	}

	public void click(WebElement element){
		element.click();
	}




	public void selectByVisibleText(WebElement element, String text){
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}




	public void selectByIndex(WebElement element, int index){
		Select select=new Select(element);
		select.selectByIndex(index);
	}


	public void selectByValue(WebElement element, String value){
		Select select=new Select(element);
		select.selectByValue(value);
	}



	public void switchWindow(int window){
		Set<String> winhandle=event.getWindowHandles();
		List<String> windowhandles=new ArrayList<>();
		windowhandles.addAll(winhandle);
		if(window>=windowhandles.size()){
			System.out.println("Entered window size is greater than number of active windows");			
			throw new RuntimeException();
		}
		else{
		event.switchTo().window(windowhandles.get(window));
		}
	}



	public void acceptAlert(){
		event.switchTo().alert().accept();
	}



	public void dismissAlert(){
		event.switchTo().alert().dismiss();
	}



	public String alertText(){
		String altext=event.switchTo().alert().getText();
		return altext;
	} 



	public void switchFrame(WebElement element){
		event.switchTo().frame(element);

	}


	public boolean verifyTitle(String title){
		boolean pagetitle=false;

		if(event.getTitle().equals(title)){
			pagetitle=true;
		}
		return pagetitle;
	}



	public String getText(WebElement element){
		String text=element.getText();
		return text;

	}


	public String getAttribute(WebElement element, String attrstr){
		String attribute=element.getAttribute(attrstr);
		return attribute;

	}


	public boolean verifyText(WebElement element, String vertext){
		boolean veritext=false;

		if(element.getText().equalsIgnoreCase(vertext)){
			veritext=true;
		}
		return veritext;

	}


	
	public void invokeApp(String browser, String URL){
		

		if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();


		}else {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver-64 bit.exe");
			driver=new FirefoxDriver();		
			
			
		}
		
		event=new EventFiringWebDriver(driver);
		WDListener handler=new WDListener();
		event.register(handler);


		event.manage().window().maximize();
		event.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		event.get(URL);


	}


	
	public void closeApp(){
		event.quit();
	}



}
