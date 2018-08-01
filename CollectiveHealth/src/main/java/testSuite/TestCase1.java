package testSuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import commonActions.AssertActions;
import commonActions.LaunchBrowser;
import uiMap.ResultsPage;
import uiMap.SearchPage;

public class TestCase1 {

	WebDriver driver;
	AssertActions aa = new AssertActions();
	
	@BeforeTest
	public void googleImagePage(){
		driver = new LaunchBrowser().openBrowser("firefox", "https://images.google.com/");

	}

	@Test
	@Parameters("imageCnt")
	public void clickImageN(int imageCnt){
		
		SearchPage sp = new SearchPage(this.driver);

		//Enter the search text
		sp.searchTextArea.sendKeys("hills");
		sp.searchButton.click();

		//verify search results
		verifyResultsPage(driver,imageCnt);

	}

	public void verifyResultsPage(WebDriver driver,int imageCnt){
		ResultsPage rp = new ResultsPage(this.driver);
		aa.isDisplayedTrue(rp.imageOption);
		rp.searchResults.get(imageCnt).click();

	}

	@AfterMethod
	public void closeBrowser(){
		this.driver.quit();
	}
}
