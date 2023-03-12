package com.shopping.TestCases;

import org.testng.annotations.Test;


import com.shopping.TestBase.TestBase;
import com.shopping.TestPages.HomePage;
import com.shopping.TestPages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginPageTest extends TestBase
{
	HomePage Home;
	  LoginPage Loginp;
	  
	  public LoginPageTest() 
	  {
			super();
		}
	  
	  @BeforeMethod
	  void setup() 
	  {
		  Initialization();
		  Home = new HomePage();
		  Loginp = new LoginPage();
		  }
	  
	  @Test
	  void VerifyValidLogin() 
	  {
		  Loginp = Home.ClickonLogin(); 
		  Loginp.Login(prop.getProperty("EmailId"), prop.getProperty("Password"));
		  Assert.assertEquals("https://automationexercise.com/", "https://automationexercise.com/");
	  }
	  
	  
	  @AfterMethod
	  void teradown() 
	  {
		  wd.quit();
	  }
	  
	}
  
