package jokowaskito.test.axiata.digital.labs.glue;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jokowaskito.test.axiata.digital.labs.config.AutomationFrameworkConfiguration;
import jokowaskito.test.axiata.digital.labs.driver.DriverSingleton;
import jokowaskito.test.axiata.digital.labs.pages.AddGistPage;
import jokowaskito.test.axiata.digital.labs.pages.DeleteGist;
import jokowaskito.test.axiata.digital.labs.pages.EditGist;
import jokowaskito.test.axiata.digital.labs.pages.HomePage;
import jokowaskito.test.axiata.digital.labs.pages.LoginPage;
import jokowaskito.test.axiata.digital.labs.utils.ConfigurationProperties;
import jokowaskito.test.axiata.digital.labs.utils.Constants;

@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)

public class StepDefinition extends AbstractTestNGSpringContextTests {
	private WebDriver driver;
	private LoginPage loginPage;
	private HomePage homepage;
	private AddGistPage addGistPage;
	private DeleteGist deleteGist;
	private EditGist editGist;
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Test(priority = 0)
	public void InitializeObject() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);	
		loginPage = new LoginPage();
		homepage = new HomePage();
		addGistPage = new AddGistPage();
		deleteGist = new DeleteGist();
		editGist = new EditGist();
	}
	
	@Test(priority = 1)
	public void Home_Page() {
		homepage.goToSignIn();
		assertEquals(configurationProperties.getDisplaylogin(), homepage.getDisplay());
	}
	
	@Test(priority = 2)
	public void SignIn_Page() {
		loginPage.formLogin(configurationProperties.getUsernamelogin(), configurationProperties.getPasswordlogin());
		assertEquals(configurationProperties.getDisplayhome(), loginPage.getDisplayHome());
	}
	
	@Test(priority = 3)
	public void Add_Gists() {
		homepage.goToAdd();
		addGistPage.formAddGist(configurationProperties.getDescription(),
				configurationProperties.getFilename(), configurationProperties.getPresentation());
		assertEquals(configurationProperties.getDisplaycreate(), addGistPage.getDisplayCreate());
	}
	
	@Test(priority = 4)
	public void Delete_Gists() {
		deleteGist.deleteGist();
		assertEquals(configurationProperties.getDisplaydelete(), deleteGist.getDisplayDelete());
	}
	
	@Test(priority = 5)
	public void Edit_Gists() {
		editGist.editGist(configurationProperties.getDescriptionedit(),
				configurationProperties.getFilenameedit(), configurationProperties.getPresentationedit());
		assertEquals(configurationProperties.getDisplayedit(), editGist.getDisplayEdit());
	}

	@Test(priority = 6)
	public void Logout() {
		homepage.goToLogout();
		assertEquals(configurationProperties.getDisplaylogout(), homepage.getDisplayLogout());
	}
	
	
}
