package qa.pom.campaign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisplayCustPage {
	@FindBy(xpath="//input[@value='New Campaign']")
	private WebElement newCampaign;
	
	public DisplayCustPage(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	public void clckNewCampaign() {
		newCampaign.click();

	}
	

}
