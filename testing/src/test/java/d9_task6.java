package com.testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d9_task6 {
	WebDriver driver;
	  @Test
	  public void OpenDriver() {
		  WebDriverManager.edgedriver().setup();
		  driver = new EdgeDriver();
		  driver.get("");
		  
	  }
}
