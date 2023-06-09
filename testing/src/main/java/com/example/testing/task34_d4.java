package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task34_d4 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Dhanziii");
		driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("Dhanzi123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("Subha");
		driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("subha123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-theme\"]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("Happy Birthday babe!");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2500)", "") ;
	
		WebElement amount = driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
		amount.clear();
		amount.sendKeys("500");
	}
}	
