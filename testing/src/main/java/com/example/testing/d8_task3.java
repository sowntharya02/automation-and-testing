package com.example.testingday8;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d8_task3 {
	public static void main(String[] args)
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.manage().window().maximize();
	WebElement txt=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
	txt.sendKeys("401");
	WebElement submit=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
	submit.click();
	Alert s=driver.switchTo().alert();
	s.dismiss();
	txt.clear();
	txt.sendKeys("402");
	submit.click();
	s.accept();
	Alert s1=driver.switchTo().alert();
	String str=s1.getText();
	System.out.println(str);
	s1.accept();
	

	
	
	
	}
}
