package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task2_d5 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		
		String s = driver.getCurrentUrl();
		System.out.println(s);
		String url = "https://j2store.net/free/";
		if(s.equals(url))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("window.scrollBy(0,1000)", "");
		
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
		driver.get("https://j2store.net/free/index.php/shop?filter_catid=11");
		
		String clothurl = driver.getCurrentUrl();
		System.out.println(clothurl);
		String url2 = "https://j2store.net/free/index.php/shop?filter_catid=11";
		if(clothurl.equals(url2))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		
	}
}
