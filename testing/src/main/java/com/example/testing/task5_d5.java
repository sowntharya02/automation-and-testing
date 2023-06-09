package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task5_d5 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.smart-hospital.in/site/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[4]/a")).click();
		
		WebElement opd = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3"));
		String name = opd.getText();
		System.out.println(name);
		String tagname = opd.getTagName();
		System.out.println(tagname);
		WebElement search = driver.findElement(By.xpath("//*[@id=\"search-btn\"]"));
//		int width = search.getSize().getWidth();
//		int height = search.getSize().getHeight();
//		System.out.println(width + " " + height);
		System.out.println(search.getSize());
		
		System.out.println(search.getCssValue("color"));
	}
}
