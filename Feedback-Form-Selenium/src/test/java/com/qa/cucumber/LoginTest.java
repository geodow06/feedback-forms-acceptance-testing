package com.qa.cucumber;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class LoginTest {
	
	WebDriver driver;
	
	@Test
	public void testies() {
		System.setProperty("phantomjs.binary.path", "src/main/resources/phantomjs.exe");
		driver = new PhantomJSDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://feedback.ukwest.cloudapp.azure.com/login");
		System.out.println(driver.findElement(By.tagName("Body")));
	}
}
