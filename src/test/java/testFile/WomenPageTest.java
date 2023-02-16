package testFile;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseFile.TestBase;
import pageFile.LoginPage;
import pageFile.WomenPage;

public class WomenPageTest extends TestBase{

	LoginPage loginPage;
	WomenPage womenPage;
	
	public WomenPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
	initialization();
	loginPage = new LoginPage();
	womenPage= loginPage.Womentitle();
}
	
	@Test (priority=1)
	public void WomenPageTiltleTest() {
		String title = womenPage.validateWomenPageTitle();
		Assert.assertEquals(title, "Women's Shoes, Clothing & Accessories. Nike CA");
	}                               
	
	@Test (priority=2)
	public void WomenTestLabel() {
	boolean flag1= womenPage.validateWomenLabel();
	Assert.assertTrue(flag1);
		}
		
	@Test (priority=3)
	public void JordanLogoTest() {
	boolean flag2= womenPage.validateJordanImage();
	Assert.assertTrue(flag2);
		}
	
		
	@AfterMethod
	
	public void afterMethod() {
		womenPage.closeBrowser();
	}

}




	
	
	
	

