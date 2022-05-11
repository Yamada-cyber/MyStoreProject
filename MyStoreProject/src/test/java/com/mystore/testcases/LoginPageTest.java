/**
 * 
 */
package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.utility.Log;

/**
 * @author Mayur
 *
 */
public final class LoginPageTest extends BaseClass{
	
	IndexPage indexpage;
	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeMethod
	public 	void setup() {
		
		launchApp(null);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	public void loginTest() {
		
		Log.startTestCase("loginTest");
		indexpage = new IndexPage();
		Log.info("user is going to click on sigh in ");
		
		loginPage=indexpage.clickOnSignIn();
		Log.info("enter username and password");
		
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		String actualURL=homePage.getCurrURL();
		String expectedURL = "http://automationpractice.com/index.php?controller=my-account ";
		Log.info("verifying if user is able to login");
		Assert.assertEquals(actualURL, expectedURL);
		Log.info("login is succes");
		Log.endTestCase("logintest");
	
		
	}

}
