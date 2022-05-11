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
public class AddToCartPage extends BaseClass{
	
	@FindBy(id="quantity_wanted")
	WebElement quantity;
	
	
	@FindBy (name="group_1")
	WebElement size;
	
	@FindBy(xpath ="//span[text()='Add to cart']")
	WebElement addToCartBtn;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]//h2/i")
	WebElement addToCartMessage;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	WebElement processToCHeckOutBtn;
	
	
	//Constructor
	public AddToCartPage() {
	PageFactory.initElements(driver, this);
	}
	
	public void enterQuantity(String quantity1) {
		Action.type(quantity, quantity1); 
	}
	
	public boolean selectSize(String size1){
		return Action.selectByVisibleText(size1, size);
		
	}
	
	public void clickOnAddToCart () {
		Action.click(driver, addToCartBtn);
	}
	
	public boolean validateAddtoCart() {
		Action.fluentWait(addToCartMessage, 10);
		return Action.isDisplayed(driver, addToCartMessage);
	}
	
	public OrderPage clickOnCheckOut() {
		Action.fluentWait(processToCHeckOutBtn, 10);
		Action.JSClick(driver, processToCHeckOutBtn);
		//Action.fluentWait(processToCHeckOutBtn, 10);
		return new OrderPage();
	}
	
}
