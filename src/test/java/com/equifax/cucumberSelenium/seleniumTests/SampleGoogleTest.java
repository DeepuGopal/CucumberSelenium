package com.equifax.cucumberSelenium.seleniumTests;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SampleGoogleTest {

	private static WebDriver driver;
	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://newtours.demoaut.com/");
		
		 driver.findElement(By.linkText("REGISTER")).click();
		 String actual="Home";
		 String expected=driver.findElement(By.xpath("//a[text()='"+actual+"']")).getText();
		 Assert.assertEquals("Passed", expected, actual);
		 
	}

}
