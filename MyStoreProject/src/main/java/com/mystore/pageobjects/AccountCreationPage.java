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
public class AccountCreationPage extends BaseClass{
      
	@FindBy(xpath = "//h1[text()='Create an Aaccount']")
	WebElement formTitle;


		
		
	
		public boolean validateAccountCreatePage() {
			return Action.isDisplayed(driver, formTitle);
		}
		
}
