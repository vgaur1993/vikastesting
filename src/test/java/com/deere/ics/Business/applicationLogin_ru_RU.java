package com.deere.ics.Business;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import com.deere.ics.Utility.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.deere.ics.Page.Pageclass1;
import com.deere.ics.Page.SelectProductpage;
import com.deere.ics.Page.TestAll_IMP;
import com.deere.ics.Page.ViewsummaryPage;

import static org.testng.Assert.assertTrue;

import java.util.Properties;

public class applicationLogin_ru_RU {

	private WebDriver driver;
	Pageclass1 Pageclass;
	ImpersonationData excel = new ImpersonationData("\\ApplicationTestData.xls");
	Properties properties = PropertfileReader.getproperties("\\src\\test\\resource\\RacfIDs.properties");

	public applicationLogin_ru_RU(WebDriver driver) throws Exception {
		this.driver = driver;
		Pageclass = new Pageclass1(driver);
		Pageclass = new Pageclass1(driver);

	}

	public boolean loginToApplication() throws Exception {

		Thread.sleep(1000);

		driver.findElement(By.id(PageUtility.OKTA_USER_SignID)).sendKeys(excel.getData(2, 2, 5));

		driver.findElement(By.id(PageUtility.OKTA_NEXT_ID)).click();

		Thread.sleep(2000);

		driver.findElement(By.id(PageUtility.OKTA_PASSWORD_ID)).sendKeys(excel.getData(2, 2, 6));
		driver.findElement(By.id(PageUtility.OKTA_Submit)).click();

		Thread.sleep(10000);

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
		countryLocale.selectByValue(excel.getData(0, 5, 0));

		System.out.println("lets select SBU");

		Thread.sleep(1000);

		Select SBU = new Select(driver.findElement(By.xpath(TestAll_IMP.SelectSBU)));
		SBU.selectByVisibleText(excel.getData(0, 5, 1));

		System.out.println("lets select usertype");

		Thread.sleep(1000);

		Select userType = new Select(driver.findElement(By.xpath(TestAll_IMP.SelectUsertype)));
		userType.selectByVisibleText(excel.getData(0, 5, 2));

		Thread.sleep(1000);
		driver.findElement(By.xpath(TestAll_IMP.TestallRacfID)).clear();

		driver.findElement(By.xpath(TestAll_IMP.TestallRacfID)).sendKeys(properties.getProperty("EmployeeID"));
		Thread.sleep(1000);
		driver.findElement(By.id("beginImpersonation")).click();
	}

	public void UsertypeLink() throws Exception {

		driver.findElement(By.xpath(TestAll_IMP.RU_RU_AG_EMP_html)).click();

		Thread.sleep(5000);

	}

	public void BasecodeSelection() throws Exception {

		Thread.sleep(5000);
		/*
		 * boolean x =
		 * driver.findElement(By.xpath(PageUtility.searchModelbox)).isDisplayed();
		 * System.out.println(x + "Add the BAsecode");
		 * 
		 * System.out.println(excel.getData(1, 1, 1));
		 * 
		 */
		driver.findElement(By.xpath(SelectProductpage.searchModelbox)).sendKeys(excel.getData(1, 1, 3));
		Thread.sleep(3000);
		driver.findElement(By.xpath(SelectProductpage.searchModelbox)).sendKeys(Keys.ENTER);

		Thread.sleep(5000);

		driver.findElement(By.xpath(SelectProductpage.SearchNowButton_RU)).click();
		Thread.sleep(3000);

	}

	public void BuildyourProduct() throws Exception {

		driver.findElement(By.linkText("View All Options")).click();
		/*
		 * Thread.sleep(1000);
		 * 
		 * driver.findElement(By.xpath(PageUtility.Frame2)).click();
		 */
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

		driver.findElement(By.linkText("Выбор комплектации")).click();

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

		driver.findElement(By.xpath(ViewsummaryPage.CartnameInput)).sendKeys("en_US_C&F_Employee");
		Thread.sleep(1000);
		driver.findElement(By.xpath(ViewsummaryPage.CartNameSaveButton)).click();

	}

}
