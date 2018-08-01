package uiMap;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage {

	WebDriver driver;

	@FindBy(css="div.hdtb-mitem:nth-child(2)")
	public
	WebElement imageOption;
	
	@FindBys({@FindBy(xpath="//*[@id='rg_s']"),@FindBy(tagName="img")})
	public
	List<WebElement> searchResults;


	//Constructor
	public ResultsPage(WebDriver driver){		 
		this.driver = driver; 
		//This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

}
