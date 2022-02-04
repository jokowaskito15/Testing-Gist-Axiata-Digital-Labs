package jokowaskito.test.axiata.digital.labs.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {
	
	@Value("${browser}")
	private String browser;
	
	@Value("${displaylogin}")
	private String displaylogin;
	
	@Value("${usernamelogin}")
	private String usernamelogin;
	
	@Value("${passwordlogin}")
	private String passwordlogin;
	
	@Value("${displayhome}")
	private String displayhome;
	
	@Value("${description}")
	private String description;
	
	@Value("${filename}")
	private String filename;
	
	@Value("${presentation}")
	private String presentation;
	
	@Value("${displaycreate}")
	private String displaycreate;
	
	@Value("${displaydelete}")
	private String displaydelete;
	
	@Value("${descriptionedit}")
	private String descriptionedit;
	
	@Value("${filenameedit}")
	private String filenameedit;
	
	@Value("${presentationedit}")
	private String presentationedit;
	
	@Value("${displayedit}")
	private String displayedit;
	
	@Value("${displaylogout}")
	private String displaylogout;

	public String getDisplaylogout() {
		return displaylogout;
	}

	public String getDescriptionedit() {
		return descriptionedit;
	}

	public String getFilenameedit() {
		return filenameedit;
	}

	public String getPresentationedit() {
		return presentationedit;
	}

	public String getDisplayedit() {
		return displayedit;
	}

	public String getDisplaydelete() {
		return displaydelete;
	}

	public String getDisplaycreate() {
		return displaycreate;
	}

	public String getDescription() {
		return description;
	}

	public String getFilename() {
		return filename;
	}

	public String getPresentation() {
		return presentation;
	}

	public String getDisplayhome() {
		return displayhome;
	}

	public String getUsernamelogin() {
		return usernamelogin;
	}

	public String getPasswordlogin() {
		return passwordlogin;
	}

	public String getDisplaylogin() {
		return displaylogin;
	}

	public String getBrowser() {
		return browser;
	}
	
}
