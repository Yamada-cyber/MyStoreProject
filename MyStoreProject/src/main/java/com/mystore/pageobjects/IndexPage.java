package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class IndexPage extends BaseClass{

	@FindBy(xpath ="//a[@class='login']")
	WebElement signInBtn;
	
	@FindBy(xpath ="//img[@class='logo img-responsive']")
	WebElement mystoreLogo;
	
	@FindBy(id="search_query_top")
	WebElement searchProductBox;
	
	@FindBy(name="submit_search")
	private WebElement searchButton;
	
	//constructor
	public IndexPage() {
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage clickOnSignIn() {
		Action.fluentWait(signInBtn, 10);
		Action.click(driver,signInBtn);
		return new LoginPage();
		
	}
	
	public boolean validateLogo() {
		return Action.isDisplayed(driver,mystoreLogo);
	}
	
	public String getMyStoreTitle() {
		String myStoreTitle = driver.getTitle();
		return myStoreTitle;
	}	
	
	public SearchResultPage searchProduct(String productName) {
		Action.type(searchProductBox,productName);
		Action.click(driver, searchButton);
		return new SearchResultPage();
	}
	
	
	
}
