package com.deere.ics.testcase;

import java.util.ArrayList;
import java.util.Iterator;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.deere.ics.Business.applicationLogin_ru_RU;
import com.deere.ics.Driver.Driver1;
import com.deere.ics.Utility.TestUtil;
import com.deere.ics.Utility.ExtentReport;

public class logintoApplication_ru_RU extends ExtentReport {

	public applicationLogin_ru_RU ApplicationLogin;
	WebDriver driver;

	public logintoApplication_ru_RU() throws Exception {

		this.driver = Driver1.getDriver();

		ApplicationLogin = new applicationLogin_ru_RU(driver);
	}

	/*
	 * @Test(priority = 1) public void logintoICSTest() throws Exception {
	 * 
	 * test = extent.createTest("logintoICSTest", "Login into the Application ");
	 * 
	 * System.out.println("Test class begins");
	 * 
	 * Thread.sleep(1000);
	 * 
	 * ApplicationLogin.loginToApplication();
	 * 
	 * }
	 */

	@Test(priority = 2)

	public void ImpersonationTest() throws Exception {
		test = extent.createTest("ImpersonationTest", "Selection of SBU,Locale and UserType");

		Thread.sleep(1000);

		ApplicationLogin.ImpersonationData();

	}

	@Test(priority = 3)

	public void UsertypeLinkTest() throws Exception {
		test = extent.createTest("UsertypeLinkTest", "TestALL page Selecting User type link to build the basecode");
		Thread.sleep(3000);

		ApplicationLogin.UsertypeLink();

	}

	@Test(priority = 4)

	public void BasecodeSelectionTest() throws Exception {
		test = extent.createTest("BasecodeSelectionTest", "Selection of base code on Model search page ");
		ApplicationLogin.BasecodeSelection();
	}

	/*
	 * @Test(priority = 5)
	 * 
	 * public void BuildyourProductTest() throws Exception {
	 * 
	 * test = extent.createTest("BuildyourProductTest",
	 * "Configure Required Option code on Build Page ");
	 * 
	 * ApplicationLogin.BuildyourProduct(); }
	 * 
	 * @Test(priority = 6)
	 * 
	 * public void CustomizeproductTest() throws Exception { test =
	 * extent.createTest("CustomizeproductTest",
	 * "Configure Optional Option code on Customize Page ");
	 * 
	 * ApplicationLogin.Customizeproduct(); }
	 * 
	 * @Test(priority = 7)
	 * 
	 * public void ViewSummarypageTest() throws Exception { test =
	 * extent.createTest("ViewSummarypageTest",
	 * "Selection Of dealer Account nad Revie Availibility of configured product");
	 * 
	 * ApplicationLogin.ViewSummarypage(); }
	 * 
	 * @Test(priority = 8)
	 * 
	 * public void SavetheCartTest() throws Exception { test =
	 * extent.createTest("SavetheCartTest", "Saving the configured product");
	 * 
	 * 
	 * ApplicationLogin.SavetheCart(); }
	 */
}
