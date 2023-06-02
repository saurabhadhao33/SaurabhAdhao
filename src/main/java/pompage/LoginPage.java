package pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
		
		@FindBy(xpath="//input[@name='password']")
		private WebElement password;
		
		@FindBy(xpath="//*[@type=\"submit\"]")
		private WebElement loginbutton;
		
		public LoginPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		
		public void loginToApp() {
			
			username.sendKeys("Admin");
			password.sendKeys("admi123");
			loginbutton.click();
		}
	}


