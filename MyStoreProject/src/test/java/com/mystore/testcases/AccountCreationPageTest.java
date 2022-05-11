/**
 * 
 */
package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AccountCreationPage;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

/**
 * @author Mayur
 *
 */
public class AccountCreationPageTest extends BaseClass {
	
	
	IndexPage indexpage;
	LoginPage loginPage;
	
	AccountCreationPage accountCreationPage;
	
	@BeforeMethod
	public 	static void setup() {
		
		launchApp(null);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void verifyCreateAccountPageTest() {
		indexpage = new IndexPage();
		loginPage=indexpage.clickOnSignIn();
		accountCreationPage=loginPage.creatNewAccount("abcdefg@gmail.com");
		boolean result=accountCreationPage.validateAccountCreatePage();
		Assert.assertTrue(result);
		
		
	}

}
