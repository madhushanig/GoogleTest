package test.sonali.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import test.sonali.core.BaseTest;
import test.sonali.pages.GoogleHomePage;
import test.sonali.pages.GoogleResultsPage;

public class GoogleSerachTest extends BaseTest {

	private GoogleHomePage home;
	private GoogleResultsPage result;

	@Test(priority = 1)
	public void checkGoogleHomePageAvailability() {

		home = new GoogleHomePage(driver);
		Assert.assertTrue(home.getPageAvailability());

	}

	@Test(priority = 2)
	public void checkGoogleResults() {

		result = home.search();
		Assert.assertTrue(result.getResultsAvailability());

	}

	@Test(priority = 3)
	public void checkGoogleResultsTitle() {

		String title = result.getMostReleventResultTitle();
		Assert.assertEquals(title, "Home - Mitra Innovation Brighter togethe");

	}

	@Test(priority = 4)
	public void checkGoogleResultsLink() {

		String link = result.getMostReleventResultLink();
		Assert.assertEquals(link, "https://mitrai.com/");

	}

}
