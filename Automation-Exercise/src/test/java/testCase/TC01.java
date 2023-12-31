package testCase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import testBase.WebTestBase;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.JavascriptExecutor;

public class TC01 extends WebTestBase {
		LoginPage loginPage;
		HomePage homePage;
		MyAccountPage myAccountPage;
			//loading the config file
			public TC01() {
				super();
			}
			
			
			@BeforeMethod
			public void BeforeMethod() {
				initialization();
				loginPage=new LoginPage();
				homePage=new HomePage();
				myAccountPage=new MyAccountPage();
				
			}
		/*	@Test
			public void VerifyLogin() {
				//In Selenium, Asserts are validations or checkpoints for an application.
				SoftAssert softAssert = new SoftAssert();
			     //loginPage.login(prop.getProperty("emaPageFactory.initElements(driver, this)il"), prop.getProperty("password"));
			     softAssert.assertAll();
			     
			     
			}*/
			@Test
			public void verifySlider() {
				
				SoftAssert softAssert = new SoftAssert();
				homePage.sliderClick();
				 softAssert.assertAll();
				
			}
			
			/*@Test
			 public void MouseHover() {
				   SoftAssert softAssert = new SoftAssert();
				   myAccountPage.mouseHover();
				   softAssert.assertAll();
				 }
			
		@Test(priority=1)
			public void verifyScrollDown() {
				JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
				javascriptExecutor.executeScript("window.scrollBy(0,2000)");
			}
		
			@Test(priority=2)
			public void verifyScrollUp() {
				JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
				javascriptExecutor.executeScript("window.scrollBy(0,2000)");
			}
			
			@Test(priority=3)
			 public void verifyScreenshot() throws IOException{
			     SoftAssert softAssert = new SoftAssert();
			     myAccountPage.getScreenshot();
			     softAssert.assertAll();
			 }
			//C:\Users\Admin\eclipse-workspace\AutomationExcercise\screenshot\AutomationExcercise.png (screenshot path)
			
			
			@Test
			public void verifySearchBar() throws InterruptedException{
			     SoftAssert softAssert = new SoftAssert();
			     myAccountPage.search();
			     System.out.println(myAccountPage.getTextOfSearch());
			     softAssert.assertEquals(myAccountPage.getTextOfSearch(),"SEARCHED PRODUCTS" );
			    
			     softAssert.assertAll();
			 }
			
			
			@Test
			public void verifyGetWindowhandle() throws InterruptedException {
				SoftAssert softAssert = new SoftAssert();
			     myAccountPage.verifyGetWindowhandle();
			     softAssert.assertAll();
			}
			
			
			@Test
			public void verifyCookieHandle() {
				SoftAssert softAssert = new SoftAssert();
			     myAccountPage.getCookiesHandle();
			     softAssert.assertAll();
			}
			
			@Test
			public void verifyAddToCart() {
			     SoftAssert softAssert = new SoftAssert();
			     myAccountPage.AddToCart();
			     //softAssert.assertEquals(myAccountPage.AddToCartResult(),"Added" );
			    
			     softAssert.assertAll();
			 }*/
			
			@AfterMethod
			public void AfterMethod() {
				driver.close();
			}

			
			}

			

