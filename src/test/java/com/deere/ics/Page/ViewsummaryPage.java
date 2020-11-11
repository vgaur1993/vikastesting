package com.deere.ics.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.deere.ics.Utility.PageUtility;

public class ViewsummaryPage {

	// Build your product Page

	public static final String ViewSummaryButton = "/html/body/div[1]/div[4]/div[1]/table/tbody/tr/td[2]/div/div/table/tbody/tr/td[3]/table/tbody/tr/td/span/a/font";
	public static final String DealerAccountInput = "//div//input[@id=\"dealerWorkAccountNumber\"]";

	public static final String CartnameInput = "//span//input[@name=\"saveName_txt\"]";

	public static final String CartNameSaveButton = "/html/body/div/table[2]/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/table/tbody/tr/td[1]/button";

	public static final String Clearconfiguration = "/html/body/div[1]/div[5]/div[2]/div[2]/div[2]/div/div[5]/div/a";
	public static final String SelectorderType = "/html/body/div[1]/div[5]/div[2]/form[1]/div/div[2]/span[2]/select";

	public static final String savecartBR = "/html/body/div/table[2]/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/table/tbody/tr/td[1]/button";

}
