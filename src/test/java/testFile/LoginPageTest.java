package testFile;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import baseFile.TestBase;
import pageFile.LoginPage;
import pageFile.WomenPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	WomenPage womenPage;
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
		public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}		
	
	@Test (priority=1)
	public void loginPageTiltleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Log in");
	}
		
	@Test(priority=2)
	public void loginImageTest() {
	boolean flag= loginPage.validateNikeImage();
	Assert.assertTrue(flag);
	}
	
	@Test (priority=3)
	public void loginTest() throws Throwable {
		loginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
	}
			
	@Test (priority=4)
	 public void LoginWithWrongEmail()  throws InterruptedException {
			loginPage.loginWrongEm(prop.getProperty("WrongEmail"),prop.getProperty("password"));
	        String expectedErr = prop.getProperty("actualError");
			String actualErr = loginPage.readEmailErr();
			Assert.assertEquals(actualErr, expectedErr);
			 }
	
	@Test (priority=5)
	
	public void verifyWomenTitle() {
		
		womenPage= loginPage.Womentitle();
		
	}

  @AfterMethod
  public void tearDown(){
  driver.quit();
  }
  		
	}

