package commonActions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchBrowser {
	static WebDriver driver;

	public WebDriver openBrowser(String browser,String url){
		try{
				String Firefoxdriverpath="/Users/Manjusha/Downloads/geckodriver";
				System.setProperty("webdriver.gecko.driver", Firefoxdriverpath);
				driver = new FirefoxDriver();  	

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}catch(Exception e){
			e.printStackTrace();
		}		
		return driver;
	}

}
