package com.testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class task4_d7 {
	WebDriver driver;
	@BeforeTest
	public void openUrl() {
		 WebDriverManager.chromedriver().setup();
		   driver=new EdgeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
	}
  @Test
  public void login() throws InterruptedException {
	  Thread.sleep(3000);
	  WebElement e=driver.findElement(By.xpath("//input[@name=\"username\"]"));
	  e.sendKeys("Admin");
	  WebElement f=driver.findElement(By.xpath("//input[@name=\"password\"]"));
	  f.sendKeys("admin123");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  Thread.sleep(3000);
	  String s=driver.getCurrentUrl();	
	  String s1="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
      Assert.assertEquals(s,s1);	  
	  
	  
	  
  }
  @Test(dependsOnMethods = "login")
  public void logout() throws InterruptedException {
//	  WebDriverManager.chromedriver().setup();
//	  WebDriver driver=new EdgeDriver();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//p[contains(text(),\"Paul Collings\")]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Logout")).click();
	  Thread.sleep(3000);
	  String url1=driver.getCurrentUrl();
	  String url2="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	  if(url1.equals(url2))
	  {
		  System.out.println("logout successfull");
	  }
  }
  @AfterTest
 
  public void close() {
	  driver.quit();
  }
}
