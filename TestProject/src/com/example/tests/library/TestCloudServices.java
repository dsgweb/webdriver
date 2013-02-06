package com.example.tests.library;


import org.testng.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.template.pageobjects.CloudServicesPage;
import com.template.pageobjects.HomePage;
import com.template.util.ParentTestCase;

/**
 * 
 * @author Altimetrik
 *
 */
public class TestCloudServices extends ParentTestCase {

	private HomePage homePage;
	private CloudServicesPage cloudPage;

	/**
	 * Test Case 1 - On Cloud Services check Altimetrik logo
	 */
	@Test
	public void checkAltimetrikLogoLink(){
		//Step 1
		this.generateEnvironment();
		//this.homePage.clickCloudServicesLink();
		//this.assertLinksDisplayed();
		//Assert.assertEquals("Cloud Services", cloudPage.getCloudServicesText());
	}
	
	/**
	 *  Generate Environment
	 */
	private void generateEnvironment() {
		this.homePage = PageFactory.initElements(driver, HomePage.class);
		this.cloudPage = PageFactory.initElements(driver, CloudServicesPage.class);
		driver.get("http://www.altimetrik.com");
	}
	
	/**
	 * Assert Links
	 */
	private void assertLinksDisplayed(){
		//Expected Results
		Assert.assertTrue(homePage.getAltimetrikLogo().getText().equals("Design Services"));
		Assert.assertTrue(homePage.getLinkAboutUs().isDisplayed(),"Link is not Displayed");
		Assert.assertTrue(homePage.getLinkCarrers().isDisplayed(),"Link is not Displayed");
		Assert.assertTrue(homePage.getLinkClients().isDisplayed(),"Link is not Displayed");
		Assert.assertTrue(homePage.getLinkCloudServices().isDisplayed(),"Link is not Displayed");
		Assert.assertTrue(homePage.getLinkContactUS().isDisplayed(),"Link is not Displayed");
		Assert.assertTrue(homePage.getLinkDesignServices().isDisplayed(),"Link is not Displayed");
		Assert.assertTrue(homePage.getLinkMobilePayments().isDisplayed(),"Link is not Displayed");
		Assert.assertTrue(homePage.getLinkMobileServices().isDisplayed(),"Link is not Displayed");
		Assert.assertTrue(homePage.getLinkSapServices().isDisplayed(),"Link is not Displayed");
		Assert.assertTrue(homePage.getLinkTerms().isDisplayed(),"Link is not Displayed");
	}
}