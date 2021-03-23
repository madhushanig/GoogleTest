package test.sonali.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import test.sonali.core.PageBase;

public class GoogleResultsPage extends PageBase {

	@FindBy(className = "hlcw0c")
	private WebElement GoogleResultsArea;

	@FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div[1]/div/div[1]/a/h3")
	private WebElement GoogleMostReleventResultTitle;

	@FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div[1]/div/div[1]/a")
	private WebElement GoogleMostReleventResultLink;

	public GoogleResultsPage(WebDriver driver) {
		super(driver);
	}

	public boolean getResultsAvailability() {
		WebDriverWait wait = new WebDriverWait(driver, 45);

		try {
			wait.until(ExpectedConditions.visibilityOf(GoogleResultsArea));
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public String getMostReleventResultTitle() {
		return GoogleMostReleventResultTitle.getText();

	}

	public String getMostReleventResultLink() {
		return GoogleMostReleventResultLink.getAttribute("href");

	}

}
