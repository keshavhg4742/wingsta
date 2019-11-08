package qa.pom.invoice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicePage {
	
	@FindBy(id="scrollright")
	private WebElement scroll;
	
	@FindBy(xpath="//a[text()='Invoices']")
	private WebElement invoiceTab;
	
	@FindBy(xpath="//input[@value='New Invoice']")
	private WebElement newInvoice;
	
	@FindBy(xpath="//img[@title='SalesOrder Lookup']")
	private WebElement clickSalesOrder;
		
	@FindBy(xpath="(//a[text()='hplapre'])[2]")
	private WebElement selectSalesOrder;
	
	@FindBy(xpath="(//input[@value='Save'])[2]")
	private WebElement save;
	
	public InvoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickScroll(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(scroll).clickAndHold().perform();
		act.moveToElement(scroll).clickAndHold().perform();
		act.release().click().perform();
		
	}
	public void clickInvoiceTab()
	{
		invoiceTab.click();
	}
	
	public void clicknewInvoice()
	{
		newInvoice.click();
	}

	public void clickSalesOrder()
	{
		clickSalesOrder.click();
	}
	public void selectSalesOrder() {
		selectSalesOrder.click();

	}
	public void clickSave()
	{
		save.click();
	}
}
