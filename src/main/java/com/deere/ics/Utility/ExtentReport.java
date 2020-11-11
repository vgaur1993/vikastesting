package com.deere.ics.Utility;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.deere.ics.Driver.Driver1;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReport {
	
	private WebDriver driver;

	public static ExtentHtmlReporter htmlreporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	// WebDriver driver;

	@BeforeSuite
	public void mainTest() {

		htmlreporter = new ExtentHtmlReporter("testReport.html");
		// initialize ExtentReports and attach the HtmlReporter
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		htmlreporter.config().setChartVisibilityOnOpen(true);
		htmlreporter.config().setDocumentTitle("Extent Report Demo");
		htmlreporter.config().setReportName("Test Report");
		htmlreporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlreporter.config().setTheme(Theme.STANDARD);
		htmlreporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

	}

	@AfterMethod
	public void getResults(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {
			test.fail(MarkupHelper.createLabel(result.getName() + "Test Case Failed", ExtentColor.RED));
			test.fail(result.getThrowable());

		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.pass(MarkupHelper.createLabel(result.getName() + "Test Case Success", ExtentColor.GREEN));
		} else {
			test.skip(MarkupHelper.createLabel(result.getName() + "Test Case skipped", ExtentColor.YELLOW));
			test.skip(result.getThrowable());

			System.out.println("khel khalas");

		}
	}


	@AfterSuite

	public void teardown() {
		extent.flush();

		EmailUtility.sendPDFReportByJohndeere("GaurVikas@johndeere.com", "Matoshreem39", "GaurVikas@johndeere.com",
				"ICS Report", "Report");
		System.out.println("Report send successfully");
		
		

	}
	
	
}
