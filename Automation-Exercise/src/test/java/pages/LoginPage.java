package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;

public class LoginPage extends WebTestBase {
	 @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")
	    WebElement emailTextBox;

	    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")
	    WebElement passwordTextBox;

	    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/button")
	    WebElement loginbtn;

	    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	    WebElement loginclick;
	    
	    public LoginPage(){
	    	//used for creating webelements
	        PageFactory.initElements(driver, this);
	    }
//sending the email and passwrord to the login
	    public void login(String mobile, String password){
	    	loginclick.click();
	        emailTextBox.sendKeys(mobile);
	        passwordTextBox.sendKeys(password);
	        loginbtn.click();
	    }

}
