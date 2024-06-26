package org.magento.magento;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagentoBaseclass {
	
public static WebDriver driver;

	
	public static void url(WebDriver driver, String s) {
		driver.get(s);
	}
	public static void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public static void toClick(WebElement e) {
		e.click();
	}
	public static void toSendValue(WebElement c, String v) {
		c.sendKeys(v);
	}
	public static void toAlert(WebDriver driver) {
		Alert a1= driver.switchTo().alert();
		a1.accept();
	}
	public static void toDismiss(WebDriver driver) {
		Alert a2= driver.switchTo().alert();
		a2.dismiss();
	}
	public static void actionClass(WebDriver driver, WebElement f) {
		Actions a = new Actions(driver);
		driver.findElement((By) f);
		a.moveToElement(f).perform();
	}
	public static void doubleClick(WebDriver driver, WebElement h) {
		Actions a = new Actions(driver);
		driver.findElement((By) h);
		a.doubleClick(h).perform();
	}
	public static void contextClick(WebDriver driver, WebElement j) {
		Actions a = new Actions(driver);
		driver.findElement((By) j);
		a.contextClick(j).perform();
	}
	public static void TakingScreenshot(WebDriver driver, String k) throws IOException {
		TakesScreenshot t = (TakesScreenshot)driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File des = new File(k);
		FileUtils.copyFile(source, des);
	}
	public static void toScroll(WebDriver driver, WebElement g) {
		WebElement scroll = driver.findElement((By) g);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView()", scroll);
	}
	
	public static void Scroll(WebElement srl) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", srl);
	}
	
	 public static void Scroll(WebDriver driver, WebElement srl) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView()", srl);
	    }
	
	public static void robotClass(int v) throws AWTException {
		Robot r = new Robot();
		r.keyPress(v);
		r.keyRelease(v);
	}
	public static void toSelect(WebElement q, int c) {
		Select drop = new Select(q);
		drop.selectByIndex(c);
		
	}
	public static void toSelectText( WebElement q, String v) {
		Select drop = new Select(q);
		drop.selectByVisibleText(v);
		
	}
	
	

}
