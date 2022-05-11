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
public class PaymentPage extends BaseClass {
	
	@FindBy(xpath="//a[contains(text(),'Pay by bank wire')]")
	WebElement bankWireMwthod;
	
	@FindBy (xpath="//a[contains(text(),'Pay by check')]")
	WebElement payByCheckMethode;
	
	
	public PaymentPage () {
		
		PageFactory.initElements(driver, this);
	}
	
	public OrderSummary clickOnPaymentMethod() {
		Action.click(driver, bankWireMwthod);
		return new OrderSummary();
	}
	

}
