package com.deere.ics.testcase;

import java.util.ArrayList;
import java.util.Iterator;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.deere.ics.Business.applicationLogin_pt_BR;
import com.deere.ics.Driver.Driver1;
import com.deere.ics.Page.Pageclass1;
import com.deere.ics.Utility.TestUtil;
import com.deere.ics.Utility.ExtentReport;
import static org.testng.Assert.assertEquals;
import org.testng.Assert;

public class logintoApplication_pt_BR_CF extends ExtentReport {

	public applicationLogin_pt_BR ApplicationLogin;
	WebDriver driver;
	// public Pageclass1 xa ;

	public logintoApplication_pt_BR_CF() throws Exception {

		this.driver = Driver1.getDriver();

		ApplicationLogin = new applicationLogin_pt_BR(driver);

		// xa =new Pageclass1(driver);

	}

	/*
	 * @Test(priority = 1) public void logintoICSTest_pt_BR_CF() throws Exception {
	 * 
	 * test = extent.createTest("logintoICSTest_pt_BR_CF",
	 * "Login into the Application for pt_BR_C&F");
	 * 
	 * Thread.sleep(1000);
	 * 
	 * ApplicationLogin.loginToApplication_CF();
	 * 
	 * Thread.sleep(1000);
	 * 
	 * Assert.assertTrue(driver.findElement(By.linkText("Impersonate User")).
	 * isDisplayed());
	 * 
	 * }
	 */

	@Test(priority = 2)

	public void ImpersonationTest_pt_BR_CF() throws Exception {
		test = extent.createTest("ImpersonationTest_pt_BR_CF", "Selection of SBU,Locale and UserType pt_BR_C&F");

		Thread.sleep(1000);

		ApplicationLogin.ImpersonationData_CF();

	}

	@Test(priority = 3)

	public void UsertypeLinkTest_pt_BR_CF() throws Exception {
		test = extent.createTest("UsertypeLinkTest_pt_BR_CF",
				"TestALL page Selecting User type link to build the basecode pt_BR_C&F");
		Thread.sleep(3000);

		ApplicationLogin.UsertypeLink_CF();

	}

	@Test(priority = 4)

	public void SoldandShipToTest_pt_BR_CF() throws Exception {
		test = extent.createTest("SoldandShipToTest_pt_BR_CF",
				"TestALL page Selecting User type link to build the basecode pt_BR_C&F");
		Thread.sleep(3000);

		ApplicationLogin.SoldandShipT_CF();

	}

	@Test(priority = 5)

	public void BasecodeSelectionTest_pt_BR_CF() throws Exception {
		test = extent.createTest("BasecodeSelectionTest_pt_BR_CF",
				"Selection of base code on Model search page pt_BR_C&F ");
		ApplicationLogin.BasecodeSelection_CF();
	}

	@Test(priority = 6)

	public void BuildyourProductTest_pt_BR_CF() throws Exception {

		test = extent.createTest("BuildyourProductTest_pt_BR_CF",
				"Configure Required Option code on Build Page pt_BR_C&F ");

		ApplicationLogin.BuildyourProduct_CF();
	}

	@Test(priority = 7)

	public void CustomizeproductTest_pt_BR_CF() throws Exception {
		test = extent.createTest("CustomizeproductTest_pt_BR_CF",
				"Configure Optional Option code on Customize Page pt_BR_C&F");

		ApplicationLogin.Customizeproduct_CF();
	}

	@Test(priority = 8)

	public void ViewSummarypageTest_pt_BR_CF() throws Exception {
		test = extent.createTest("ViewSummarypageTest_pt_BR_CF",
				"Selection Of dealer Account nad Revie Availibility of configured product pt_BR_C&F");

		ApplicationLogin.ViewSummarypage_CF();
	}

	@Test(priority = 9)

	public void SavetheCartTest_pt_BR_CF() throws Exception {
		test = extent.createTest("SavetheCartTest_pt_BR_CF", "Saving the configured product pt_BR_C&F");

		ApplicationLogin.SavetheCart_CF();

	}

}