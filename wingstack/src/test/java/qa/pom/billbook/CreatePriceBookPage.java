package qa.pom.billbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePriceBookPage {
	
	@FindBy(xpath="//img[@id='scrollright']")
	private WebElement scroll;
	
	@FindBy(xpath="//a[text()='Price Books']")
	private WebElement priceBook;
	
	@FindBy(xpath="//input[@value='New Price Book']")
	private WebElement createPriceBook;
	
	@FindBy(name="property(Price Book Name)")
	private WebElement priceBookName;
	
	@FindBy(xpath="(//input[@value='Save'])[2]")
	private WebElement clcikSave;
	
	public CreatePriceBookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickScroll(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(scroll).clickAndHold().perform();
		act.release();
		
	}
	
	public void clickPriceBook()
	{
		priceBook.click();
	}
	public void clickCreatePriceBook()
	{
		createPriceBook.click();
	}
	public void setPriceBookName(String name)
	{
		priceBookName.sendKeys(name);
	}
	
	public void clicksave()
	{
		clcikSave.click();
	}

}
