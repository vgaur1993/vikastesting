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
import org.testng.Assert;

import com.deere.ics.Page.Pageclass1;
import com.deere.ics.Page.SelectProductpage;
import com.deere.ics.Page.TestAll_IMP;
import com.deere.ics.Page.ViewsummaryPage;

import static org.testng.Assert.assertTrue;

import java.awt.List;
import java.util.*;
import java.util.Properties;
import static org.testng.Assert.assertEquals;
import org.testng.Assert;

public class applicationLogin_pt_BR {

	private WebDriver driver;
	Pageclass1 Pageclass;
	ImpersonationData excel = new ImpersonationData("\\ApplicationTestData.xls");
	Properties properties = PropertfileReader.getproperties("\\src\\test\\resource\\RacfIDs.properties");

	String Homepage;

	public applicationLogin_pt_BR(WebDriver driver) throws Exception {

		this.driver = driver;

		Pageclass = new Pageclass1(driver);

	}

	public boolean loginToApplication_CF() throws Exception {

		driver.findElement(By.id(PageUtility.OKTA_USER_SignID)).sendKeys(excel.getData(2, 2, 7));
		Thread.sleep(2000);

		driver.findElement(By.id(PageUtility.OKTA_NEXT_ID)).click();

		Thread.sleep(4000);

		driver.findElement(By.id(PageUtility.OKTA_PASSWORD_ID)).sendKeys(excel.getData(2, 2, 8));
		Thread.sleep(2000);
		driver.findElement(By.id(PageUtility.OKTA_Submit)).click();

		Thread.sleep(10000);

		return false;
	}

	public void ImpersonationData_CF() throws Exception {
		Thread.sleep(5000);

		driver.get("https://configuratorcerttc.deere.com/testAll.html");

		Thread.sleep(5000);

		driver.findElement(By.linkText("Impersonate User")).click();

		Thread.sleep(2000);

		Assert.assertEquals(driver.getTitle(), "Impersonate user page");

		System.out.println("lets select locale");
		Select countryLocale = new Select(driver.findElement(By.xpath(TestAll_IMP.SelectLocale)));
		countryLocale.selectByValue(excel.getData(0, 6, 0));

		System.out.println("lets select SBU");

		Thread.sleep(1000);

		Select SBU = new Select(driver.findElement(By.xpath(TestAll_IMP.SelectSBU)));
		SBU.selectByVisibleText(excel.getData(0, 6, 1));

		System.out.println("lets select usertype");

		Thread.sleep(1000);

		Select userType = new Select(driver.findElement(By.xpath(TestAll_IMP.SelectUsertype)));
		userType.selectByVisibleText(excel.getData(0, 6, 2));

		Thread.sleep(1000);
		driver.findElement(By.xpath(TestAll_IMP.TestallRacfID)).clear();

		driver.findElement(By.xpath(TestAll_IMP.TestallRacfID)).sendKeys(properties.getProperty("pt_BR_SalesAnalyst"));
		Thread.sleep(1000);

		driver.findElement(By.id("beginImpersonation")).click();
	}

	public void UsertypeLink_CF() throws Exception {

		driver.findElement(By.xpath(TestAll_IMP.pt_BR_CF_SA_html)).click();

		Thread.sleep(3000);

	}

	public void SoldandShipT_CF() throws Exception {

		Thread.sleep(3000);

		Homepage = driver.getWindowHandle();
		System.out.println(Homepage);

		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);

		Thread.sleep(1000);

		Iterator iterator = windows.iterator();
		String CureentWindowID;

		while (iterator.hasNext()) {
			CureentWindowID = iterator.next().toString();
			System.out.println(CureentWindowID);

			if (!CureentWindowID.equals(Homepage)) {

				Thread.sleep(1000);
				driver.switchTo().window(CureentWindowID);

				Select EmissoradaOrdem = new Select(driver.findElement(By.xpath(SelectProductpage.SoldTO)));

				EmissoradaOrdem.selectByValue(properties.getProperty("pt_BR_SoldTO"));
				Thread.sleep(1000);

				driver.findElement(By.xpath(SelectProductpage.SoldtoOKButton)).click();

				Thread.sleep(1000);

			}

		}

	}

	public void BasecodeSelection_CF() throws Exception {

		Thread.sleep(10000);

		Set<String> x = driver.getWindowHandles();
		System.out.println(x);

		driver.switchTo().window(Homepage);
		Thread.sleep(1000);

		Assert.assertEquals(driver.getTitle(), "Configurador de Produtos John Deere");

		driver.findElement(By.xpath(SelectProductpage.searchModelbox)).sendKeys(excel.getData(1, 1, 4));
		Thread.sleep(3000);
		driver.findElement(By.xpath(SelectProductpage.searchModelbox)).sendKeys(Keys.ENTER);

		Thread.sleep(5000);

		driver.findElement(By.xpath(SelectProductpage.SearchNowButton_BR)).click();
		Thread.sleep(3000);

	}

	public void BuildyourProduct_CF() throws Exception {

		try {
			driver.switchTo().alert().accept();
			Thread.sleep(2000);

		} catch (Exception e) {

			driver.findElement(By.linkText("Ver Todas Opções")).click();

			Thread.sleep(2000);

			Assert.assertTrue(driver.findElement(By.linkText("Opções Básicas")).isDisplayed());
			Thread.sleep(2000);

			driver.findElement(By.id("1040")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("4510")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("7070")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("7925")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("5025")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("1741")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("2625")).click();
			Thread.sleep(2000);

			System.out.println("lets click 0500");
			// driver.findElement(By.id("0500")).click();

			driver.findElement(By.xpath(
					"/html/body/div[1]/div[5]/form[1]/div/div[2]/div[2]/table/tbody/tr/td/div[4]/table/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/table/tbody/tr/td[1]/font/a/img"));
			Thread.sleep(2000);
			System.out.println("click done");
		}

	}

	public void Customizeproduct_CF() throws Exception {

		Thread.sleep(500);

		driver.findElement(By.linkText("Customizar Produto")).click();

		Thread.sleep(200);
	}

	public void ViewSummarypage_CF() throws Exception {

		try {
			driver.switchTo().alert().accept();
			Thread.sleep(2000);

		} catch (Exception e) {
			Thread.sleep(1000);

			driver.findElement(By.linkText("Visualizar Resumo")).click();

			Thread.sleep(1000);

			boolean x = driver.findElement(By.linkText("Resumo")).isDisplayed();

			System.out.println(x);

			Thread.sleep(1000);
			Select Ordertype = new Select(driver.findElement(By.xpath(ViewsummaryPage.SelectorderType)));

			Ordertype.selectByVisibleText("ESTOQUE");
			Thread.sleep(1000);

			driver.findElement(By.linkText("Consulta de Disponibilidade")).click();
			Thread.sleep(2000);

			Assert.assertEquals(driver.getTitle(), "Configurador - Salvar Configuração");

			Thread.sleep(2000);
		}

	}

	public void SavetheCart_CF() throws Exception {

		driver.findElement(By.xpath(ViewsummaryPage.CartnameInput)).sendKeys("pt_BR_C&F_Employee");
		Thread.sleep(3000);

		driver.findElement(By.xpath(ViewsummaryPage.savecartBR)).click();
		Thread.sleep(4000);

		Assert.assertTrue(driver.findElement(By.linkText("Criar Ordem")).isDisplayed());
		Thread.sleep(2000);

		driver.findElement(By.linkText("Criar Ordem")).click();

	}

	public boolean loginToApplication_AG() throws Exception {

		driver.findElement(By.id(PageUtility.OKTA_USER_SignID)).sendKeys(excel.getData(2, 2, 7));
		Thread.sleep(2000);

		driver.findElement(By.id(PageUtility.OKTA_NEXT_ID)).click();

		Thread.sleep(4000);

		driver.findElement(By.id(PageUtility.OKTA_PASSWORD_ID)).sendKeys(excel.getData(2, 2, 8));
		Thread.sleep(2000);
		driver.findElement(By.id(PageUtility.OKTA_Submit)).click();

		Thread.sleep(10000);

		return false;
	}

	public void ImpersonationData_AG() throws Exception {

		Thread.sleep(5000);

		driver.get("https://configuratorcerttc.deere.com/testAll.html");

		Thread.sleep(5000);

		System.out.println("Now lets click");
		driver.findElement(By.linkText("Impersonate User")).click();

		Thread.sleep(2000);

		Assert.assertEquals(driver.getTitle(), "Impersonate user page");

		System.out.println("lets select locale");
		Select countryLocale = new Select(driver.findElement(By.xpath(TestAll_IMP.SelectLocale)));
		countryLocale.selectByValue(excel.getData(0, 7, 0));

		System.out.println("lets select SBU");

		Thread.sleep(1000);

		Select SBU = new Select(driver.findElement(By.xpath(TestAll_IMP.SelectSBU)));
		SBU.selectByVisibleText(excel.getData(0, 7, 1));

		System.out.println("lets select usertype");

		Thread.sleep(1000);

		Select userType = new Select(driver.findElement(By.xpath(TestAll_IMP.SelectUsertype)));
		userType.selectByVisibleText(excel.getData(0, 7, 2));

		Thread.sleep(1000);
		driver.findElement(By.xpath(TestAll_IMP.TestallRacfID)).clear();

		driver.findElement(By.xpath(TestAll_IMP.TestallRacfID)).sendKeys(properties.getProperty("pt_BR_SalesAnalyst"));
		Thread.sleep(1000);

		driver.findElement(By.id("beginImpersonation")).click();
	}

	public void UsertypeLink_AG() throws Exception {

		driver.findElement(By.xpath(TestAll_IMP.pt_BR_AG_SA_html)).click();

		Thread.sleep(5000);

	}

	public void SoldandShipTo_AG() throws Exception {

		Thread.sleep(3000);

		Homepage = driver.getWindowHandle();
		System.out.println(Homepage);

		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);

		Thread.sleep(1000);

		Iterator iterator = windows.iterator();
		String CureentWindowID;

		while (iterator.hasNext()) {
			CureentWindowID = iterator.next().toString();
			System.out.println(CureentWindowID);

			if (!CureentWindowID.equals(Homepage)) {

				Thread.sleep(1000);
				driver.switchTo().window(CureentWindowID);

				driver.findElement(By.xpath(SelectProductpage.SoldTOFirstwindow_AG))
						.sendKeys(properties.getProperty("pt_BR_SoldTo_AG"));
				Thread.sleep(1000);
				driver.findElement(By.xpath(SelectProductpage.SoldTOFirstwindow_AG_Submit)).click();
				Thread.sleep(1000);

				driver.findElement(By.xpath(SelectProductpage.SoldtoOKButton)).click();

				/*
				 * Select EmissoradaOrdem = new
				 * Select(driver.findElement(By.xpath(PageUtility.SoldTO)));
				 * 
				 * EmissoradaOrdem.selectByValue(properties.getProperty("pt_BR_SoldTo_AG"));
				 * Thread.sleep(1000);
				 * 
				 * driver.findElement(By.xpath(PageUtility.SoldtoOKButton)).click();
				 */
				Thread.sleep(1000);
			}

		}

	}

	public void BasecodeSelection_AG() throws Exception {

		Thread.sleep(6000);

		Set<String> x = driver.getWindowHandles();
		System.out.println(x);

		driver.switchTo().window(Homepage);

		Thread.sleep(1000);

		Assert.assertEquals(driver.getTitle(), "Configurador de Produtos John Deere");

		driver.findElement(By.xpath(SelectProductpage.searchModelbox)).sendKeys(excel.getData(1, 2, 4));
		Thread.sleep(3000);
		driver.findElement(By.xpath(SelectProductpage.searchModelbox)).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		driver.findElement(By.xpath(SelectProductpage.SearchNowButton_BR)).click();
		Thread.sleep(3000);

	}

	public void BuildyourProduct_AG() throws Exception {

		try {
			driver.switchTo().alert().accept();
			Thread.sleep(2000);

		} catch (Exception e) {

			driver.findElement(By.linkText("Ver Todas Opções")).click();

			Thread.sleep(2000);

			Thread.sleep(2000);

			Assert.assertTrue(driver.findElement(By.linkText("Opções Básicas")).isDisplayed());

			driver.findElement(By.id("0500")).click();
			Thread.sleep(2000);

			driver.findElement(By.id("3303")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("8962")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("6113")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("5109")).click();
			Thread.sleep(2000);
		}

	}

	public void Customizeproduct_AG() throws Exception {

		Thread.sleep(500);

		driver.findElement(By.linkText("Customizar Produto")).click();

		Thread.sleep(200);
	}

	public void ViewSummarypage_AG() throws Exception {

		Thread.sleep(1000);

		// driver.findElement(By.xpath(PageUtility.ViewSummaryButton)).click();

		driver.findElement(By.linkText("Visualizar Resumo")).click();

		Thread.sleep(1000);

		Select Ordertype = new Select(driver.findElement(By.xpath(ViewsummaryPage.SelectorderType)));

		Ordertype.selectByVisibleText("ESTOQUE");
		Thread.sleep(1000);

		driver.findElement(By.linkText("Consulta de Disponibilidade")).click();

		Thread.sleep(2000);

		Assert.assertEquals(driver.getTitle(), "Configurador - Salvar Configuração");

		Thread.sleep(2000);
	}

	public void SavetheCart_AG() throws Exception {

		driver.findElement(By.xpath(ViewsummaryPage.CartnameInput)).sendKeys("pt_BR_AG_Employee");
		Thread.sleep(3000);

		driver.findElement(By.xpath(ViewsummaryPage.savecartBR)).click();
		Thread.sleep(2000);

		Assert.assertTrue(driver.findElement(By.linkText("Criar Ordem")).isDisplayed());
		Thread.sleep(2000);

		driver.findElement(By.linkText("Criar Ordem")).click();

	}

}
