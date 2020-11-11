package com.deere.ics.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.deere.ics.Utility.PageUtility;

public class TestAll_IMP {

	public TestAll_IMP()  {

	
	}
//// Global Impersonation Page Data
	public static final String SelectLocale = "//select[@name=\"userLocale\"]";

	public static final String SelectSBU = "//select[@name=\"userSbu\"]";
	public static final String SelectUsertype = "//select[@name=\"userType\"]";

	public static final String PROPERTIES_FILE_PATH = "D:\\Project\\ICS-Config\\src\\test\\resource\\RacfIDs.properties";

	public static final String TestallRacfID = "//input[@name=\"racfId\"]";

	public static final String ImpersonationXpath1 = "/html/body/form[1]/table/tbody/tr[5]/td/a";
	
	// Impersonational Link

	public static final String US_CF_DEL_html = "/html/body/form[1]/table/tbody/tr[12]/td/table/tbody/tr[437]/td[3]/a[1]";
	public static final String US_CF_EMP_html = "/html/body/form[1]/table/tbody/tr[12]/td/table/tbody/tr[439]/td[3]/a[1]";
	public static final String EN_CA_CF_DEL_html = "/html/body/form[1]/table/tbody/tr[12]/td/table/tbody/tr[449]/td[3]/a";
	public static final String EN_CA_CF_EMP_html = "/html/body/form[1]/table/tbody/tr[12]/td/table/tbody/tr[451]/td[3]/a";
	public static final String FR_CA_CF_DEL_html = "/html/body/form[1]/table/tbody/tr[12]/td/table/tbody/tr[458]/td[3]/a";
	public static final String FR_CA_CF_EMP_html = "/html/body/form[1]/table/tbody/tr[12]/td/table/tbody/tr[460]/td[3]/a";
	public static final String pt_BR_CF_SA_html = "/html/body/form[1]/table/tbody/tr[12]/td/table/tbody/tr[472]/td[3]/a";
	public static final String pt_BR_AG_SA_html = "/html/body/form[1]/table/tbody/tr[12]/td/table/tbody/tr[43]/td[3]/a[1]";
	public static final String RU_RU_AG_EMP_html = "/html/body/form[1]/table/tbody/tr[12]/td/table/tbody/tr[139]/td[3]/a";
}
