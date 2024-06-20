package org.magento_stepdef;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.magento.magento.MagentoBaseclass;
import org.magento_pom.Magento_pom;
import org.magento_runner.Magento_runner;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Magento_stepdef extends MagentoBaseclass {
	
	WebDriver driver= Magento_runner.driver;
	Magento_pom mp = new Magento_pom(driver);
	
	@Given("launch the url and maximizing")
	public void launch_the_url_and_maximizing() {
		
		url(driver, "https://magento.softwaretestingboard.com/");
	}
	@When("click signin button")
	public void click_signin_button() {
		toClick(mp.getSigin());
	}
	@When("enter valid email id")
	public void enter_valid_email_id() {
	   toSendValue(mp.getEmail(), "manju.juve@gmail.com");
	}
	@Then("enter valid password")
	public void enter_valid_password() {
	    toSendValue(mp.getPassword(), "manju@12345");
	}
	@Then("click sigin button")
	public void click_sigin_button() {
	    toClick(mp.getSigninbutton());
	}
	@Then("click womens tab")
	public void click_womens_tab() {
		toClick(mp.getWomen());
	}
	@Then("click Tops button")
	public void click_tops_button() {
		toClick(mp.getTops()); 
	}
	@Then("click hoodies and sweatshits tab")
	public void click_hoodies_and_sweatshits_tab() {
	    toClick(mp.getHoodies());
	}
	@Then("select the required model")
	public void select_the_required_model() {
	   toClick(mp.getHoodiename());
	}
	@Then("select the required size")
	public void select_the_required_size() {
	    toClick(mp.getHoodiesize());
	}
	@Then("select the required color")
	public void select_the_required_color() {
	    toClick(mp.getHoodiecolor());
	    System.out.println("A");
	}
	@Then("enter the required quantity")
	public void enter_the_required_quantity() throws AWTException {
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DELETE);
//		r.keyRelease(KeyEvent.VK_DELETE);
//	    toSendValue(mp.getQuqntity(), "2");
	    
//	    mp.getQuqntity().clear();
//	    
//	    toSendValue(mp.getQuqntity(), "2");
		
		driver.findElement(mp.qty).clear();
		
		driver.findElement(mp.qty).sendKeys("3");
	}


	
	
	
	
	
	
	
	
	

}
