package test.sonali.core;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	
	
	protected WebDriver driver;
	
	public PageBase(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public PageBase refreshPage() {
		 driver.navigate().refresh();
		 return this;
	}

}
