package test.sonali.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import test.sonali.core.PageBase;

public class GoogleHomePage extends PageBase {
	

	
	@FindBy (name="q")
	private WebElement GoogleSearchInputBox;
	
	@FindBy (name="q")
	private List<WebElement> GoogleSearchInputBoxs;
	
	@FindBy (name="btnK")
	private WebElement GoogleSearchButton;
	
	@FindBy (name="btnI")
	private WebElement GoogleFeelingLuckeyButton;
	
	
	public GoogleHomePage(WebDriver driver) {
		super(driver);
	}
	
	
	public boolean getPageAvailability() {
		return (GoogleSearchInputBoxs.size() > 0);
	}
	public GoogleResultsPage search() {
		GoogleSearchInputBox.clear();
		GoogleSearchInputBox.sendKeys("Mitra");
		GoogleSearchButton.click();
		
		return new GoogleResultsPage(driver);
		
	}
	
	public GoogleResultsPage feelingLuckySearch() {
		GoogleSearchInputBox.clear();
		GoogleSearchInputBox.sendKeys("Mitra");
		GoogleFeelingLuckeyButton.click();
		
		return new GoogleResultsPage(driver);
		
	}
	

}
