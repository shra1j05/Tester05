package com.shopping.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestBase
{
  public static WebDriver wd;
  public static Properties prop;
  
  
  public TestBase() 
  {
	 prop=new Properties();
	 try {
		FileInputStream fis=new FileInputStream("C:\\Users\\shra1\\eclipse-workspace\\Framework001\\src\\main\\java\\com\\shopping\\config\\config.properties");
	    try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	 } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 }
  }
	  
  
  
  public void Initialization()
  {
	  String browsername=prop.getProperty("browser");
	  
	  if(browsername.equals("Chrome"))
	  {
		  wd=new ChromeDriver();
	  }
	  else
	  {
		  wd=new FirefoxDriver();
	  }
	      wd.manage().window().maximize();
	      wd.manage().deleteAllCookies();
	      wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      wd.get(prop.getProperty("testurl"));
	  }
	  
  }
  
  
  
  
  
  
  
  

