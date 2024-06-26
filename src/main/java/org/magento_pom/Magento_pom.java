package org.magento_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Magento_pom {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//div[@class='panel header']//a[contains(text(),'Sign In')]")
	private WebElement sigin;
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	@FindBy(xpath="//input[@name='login[password]']")
	private WebElement password;
	@FindBy(xpath="(//span[text()='Sign In'])[1]")
	private WebElement signinbutton;
	@FindBy(xpath="//span[text()='Women']")
	private WebElement women;
	@FindBy(xpath="(//span[text()='Tops'])[3]")
	private WebElement tops;
	@FindBy(xpath="//a[text()='Hoodies & Sweatshirts']")
	private WebElement hoodies;
	@FindBy(xpath="//a[normalize-space()='Eos V-Neck Hoodie']")
	private WebElement hoodiename;
	@FindBy(xpath="//div[@id='option-label-size-143-item-167']")
	private WebElement hoodiesize;
	@FindBy(xpath="//div[@id='option-label-color-93-item-53']")
	private WebElement hoodiecolor;
	@FindBy(xpath="//input[@id='qty']")
	private WebElement quqntity;
	
	
	
	public By qty = By.xpath("//input[@id='qty']");
	public By cart = By.xpath("//span[text()='Add to Cart']");
	//public By showcart = By.xpath("//a[@class='action showcart']");
	//public By shopcart = By.xpath("//a[text()='shopping cart']");
	
	 public By shoppingcart = By.xpath("//span[@data-bind=\"css: { empty: !!getCartParam('summary_count') == false && !isLoading() }, blockLoader: isLoading\"]");
	 public By edititem = By.xpath("//a[@title='Edit item']");
	 public By sizchng = By.xpath("//div[@id='option-label-size-143-item-168']");
	 public By colorchng = By.xpath("//div[@id='option-label-color-93-item-56']");
	 public By update = By.xpath("//button[@id='product-updatecart-button']");
	 public By shipping = By.xpath("//strong[@id='block-shipping-heading']");
	// public By cty = By.xpath("//select[@id='WEBKKKR']");
	//@FindBy(xpath="//select[@name='country_id']")
	//private WebElement cty;
	 public By ctry = By.xpath("//fieldset[contains(@class,'fieldset estimate')]//select[@name='country_id']");
	public By scty = By.xpath("//option[@value='IN']");
	
	public By mentab = By.xpath("//span[text()='Men']");
	
	public By jckt = By.xpath("//a[text()='Jackets']");
	
	public By jcktname = By.xpath("(//a[@class='product-item-link'])[1]");
	
	public By compar = By.xpath("(//span[text()='Add to Compare'])[1]");

	public By clist = By.xpath("//a[text()='comparison list']");
	
	public By print = By.xpath("//span[text()='Print This Page']");
	
	
	
	
	
	//public WebElement getCty() {
	///	return cty;
	//}
	public WebElement getWomen() {
		return women;
	}
	public WebElement getTops() {
		return tops;
	}
	public WebElement getHoodies() {
		return hoodies;
	}
	public WebElement getHoodiename() {
		return hoodiename;
	}
	public WebElement getHoodiesize() {
		return hoodiesize;
	}
	public WebElement getHoodiecolor() {
		return hoodiecolor;
	}
	public WebElement getQuqntity() {
		return quqntity;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSigninbutton() {
		return signinbutton;
	}
	public WebElement getSigin() {
		return sigin;
	}

	public Magento_pom(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

}
 
