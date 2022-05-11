/**
 * 
 */
package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.SearchResultPage;

/**
 * @author Mayur
 *
 */
public class SearchResultPageTest extends BaseClass {
	

	IndexPage indexpage;
	SearchResultPage searchResultPage;
	
	@BeforeMethod
	public 	static void setup() {
		
		launchApp(null);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void productAvialabilityTest() {
		indexpage = new IndexPage();
		searchResultPage=indexpage.searchProduct("t-shirst");
		boolean result=searchResultPage.isProductAvailable();
		Assert.assertTrue(result);
	}

}
