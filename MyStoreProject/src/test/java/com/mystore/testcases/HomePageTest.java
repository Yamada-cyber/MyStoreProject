package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class HomePageTest extends BaseClass {


	
	IndexPage indexpage;
	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeMethod
	public 	static void setup() {
		
		launchApp(null);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void wishlistTest() {
		indexpage = new IndexPage();
		loginPage=indexpage.clickOnSignIn();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean result =homePage.validateMyWishlist();
		Assert.assertTrue(result);
	}
	
	@Test
	public void orderHistoryandDeatilsTest() {
		indexpage = new IndexPage();
		loginPage=indexpage.clickOnSignIn();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean result =homePage.validateOrderHistory();
		Assert.assertTrue(result);
	}

}
