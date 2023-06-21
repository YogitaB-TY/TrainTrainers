package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	public WelcomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText = "Register")
	private WebElement registerLink;
	
	public void clickRegister() {
		registerLink.click();
	}
	
	public WebElement getRegisterLink() {
		return registerLink;
	}



	public void setRegisterLink(WebElement registerLink) {
		this.registerLink = registerLink;
	}

	@FindBy(partialLinkText = "Log in")
	WebElement loginLink;

}
