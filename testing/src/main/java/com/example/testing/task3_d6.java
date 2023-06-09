package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3_d6 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.wpeverest.com/user-registration/paypal-integration-form/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("Subha1306@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Subha@123");
		driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_Keyboard\"]")).click();
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_Keyboard\"]"));
		if(!checkbox.isSelected())
		{
			System.out.println("NotSelected");
		}
		else
		{
			System.out.println("Selected");
			
		}
	}
}
