package com.qa.cucumber;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTest {
	
	WebDriver driver;
	
	@Test
	public void testies() {
		System.setProperty("webdriver.chrome.driver", "/home/taoheed/Desktop/chromedriver");

		ChromeOptions chromeOptions = new ChromeOptions();
	      chromeOptions.addArguments("--headless");

	      driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://feedback.ukwest.cloudapp.azure.com/login");
		System.out.println(driver.findElement(By.id("email")));
		driver.quit();
	}
}
