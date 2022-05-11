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
public class OrderSummary extends BaseClass {
	
	@FindBy(xpath="//span[conatains(text(),'I confirm my order')]")
	WebElement confirmOrderBtn;
	
	
	public OrderSummary() {
		PageFactory.initElements(driver, confirmOrderBtn);
	}
	
	public OrderConfirmationPage clickOnConfirmOrderBtn() {
		Action.click(driver, confirmOrderBtn);
		return new OrderConfirmationPage();
	}

}
