package com.deere.ics.testcase;

import java.util.ArrayList;
import java.util.Iterator;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.deere.ics.Business.applicationLogin_en_US;
import com.deere.ics.Driver.Driver1;
import com.deere.ics.Page.Pageclass1;
import com.deere.ics.Utility.TestUtil;
import com.deere.ics.Utility.ExtentReport;

public class logintoApplication_en_US extends ExtentReport {

	public applicationLogin_en_US ApplicationLogin;
	WebDriver driver;
	// public Pageclass1 xa ;

	public logintoApplication_en_US() throws Exception {

		this.driver = Driver1.getDriver();

		ApplicationLogin = new applicationLogin_en_US(driver);

		// xa =new Pageclass1(driver);

	}

	@Test(priority = 1)
	public void logintoICSTest() throws Exception {

		test = extent.createTest("logintoICSTest", "Login into the Application us ");

		System.out.println("Test class begins");

		Thread.sleep(1000);

		ApplicationLogin.loginToApplication();

	}

	@Test(priority = 2)

	public void ImpersonationTest() throws Exception {
		test = extent.createTest("ImpersonationTest", "Selection of SBU,Locale and UserType us");

		Thread.sleep(1000);

		ApplicationLogin.ImpersonationData();

	}

	@Test(priority = 3)

	public void UsertypeLinkTest() throws Exception {
		test = extent.createTest("UsertypeLinkTest", "TestALL page Selecting User type link to build the basecode us");
		Thread.sleep(3000);

		ApplicationLogin.UsertypeLink();

	}

	@Test(priority = 4)

	public void BasecodeSelectionTest() throws Exception {
		test = extent.createTest("BasecodeSelectionTest", "Selection of base code on Model search page us ");

		Thread.sleep(2000);
		ApplicationLogin.BasecodeSelection();
	}

	@Test(priority = 5)

	public void BuildyourProductTest() throws Exception {

		test = extent.createTest("BuildyourProductTest", "Configure Required Option code on Build Page us ");

		Thread.sleep(2000);

		ApplicationLogin.BuildyourProduct();
	}

	@Test(priority = 6)

	public void CustomizeproductTest() throws Exception {
		test = extent.createTest("CustomizeproductTest", "Configure Optional Option code on Customize Page us ");
		Thread.sleep(2000);

		ApplicationLogin.Customizeproduct();
	}

	@Test(priority = 7)

	public void ViewSummarypageTest() throws Exception {
		test = extent.createTest("ViewSummarypageTest",
				"Selection Of dealer Account nad Revie Availibility of configured product us");
		Thread.sleep(2000);
		ApplicationLogin.ViewSummarypage();
	}

	@Test(priority = 8)

	public void SavetheCartTest() throws Exception {
		test = extent.createTest("SavetheCartTest", "Saving the configured product us");
		Thread.sleep(2000);

		ApplicationLogin.SavetheCart();

		Thread.sleep(5000);

	}

}
