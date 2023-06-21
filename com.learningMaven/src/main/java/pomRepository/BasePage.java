package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.genericLibrary.UtilityMethods;

public class BasePage extends UtilityMethods {
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
