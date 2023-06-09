package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1_d7 {
	  @Test
	  public void virtualTitle() {
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		  driver.manage().window().maximize();
		 String actualTitle= driver.getTitle();
		 Assert.assertEquals(actualTitle,"Guest Registration Form-User Registration");
		  
	  }
}
