/**
 * 
 */
package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;

/**
 * @author Mayur
 *
 */
public class IndexPageTest extends BaseClass {

	IndexPage indexpage;
	
	@BeforeMethod
	public 	static void setup() {
		
		launchApp(null);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void verifyLogo() {
		indexpage = new IndexPage();
		boolean result =indexpage.validateLogo();
		Assert.assertTrue(result);
		
	}
	
	public void verifyTitle() {
		String actTitle = indexpage.getMyStoreTitle();
		Assert.assertEquals( actTitle, "My Store");
	}
	
	
	

}
