/**
 * 
 */
package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

/**
 * @author Mayur
 *
 */
public class HomePage extends BaseClass{
	
	@FindBy(xpath="span[text()='My wishlists']")
	WebElement myWishList;
	
	@FindBy(xpath="//span[text()='Order history and details']")
	WebElement orderHistory;
	
	 //Constructor
	public HomePage() {
	 PageFactory.initElements(driver, this);
	}
	
	
	public boolean validateMyWishlist() {
		return Action.isDisplayed(driver, myWishList);
	}
	
	public boolean validateOrderHistory() {
		return Action.isDisplayed(driver, orderHistory);	
	}
	
	public String getCurrURL() {
		String homepageURL = driver.getCurrentUrl();
		return homepageURL;
	}
	

}
 