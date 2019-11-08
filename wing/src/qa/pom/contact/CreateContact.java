package qa.pom.contact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContact {
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	private WebElement contact;
	@FindBy(xpath="//input[@value='New Contact']")
	private WebElement newContact;

	public CreateContact(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickContact()
	{
		contact.click();
	}

	public void clickNewContact()
	{
		newContact.click();
	}
}
//input[contains(@value,'New Contact')]