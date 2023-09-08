package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;
import org.testng.asserts.SoftAssert;

public class HomePage extends WebTestBase{
	@FindBy(xpath = "//*[@id=\"slider-carousel\"]/ol/li[1]")
    WebElement dot1;
	
	@FindBy(xpath = "//*[@id=\"slider-carousel\"]/ol/li[2]")
    WebElement dot2;
	
	@FindBy(xpath = "//*[@id=\"slider-carousel\"]/ol/li[3]")
    WebElement dot3;
	
    public HomePage(){
    	//to conncet webelement with driver we are using pagefactory
        PageFactory.initElements(driver,this);
    }
    public void sliderClick() {
    	dot1.click();
    	dot2.click();
    	dot3.click();
    } 
    	
    }



