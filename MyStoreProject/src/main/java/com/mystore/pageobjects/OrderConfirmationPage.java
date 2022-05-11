/**
 * 
 */
package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

/**
 * @author Mayur
 *
 */
public class OrderConfirmationPage extends BaseClass {
	
	
	@FindBy(xpath="//p/strong[contains(text(),'Your Order on My Store is complete')]")
	WebElement 	confirmMessag;
	
	
	//Constructor
	public OrderConfirmationPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateConfirmMessage() {
		String confirmMsg = confirmMessag.getText();
		return confirmMsg;
	}

}
