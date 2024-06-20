package org.magento_runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\Magento_feature\\magento.feature", glue="org.magento_stepdef")

public class Magento_runner {
	public static WebDriver driver;
	
	@BeforeClass
	
	public static void start() {
		driver = new ChromeDriver();
	}

}
