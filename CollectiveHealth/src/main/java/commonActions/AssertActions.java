package commonActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class AssertActions {
	public void assertPageTitle(String expectedTitle,WebDriver driver){
		Assert.assertEquals(expectedTitle,driver.getTitle());
	}

	public void isDisplayedTrue(WebElement ele){
		Assert.assertTrue(ele.isDisplayed());
	}

	public void isTextSame(String s1,String s2){
		Assert.assertEquals(s1, s2);
	}
}
