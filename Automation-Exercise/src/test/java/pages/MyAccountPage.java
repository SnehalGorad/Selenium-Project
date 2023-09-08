package pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;
import utils.Utility;

public class MyAccountPage extends WebTestBase {
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
    WebElement hover;
	
	
    //WebElement accountTitle;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
    WebElement searchProductsclick;
	
	 @FindBy(xpath = "//*[@id=\"search_product\"]")
	    WebElement searchTextBox;

	    @FindBy(xpath = "//*[@id=\"submit_search\"]")
	    WebElement searchBtn;

	 
	    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/h2")
	    WebElement searchTitle;
	    
	    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[7]/a")
	    WebElement youtubeOption;
	    
	    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/a")
	    WebElement AddToCartbtn;
	    
	    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[1]/h4")
	    WebElement Added;
	    
	public MyAccountPage(){
        PageFactory.initElements(driver, this);
    }
	

	/*public String getTextOFMYAccountPage() {
		Object accountTitle;
		// TODO Auto-generated method stub
		//return accountTitle.getText();

	}*/
	
	public void mouseHover() {
		Utility.mouseHover(driver,hover);
	}
	
	public void getScreenshot() throws IOException {
		Utility.getScreenshot();
	}
	public void search() throws InterruptedException{
		searchProductsclick.click();
		Thread.sleep(1000);
        searchTextBox.sendKeys("tops");
        //searchTextBox.sendKeys(Keys.ENTER);
        searchBtn.click();
    }
	
	public String getTextOfSearch() {
		//geting the result of search text
		return searchTitle.getText();
	}
	
	public void verifyGetWindowhandle() throws InterruptedException {
		
		Utility.scrollDownByElement(driver,youtubeOption);
		youtubeOption.click();
		Utility.switchToWindows(driver);
}
	
	public void getCookiesHandle() {
		// TODO Auto-generated method stub
		Utility.getCookies();
		
	}
	public void AddToCart() {
		// TODO Auto-generated method stub
		AddToCartbtn.click();
	}
		
	public String AddToCartResult() {
		return Added.getText();
	}
	
}
	

