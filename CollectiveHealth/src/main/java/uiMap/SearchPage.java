package uiMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	WebDriver driver;

	@FindBy(id="hplogo")
	public
	WebElement pageLogo;

	@FindBy(id="lst-ib")
	public
	WebElement searchTextArea;

	@FindBy(name="btnG")
	public
	WebElement searchButton;

	//Constructor
	public SearchPage(WebDriver driver){		 
		this.driver = driver; 
		//This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

}
