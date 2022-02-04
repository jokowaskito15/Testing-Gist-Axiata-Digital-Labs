package jokowaskito.test.axiata.digital.labs.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jokowaskito.test.axiata.digital.labs.driver.DriverSingleton;

public class HomePage {
	private WebDriver driver;
	
	public HomePage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "body > div.position-relative.js-header-wrapper > div > div.Header-item.f4.mr-0 > a.HeaderMenu-link.no-underline.mr-3")
	private WebElement buttonSignIn;
	
	public void goToSignIn() {
		buttonSignIn.click();
	}
	
	@FindBy(css = "#login > div.auth-form-body.mt-3 > div > p > strong:nth-child(1)")
	private WebElement textGithub;
	
	public String getDisplay() {
		return textGithub.getText();
	}
	
	@FindBy(css = "body > div.position-relative.js-header-wrapper > div > div:nth-child(6) > a > svg.octicon.octicon-plus.d-none.d-md-inline-block")
	private WebElement addGists;
	
	public void goToAdd() {
		addGists.click();
	}
	
	@FindBy(css = "#user-links > details > summary > img")
	private WebElement menuAvatar;
	
	@FindBy(css = "#js-pjax-container > div > form > input.btn.btn-block.f4.py-3.mt-5")
	private WebElement btnSignOut;
	
	public void goToLogout() {
		Avatar(6);
		btnSignOut.submit();
	}
	
	@FindBy(css = "body > div.position-relative.js-header-wrapper > header > div > div.HeaderMenu.HeaderMenu--logged-out.position-fixed.top-0.right-0.bottom-0.height-fit.position-lg-relative.d-lg-flex.flex-justify-between.flex-items-center.flex-auto > nav > ul > li:nth-child(1) > details > summary")
	private WebElement txtDisplayLogout;
	
	public String getDisplayLogout() {
		return txtDisplayLogout.getText();
	}
	
	public void Avatar (int selection) {			
		menuAvatar.click();	
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}

}
