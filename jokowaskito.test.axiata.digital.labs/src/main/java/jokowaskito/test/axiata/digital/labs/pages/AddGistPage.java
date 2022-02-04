package jokowaskito.test.axiata.digital.labs.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import jokowaskito.test.axiata.digital.labs.driver.DriverSingleton;

public class AddGistPage {
private WebDriver driver;
	
	public AddGistPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#gists > input")
	private WebElement txtDescription;
	
	@FindBy(css = "#gists > div.js-gist-file > file-attachment > div > div.file-header.d-flex.flex-items-center.pr-0 > div.input-group.gist-filename-input > input.form-control.js-gist-filename.js-blob-filename")
	private WebElement txtFileName;
	
	@FindBy(css = "#code-editor > div > pre")
	private WebElement txtPresentation;
	
	@FindBy(css = "#gists > div.js-gist-file > file-attachment > div > div.file-header.d-flex.flex-items-center.pr-0 > div.file-actions.d-none.d-md-flex.px-3.pr-md-6.px-lg-2.ml-auto > select.form-select.select-sm.js-code-indent-mode")
	private WebElement indentMode;
	
	@FindBy(css = "#gists > div.js-gist-file > file-attachment > div > div.file-header.d-flex.flex-items-center.pr-0 > div.file-actions.d-none.d-md-flex.px-3.pr-md-6.px-lg-2.ml-auto > select.form-select.select-sm.js-code-indent-width")
	private WebElement indentSize;
	
	@FindBy(css = "#gists > div.js-gist-file > file-attachment > div > div.file-header.d-flex.flex-items-center.pr-0 > div.file-actions.d-none.d-md-flex.px-3.pr-md-6.px-lg-2.ml-auto > select.form-select.select-sm.js-code-wrap-mode")
	private WebElement lineWrapMode;
	
	@FindBy(css = "#new_gist > div > div.d-flex.flex-items-center.flex-justify-between > div > button")
	private WebElement buttonSubmit;
	
	public void formAddGist(String description, String filename, String presentation) {
		txtDescription.sendKeys(description);
		txtFileName.sendKeys(filename);
		txtPresentation.sendKeys(presentation);
		indentMode(0);
		indentSize(0);
		lineWrapMode(0);
		buttonSubmit.submit();
	}
	
	@FindBy(css = "#gist-pjax-container > div.container-lg.px-3.new-discussion-timeline > div > div > div:nth-child(1)")
	private WebElement textCreateGist;
	
	public String getDisplayCreate() {
		return textCreateGist.getText();
	}
	
	public void indentMode (int selection) {			
		indentMode.click();	
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void indentSize (int selection) {			
		indentSize.click();	
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void lineWrapMode (int selection) {			
		lineWrapMode.click();	
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
}
