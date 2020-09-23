package com.shoaib.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // Launch Chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.flipkart.com/");

		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 10);

		//Explicit Wait applied for email webelement
		WebElement email = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")));
		email.sendKeys("test@test.com");
	}

}
