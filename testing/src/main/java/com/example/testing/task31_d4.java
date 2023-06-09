package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task31_d4 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Subhashini");
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("K S");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("subhashiniks01@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("subha123");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2000)", "") ;
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
