package com.deere.ics.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.deere.ics.Utility.PageUtility;

public class Pageclass1 {

	public Pageclass1(WebDriver driver) throws Exception {

		PageFactory.initElements(driver, this);

	}

	/*@FindBy(how = How.XPATH, using = PageUtility.Clearconfiguration)
	@CacheLookup
	public WebElement Clearconfiguration;

	public void Clearconfiguration() throws Exception {

		Clearconfiguration.click();
*/
		/*
		 * @FindBy(how = How.ID, using = PageUtility.OKTA_SIGNIN_USERNAME_ID)
		 * 
		 * @CacheLookup public WebElement userNameTextField;
		 * 
		 * 
		 * @FindBy(how = How.ID, using =PageUtility.clickonNext)
		 * 
		 * @CacheLookup public WebElement clickonNext;
		 * 
		 * @FindBy(how = How.ID, using =PageUtility.OKTA_SIGNIN_Password)
		 * 
		 * @CacheLookup public WebElement PasswordTextField;
		 * 
		 * @FindBy(how = How.ID, using =PageUtility.OKTA_Submit)
		 * 
		 * @CacheLookup public WebElement clickonverify;
		 * 
		 * @FindBy(how = How.ID, using =PageUtility.impersonateUser)
		 * 
		 * @CacheLookup public WebElement ImpersonateUser;
		 * 
		 * @FindBy(how = How.ID, using =PageUtility.testallRacfID)
		 * 
		 * @CacheLookup public WebElement RacfID;
		 * 
		 * @FindBy(how = How.ID, using =PageUtility.beginImpersonation)
		 * 
		 * @CacheLookup public WebElement beginImpersonation;
		 * 
		 */

	
}
