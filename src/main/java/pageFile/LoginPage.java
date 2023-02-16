package pageFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseFile.TestBase;

public class LoginPage extends TestBase {

   @FindBy(xpath= "//input[@type='email']")
   WebElement username;
   
   @FindBy(xpath= "//input[@type='password']")
   WebElement password;
   
   @FindBy(xpath= "//input[@type='button']")
   WebElement SignInBtn;
   
   @FindBy(linkText= "Join Us")
   WebElement signUpBtn;
   
   @FindBy(xpath="//*[@class='pre-logo-svg']")
   WebElement nikeLogo;
   
   @FindBy(xpath="//div[@class='error']")
   WebElement emailErr;
   
   @FindBy (linkText="Women")
   WebElement Women;
   
   
   //Initializing the Page Objects
   public LoginPage() {
	   
	   PageFactory.initElements(driver, this);
	      }
   
   //Actions
  public String validateLoginPageTitle() {
	   return driver.getTitle();
   }   
  public boolean validateNikeImage() {
	 return nikeLogo.isDisplayed();
 } 
 public void Login(String un , String pass) throws Throwable {
	 
	 username.sendKeys(un);
	 password.sendKeys(pass);
	 SignInBtn.click();
    }
 
 public void loginWrongEm(String us, String pass) {
	 
	 username.sendKeys(us);
	 password.sendKeys(pass);
	 SignInBtn.click();
 }
 
 public String readEmailErr() {
	  String actualErr = emailErr.getText();
		System.out.println(actualErr);
		return actualErr;
 }
 
 public WomenPage Womentitle() {
	  Women.click();
	  return new WomenPage();
	 
 }
 
 
 
}
