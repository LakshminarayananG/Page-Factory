package wrappers;

import org.openqa.selenium.WebElement;

public interface WDMethodsImpl {
	
	/**
	 * This method is used to locate the webelement in a webpage
	 * @param locatortype- Locator types to be used are id, xpath, className, name, tagName, linkText, partialLinkText, cssSelector
	 * @param locator- locator is the web element to be passed in this method
	 * @return- The return type is a webelement
	 * @author Lakshminarayanan
	 */	
	public WebElement locateElement(String locatortype, String locator);
	


/**
 * This method is used to enter an input value for a text field
 * @param element- Element is the webelement for the field on which value is to be passed
 * @param input- Input is the string/integer/float value to be passed in the text field
 * @author Lakshminarayanan */
	public void enterInput(WebElement element,String input);
	
	
/**
 * This method is used to click on a particular webElement
 * @param element- name of the webElement
 * @author Lakshminarayanan
 */
	public void click(WebElement element);



/**
 * This method is used to select a value from the dropdown using the visibletext in dropdown
 * @param element- name of the webelement
 * @param text- Visible text present in the dropdown
 * @author Lakshminarayanan
 */
	public void selectByVisibleText(WebElement element, String text);

	
	
/**
 This method is used to select a value from the dropdown using the index value in dropdown
 * @param element- name of the webelement
 * @param index- Index value of the dropdown
 * @author Lakshminarayanan
 */
	public void selectByIndex(WebElement element, int index);


	
	/**
	 This method is used to select a value from the dropdown using the value value in dropdown
 * @param element- name of the webelement
	 * @param value- Value of the element in dropdown
	 * @author Lakshminarayanan
	 */
	public void selectByValue(WebElement element, String value);



	
	/**
	 * This method is used to switch to any particlar window if there are multiple window sessions opened
	 * @param window- window size/value
	 * @author Lakshminarayanan
	 */
	public void switchWindow(int window);


	
	/**
	 * This method is used to accept an alert if it is present in the web browser
	 * @author Lakshminarayanan
	 */
	public void acceptAlert();



	
	/**
	 * This method is used to dismiss an alert if it is present in a web browser
	 * @author Lakshminarayanan
	 */
	public void dismissAlert();


	
	/**
	 * This method is used to return the information present in the alert window
	 * @return- returns the alert text as a string
	 * @author Lakshminarayanan
	 */
	public String alertText();


/**
 * This method is used to switch inside a frame if it is present in a web page
 * @param element- name of the web element
 * @author Lakshminarayanan
 */
	public void switchFrame(WebElement element);


	
	/**
	 * This method is used to verify the title of a page
	 * @param title- Input value of the title which is compared with the value retrieved from the web page
	 * @return- returns true if the title matches, else returns false
	 * @author Lakshminarayanan
	 */
	public boolean verifyTitle(String title);

	
	/**
	 * This method is used to get the text value from any particular webelement
	 * @param element- name of the web element
	 * @return- returns string value of the webelement
	 * @author Lakshminarayanan
	 */
	
	public String getText(WebElement element);

	
	/**
	 * This method returns the string value of any attribute
	 * @param element- name of the web element
	 * @param attrstr- string value of the attribute
	 * @return- returns string value of attribute
	 * @author Lakshminarayanan
	 */
	public String getAttribute(WebElement element, String attrstr);


	
	/**
	 * This method verifies the text with any input value
	 * @param element- name of the web element
	 * @param vertext- Input text given for comparing with text retrieved from web page
	 * @return- returns true if text matches, else returns false
	 */
	public boolean verifyText(WebElement element, String vertext);

	
	/**
	 * This method will launch the given browser and maximise the browser and set the
	 * wait for 30 seconds and load the url
	 * @author Lakshminarayanan
	 * @param browser - The browser of the application to be launched
	 * @param url - The url with http or https
	 */
	public void invokeApp(String browser, String URL);
	

	/**
	 * This method will close the active browser
	 * @author Lakshminarayanan
	 */
	public void closeApp();

}
