package com.deere.ics.Business;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.deere.ics.Utility.*;
import org.openqa.selenium.support.ui.Select;

import com.deere.ics.Page.Pageclass1;
import com.deere.ics.Page.SelectProductpage;
import com.deere.ics.Page.TestAll_IMP;
import com.deere.ics.Page.ViewsummaryPage;

import static org.testng.Assert.assertTrue;

import java.util.Properties;

public class applicationLogin_en_CA {

	private WebDriver driver;
	Pageclass1 Pageclass;
	ImpersonationData excel = new ImpersonationData("\\ApplicationTestData.xls");
	Properties properties = PropertfileReader.getproperties("\\src\\test\\resource\\RacfIDs.properties");

	public applicationLogin_en_CA(WebDriver driver) throws Exception {
		this.driver = driver;
		Pageclass = new Pageclass1(driver);

	}

	public boolean loginToApplication() throws Exception {

		Thread.sleep(1000);

		driver.findElement(By.id(PageUtility.OKTA_USER_SignID)).sendKeys(excel.getData(2, 2, 3));
		driver.findElement(By.id(PageUtility.OKTA_NEXT_ID)).click();
		Thread.sleep(5000);
		driver.findElement(By.id(PageUtility.OKTA_PASSWORD_ID)).sendKeys(excel.getData(2, 2, 4));
		driver.findElement(By.id(PageUtility.OKTA_Submit)).click();

		return false;
	}

	public void ImpersonationData() throws Exception {

		Thread.sleep(5000);

		driver.get("https://configuratorcerttc.deere.com/testAll.html");

		Thread.sleep(5000);

		System.out.println("Now lets click");
		driver.findElement(By.linkText("Impersonate User")).click();

		System.out.println("lets select locale");
		Select countryLocale = new Select(driver.findElement(By.xpath(TestAll_IMP.SelectLocale)));
		countryLocale.selectByValue(excel.getData(0, 3, 0));

		System.out.println("lets select SBU");

		Thread.sleep(1000);

		Select SBU = new Select(driver.findElement(By.xpath(TestAll_IMP.SelectSBU)));
		SBU.selectByVisibleText(excel.getData(0, 3, 1));

		System.out.println("lets select usertype");

		Thread.sleep(1000);

		Select userType = new Select(driver.findElement(By.xpath(TestAll_IMP.SelectUsertype)));
		userType.selectByVisibleText(excel.getData(0, 3, 2));

		Thread.sleep(1000);
		driver.findElement(By.xpath(TestAll_IMP.TestallRacfID)).clear();

		driver.findElement(By.xpath(TestAll_IMP.TestallRacfID)).sendKeys(properties.getProperty("EmployeeID"));
		Thread.sleep(1000);
		driver.findElement(By.id("beginImpersonation")).click();
	}

	public void UsertypeLink() throws Exception {

		driver.findElement(By.xpath(TestAll_IMP.EN_CA_CF_EMP_html)).click();

		Thread.sleep(5000);

	}

	public void BasecodeSelection() throws Exception {

		Thread.sleep(5000);

		boolean x = driver.findElement(By.xpath(SelectProductpage.searchModelbox)).isDisplayed();
		System.out.println(x + "Add the BAsecode");

		System.out.println(excel.getData(1, 1, 2));

		driver.findElement(By.xpath(SelectProductpage.searchModelbox)).sendKeys(excel.getData(1, 1, 2));
		Thread.sleep(1000);
		driver.findElement(By.xpath(SelectProductpage.searchModelbox)).sendKeys(Keys.ENTER);

		Thread.sleep(5000);

		driver.findElement(By.xpath(SelectProductpage.SearchNowButton)).click();
		Thread.sleep(3000);

	}

	public void BuildyourProduct() throws Exception {

		driver.findElement(By.linkText("View All Options")).click();
		Thread.sleep(1000);

		// driver.findElement(By.xpath(PageUtility.Frame2)).click();

		Thread.sleep(1000);

		driver.findElement(By.id("170C")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("2401")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("3035")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("4446")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("2015")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("8625")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("6010")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("6210")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("5225")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("5400")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("5500")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("7025")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("7600")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("8410")).click();

	}

	public void Customizeproduct() throws Exception {

		Thread.sleep(500);

		driver.findElement(By.linkText("Customize Product")).click();

		Thread.sleep(200);
	}

	public void ViewSummarypage() throws Exception {

		Thread.sleep(500);

		driver.findElement(By.xpath(ViewsummaryPage.ViewSummaryButton)).click();

		Thread.sleep(500);

		driver.findElement(By.xpath(ViewsummaryPage.DealerAccountInput))
				.sendKeys(properties.getProperty("en_US_DealerAccountNo"));
		Thread.sleep(500);

		driver.findElement(By.linkText("Review Availability")).click();
	}

	public void SavetheCart() throws Exception {

		driver.findElement(By.xpath(ViewsummaryPage.CartnameInput)).sendKeys("en_CA_C&F_Employee");
		Thread.sleep(1000);
		driver.findElement(By.xpath(ViewsummaryPage.CartNameSaveButton)).click();

	}

}
