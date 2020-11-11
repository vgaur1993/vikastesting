package com.deere.ics.testcase;

import java.util.ArrayList;
import java.util.Iterator;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.deere.ics.Business.applicationLogin_pt_BR;
import com.deere.ics.Driver.Driver1;
import com.deere.ics.Page.Pageclass1;
import com.deere.ics.Utility.TestUtil;
import com.deere.ics.Utility.ExtentReport;

public class logintoApplication_pt_BR_AG extends ExtentReport {

	public applicationLogin_pt_BR ApplicationLogin;
	WebDriver driver;
	// public Pageclass1 xa ;

	public logintoApplication_pt_BR_AG() throws Exception {

		this.driver = Driver1.getDriver();

		ApplicationLogin = new applicationLogin_pt_BR(driver);

		// xa =new Pageclass1(driver);

	}

	/*
	 * @Test(priority = 1) public void logintoICSTest_pt_BR_AG() throws Exception {
	 * 
	 * test = extent.createTest("logintoICSTest_pt_BR_AG",
	 * "Login into the Application pt_BR_AG "); Thread.sleep(1000);
	 * 
	 * ApplicationLogin.loginToApplication_AG();
	 * 
	 * Thread.sleep(1000);
	 * 
	 * Assert.assertTrue(driver.findElement(By.linkText("Impersonate User")).
	 * isDisplayed());
	 * 
	 * }
	 */

	@Test(priority = 2)

	public void ImpersonationTest_pt_BR_AG() throws Exception {
		test = extent.createTest("ImpersonationTest_pt_BR_AG", "Selection of SBU,Locale and UserType pt_BR_AG");

		Thread.sleep(1000);

		ApplicationLogin.ImpersonationData_AG();

	}

	@Test(priority = 3)

	public void UsertypeLinkTest_pt_BR_AG() throws Exception {
		test = extent.createTest("UsertypeLinkTest_pt_BR_AG",
				"TestALL page Selecting User type link to build the basecode pt_BR_AG");
		Thread.sleep(3000);

		ApplicationLogin.UsertypeLink_AG();

	}

	@Test(priority = 4)

	public void SoldandShipToTest_pt_BR_AG() throws Exception {
		test = extent.createTest("SoldandShipToTest_pt_BR_AG",
				"TestALL page Selecting User type link to build the basecode pt_BR_AG");
		Thread.sleep(3000);

		ApplicationLogin.SoldandShipTo_AG();

	}

	@Test(priority = 5)

	public void BasecodeSelectionTest_pt_BR_AG() throws Exception {
		test = extent.createTest("BasecodeSelectionTest_pt_BR_AG",
				"Selection of base code on Model search page pt_BR_AG ");
		ApplicationLogin.BasecodeSelection_AG();
	}

	@Test(priority = 6)

	public void BuildyourProductTest_pt_BR_AG() throws Exception {

		test = extent.createTest("BuildyourProductTest_pt_BR_AG", "Configure Required Option code on Build Page BR ");

		ApplicationLogin.BuildyourProduct_AG();
	}

	@Test(priority = 7)

	public void CustomizeproductTest() throws Exception {
		test = extent.createTest("CustomizeproductTest", "Configure Optional Option code on Customize Page BR");

		ApplicationLogin.Customizeproduct_AG();
	}

	@Test(priority = 8)

	public void ViewSummarypageTest() throws Exception {
		test = extent.createTest("ViewSummarypageTest",
				"Selection Of dealer Account nad Revie Availibility of configured product BR");

		ApplicationLogin.ViewSummarypage_AG();
	}

	@Test(priority = 9)

	public void SavetheCartTest() throws Exception {
		test = extent.createTest("SavetheCartTest", "Saving the configured product BR");

		ApplicationLogin.SavetheCart_AG();

	}

}