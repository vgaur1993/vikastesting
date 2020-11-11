package com.deere.ics.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.deere.ics.Utility.PageUtility;

public class SelectProductpage {



	// Model selection Page

	public static final String searchModelbox = "//input[@id=\"searchModel\"]";

	public static final String SearchNowButton = "//input[@value=\"Search Now\"]";
	
	public static final String SearchNowButton_RU = "//input[@value=\"Искать\r\n" + 
			"\"]";
	
	
	
	public static final String SearchNowButton_BR = "/html/body/div[1]/form/div[6]/div[3]/div[3]/input";
	
	
	
	//pt_br Specific
	public static final String SoldTO = "/html/body/form/div/div/div[2]/div[1]/table/tbody/tr[1]/td[2]/select";

	public static final String SoldtoOKButton = "//input[@id=\"OK\"]";

	


	public static final String SoldTOFirstwindow_AG = "/html/body/form/div[2]/div/span/input";

	public static final String SoldTOFirstwindow_AG_Submit = "/html/body/form/div[2]/div/input";
}

