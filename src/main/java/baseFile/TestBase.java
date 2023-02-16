package baseFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilitiesFile.TestUtil;


public class TestBase {

   public static WebDriver driver;
   public static Properties prop;
   
    public TestBase() {

	try {
	
	FileInputStream f1 =  new FileInputStream("C:\\Users\\hasna\\OneDrive\\Desktop\\Selenium Work Space\\PageObjectModelFramework1\\src\\main\\java\\configFile\\config.properties");
	
    prop = new Properties();
	prop.load(f1);
	
	}catch (FileNotFoundException e)     {
		e.printStackTrace();
	}catch (IOException e)     {

      e.printStackTrace();}
	}
	

	public static void initialization() {

	String browser= prop.getProperty("browser");
      
	if (browser.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hasna\\OneDrive\\Desktop\\SeleniumJar\\geckodriver.exe");
		driver = new FirefoxDriver();
		}else if( browser.equals("chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hasna\\OneDrive\\Desktop\\SeleniumJar\\chromedriver.exe");
		 driver = new ChromeDriver();
		}

	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(prop.getProperty("url"));
	
	 



    }

}
