package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {
	
	
	public LoginPage(){
		PageFactory.initElements(event, this);
	}


	@FindBy(how=How.ID, using="username")
	WebElement uName;
	
	public LoginPage enterUserName(String username){
		enterInput(uName, username);
		return this;
	}


	@FindBy(how=How.ID, using="password")
	WebElement password;
	
	public LoginPage enterPassword(String pasword){
		enterInput(password, pasword);
		return this;
	}
	
	

	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit")
	WebElement loginlink;
	
	public HomePage clickLoginButton(){
		click(loginlink);
		return new HomePage();
	}

}
