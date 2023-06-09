package com.testng;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task5_d7 {
	@Test(groups = "SmokeTest")
	  public void testCase01() {
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://www.godaddy.com/en-in");
		  driver.manage().window().maximize();
//		  Thread.sleep(3000);
		  String s=driver.getTitle();
		  String s1="Domain Names,Websites,Hosting&Online Marketing Tools-GoDaddy In";
		  Assert.assertEquals(s,s1);
		  String s2=driver.getCurrentUrl();
		  Assert.assertEquals(s2,"https://www.godaddy.com/en-in");
		  System.out.println("testCase01");
		  driver.quit();
		  
		  
	  }
	  @Test(groups = "Regression")
	  public void testCase02() {
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://www.godaddy.com/en-in");
		  driver.manage().window().maximize();
//		  WebDriverWait wait=new WebDriverWait(webDriverReference,Timeout<R>)
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By.linkText("Domain")).click();
		  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul[1]/li[2]/div/span")).click();
		  
		  
	  }
	  @Test(groups = "Regression")
	  public void testCase03() {
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://www.godaddy.com/en-in");
		  driver.manage().window().maximize();
		  
		  
	  }
}
