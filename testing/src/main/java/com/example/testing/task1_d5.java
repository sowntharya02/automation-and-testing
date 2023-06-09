package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1_d5 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		
		String s =driver.getTitle();
		System.out.println(s);
		String str = "Home";
		if(s.equals(str))
		{
			System.out.print(true);
		}
		else
		{
			System.out.print(false);
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");	
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4")).click();
	    driver.get("https://j2store.net/free/index.php/shop?filter_catid=11");
	    String s1=driver.getTitle();
	    System.out.println(s1);
	    String str1="Shop";
        if(s1.equals(str1))
		{
			System.out.print(true);
		}
		else
		{
			System.out.println(false);
		}
	}
}
