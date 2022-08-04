package com.amazon.in;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseoveraction {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abu\\selenium-workspace\\AmazonMOA\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement bestseller = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		Actions a = new Actions(driver);
		a.contextClick(bestseller).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions a1 = new Actions(driver);
		a1.contextClick(mobiles).build().perform();
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		WebElement Service = driver.findElement(By.xpath("//a[text()='Customer Service']"));
		Actions a2 = new Actions(driver);
		a2.contextClick(Service).build().perform();
		Robot r2 = new Robot();
		r2.keyPress(KeyEvent.VK_DOWN);
		r2.keyRelease(KeyEvent.VK_DOWN);
		r2.keyPress(KeyEvent.VK_DOWN);
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);
		// windows Handle
		Set<String> windowHandles = driver.getWindowHandles();
		for (String str : windowHandles) {
			String title = driver.switchTo().window(str).getTitle();
			System.out.println(title);
		}
		String particular = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		for (String parl : windowHandles) {
			if (driver.switchTo().window(parl).getTitle().equals(particular)) {
				break;
			}
			driver.close();
		}

	}

}
