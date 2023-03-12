package com.shopping.TestPages;

import java.util.Locale.Category;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.shopping.TestBase.TestBase;

public class HomePage extends TestBase
{
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	WebElement Home;
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
	WebElement Products;
  
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
	WebElement Cart;
  
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
	WebElement Login;
	
	@FindBy(xpath = "//h2[contains(text(),'Category')]")
	WebElement Category;
 
 
 
 
 public HomePage()
	{		
		
		PageFactory.initElements(wd, this);
	}

	void clickonHomeLink() 
    {
		Home.click();
	}
	
	public String Verifytitle() 
   {
		String title = wd.getTitle();
		return title;
	}
	public boolean VerifyHomePage ()
	{
		boolean catedis = Category.isDisplayed();
		return catedis;
		
	}
	public LoginPage ClickonLogin()
	{
		Login.click();
		return new LoginPage();
	}
	


}


