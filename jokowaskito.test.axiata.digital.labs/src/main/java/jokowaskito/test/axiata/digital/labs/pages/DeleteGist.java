package jokowaskito.test.axiata.digital.labs.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import jokowaskito.test.axiata.digital.labs.driver.DriverSingleton;

public class DeleteGist {

	private WebDriver driver;
	
	public DeleteGist() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#gist-pjax-container > div.gisthead.pagehead.pb-0.pt-3.mb-4 > div > div.mb-3.d-flex.px-3.px-md-3.px-lg-5 > div > div > div.d-flex.flex-column.width-full > div.d-flex.flex-row.width-full > h1 > span.author > a")
	private WebElement listGist;
	
	@FindBy(css = "#gist-pjax-container > div > div > div.col-9.col-md-9.col-12 > div:nth-child(2) > div.gist-snippet-meta.d-flex.flex-lg-row.flex-column.width-full > div > div.d-inline-block.px-lg-2.px-0 > span:nth-child(1) > a:nth-child(2) > strong")
	private WebElement selectGist;
	
	@FindBy(css = "#gist-pjax-container > div.gisthead.pagehead.pb-0.pt-3.mb-4 > div > div.mb-3.d-flex.px-3.px-md-3.px-lg-5 > ul > li:nth-child(2) > form > button")
	private WebElement buttonDeleteGist;
	
	public void deleteGist() {
		listGist.click();
		selectGist.click();
		buttonDeleteGist.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	@FindBy(css = "#js-flash-container > div > div")
	private WebElement textGithubDelete;
	
	public String getDisplayDelete() {
		return textGithubDelete.getText();
	}
	
	
	
}
