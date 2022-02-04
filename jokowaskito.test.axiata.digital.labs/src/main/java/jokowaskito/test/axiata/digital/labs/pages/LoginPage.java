package jokowaskito.test.axiata.digital.labs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jokowaskito.test.axiata.digital.labs.driver.DriverSingleton;

public class LoginPage {
		
		private WebDriver driver;
		
		public LoginPage() {
			driver = DriverSingleton.getDriver();
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id = "login_field")
		private WebElement txtusernameSignin;
		
		@FindBy(id = "password")
		private WebElement txtpasswordSignin;
		
		@FindBy(css = "#login > div.auth-form-body.mt-3 > form > div > input.btn.btn-primary.btn-block.js-sign-in-button")
		private WebElement buttonSignIn;
		
		public void formLogin(String usernamelogin, String passwordlogin) {
			txtusernameSignin.sendKeys(usernamelogin);
			txtpasswordSignin.sendKeys(passwordlogin);
			buttonSignIn.click();
		}
		
		@FindBy(css = "#gist-pjax-container > div.gisthead.pagehead.pb-0.pt-3.mb-4 > div > div > div > h1")
		private WebElement textGithubHome;
		
		public String getDisplayHome() {
			return textGithubHome.getText();
		}
		

	}
