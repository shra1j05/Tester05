package com.shopping.TestPages;

import org.testng.annotations.Test;

import com.shopping.TestBase.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class LoginPage extends TestBase
{
	@FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")
	 WebElement EmailId;
	 
	 @FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]")
	 WebElement Password;
	 
	 @FindBy(xpath = "//button[contains(text(),'Login')]")
	 WebElement LoginButton;
	 
	 public LoginPage() 
	{
		 
		 PageFactory.initElements(wd, this);
	 }

	 public void Login(String Email, String Pword) 
	 {
		 EmailId.sendKeys(Email);
		 Password.sendKeys(Pword);
		 LoginButton.click();
		
	 }	 	 	
  
  }


