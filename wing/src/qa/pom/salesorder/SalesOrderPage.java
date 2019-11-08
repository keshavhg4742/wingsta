package qa.pom.salesorder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesOrderPage {
	
	@FindBy(id="scrollright")
	private WebElement scroll;
	
	@FindBy(xpath="//a[contains(text(),'Sales Orders')]")
	private WebElement salesOrderTab;
	
	@FindBy(xpath="//input[@value='New Sales Order']")
	private WebElement newSalesOrder;
	
	@FindBy(name="property(Subject)")
	private WebElement subject;
	
	//@FindBy(xpath="//img[contains(@title,'Quote Lookup'")
	@FindBy(css="img[title='Quote Lookup'")
	private WebElement qutaName;
	
	@FindBy(linkText="hplapre")
	private WebElement selectqutaName;
	
	@FindBy(name="property(Purchase Order)")
	private WebElement porder;
	@FindBy(name="property(Due Date)")
	private WebElement dueDate;
	
	@FindBy(name="property(Terms and Conditions)")
	private WebElement termsCondition;
	
	@FindBy(xpath="(//input[@value='Save'])[2]")
	private WebElement save;
	
	public SalesOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickScroll(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(scroll).clickAndHold().perform();
		act.release().click().perform();
		
	}
	
	public void salesOrderTab()
	{
		salesOrderTab.click();
	}
	public void newSalesOrder()
	{
		newSalesOrder.click();
	}
	
	public void selectSubject(String sub)
	{
		subject.sendKeys(sub);
	}
	public void qutaName()
	{
		qutaName.click();
	}
	
	public void selectqutaName()
	{
		selectqutaName.click();
	}
	
	public void setporder(String porders) {
		porder.sendKeys(porders);
	}
	public void setdueDate(String date) {
		dueDate.sendKeys(date);
	}
	public void setTermsCondition(String termsCond) {
		termsCondition.sendKeys(termsCond);
	}
	public void clickSave() {
		save.click();
		
	}

}
