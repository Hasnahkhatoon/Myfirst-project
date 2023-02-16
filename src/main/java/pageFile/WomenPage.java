package pageFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseFile.TestBase;

public class WomenPage extends TestBase{
	
	@FindBy(xpath="//*[@class='pre-logo-svg']")
	   WebElement nikeLogo;
	
	@FindBy(xpath="//h1[contains(text(),'Women')]")
	WebElement Women;
	
	@FindBy(xpath="//a[@aria-label='Jordan']")
	WebElement Jordan;
	
	@FindBy(linkText="Kids")
	WebElement Kids;
	
	 public WomenPage() {
		   
		   PageFactory.initElements(driver, this);
		      }
	   
	   //Actions
	  public String validateWomenPageTitle() {
		   return driver.getTitle();
	   }   
	 
	  public boolean validateWomenLabel() {
		 return Women.isDisplayed();
	 } 
	
	  public boolean validateJordanImage() {
			 return Jordan.isDisplayed();
		 } 
	  
	  
	public void closeBrowser() {
		driver.quit();
	}

	

}
