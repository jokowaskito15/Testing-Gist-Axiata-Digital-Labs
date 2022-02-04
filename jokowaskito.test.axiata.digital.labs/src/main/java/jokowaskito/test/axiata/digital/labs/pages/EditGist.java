package jokowaskito.test.axiata.digital.labs.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jokowaskito.test.axiata.digital.labs.driver.DriverSingleton;

public class EditGist {

	private WebDriver driver;
	
	public EditGist() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#gist-pjax-container > div > div > div.col-9.col-md-9.col-12 > div.gist-snippet > div.gist-snippet-meta.d-flex.flex-lg-row.flex-column.width-full > div > div.d-inline-block.px-lg-2.px-0 > span:nth-child(1) > a:nth-child(2) > strong")
	private WebElement selectGist;
	
	@FindBy(css = "#gist-pjax-container > div.gisthead.pagehead.pb-0.pt-3.mb-4 > div > div.mb-3.d-flex.px-3.px-md-3.px-lg-5 > ul > li:nth-child(1) > a")
	private WebElement buttonEditGist;
	
	@FindBy(css = "#gists > input")
	private WebElement txtDescription;
	
	@FindBy(css = "#gists > div.js-gist-file > file-attachment > div > div.file-header.d-flex.flex-items-center.pr-0 > div.input-group.gist-filename-input > input.form-control.js-gist-filename.js-blob-filename")
	private WebElement txtFileName;
	
	@FindBy(css = "#code-editor > div > pre")
	private WebElement txtPresentation;
	
	@FindBy(xpath = "//div[@class='form-actions']/button")
	private WebElement buttonUpdate;
	
	public void editGist(String descriptionedit, String filenameedit, String presentationedit) {
		selectGist.click();
		buttonEditGist.click();
		txtDescription.clear();
		txtDescription.sendKeys(descriptionedit);
		txtFileName.clear();
		txtFileName.sendKeys(filenameedit);
		Presentation();
		txtPresentation.sendKeys(presentationedit);
		buttonUpdate.submit();
	}
	
	@FindBy(css = "#gist-pjax-container > div.container-lg.px-3.new-discussion-timeline > div > div > div:nth-child(1)")
	private WebElement textGithubEdit;
	
	public String getDisplayEdit() {
		return textGithubEdit.getText();
	}
	
	public void Presentation() {
		txtPresentation.clear();
		txtPresentation.sendKeys(Keys.chord(Keys.CONTROL +"a"));
		txtPresentation.sendKeys(Keys.DELETE);
	}
	
	
	
}
