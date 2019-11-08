package qa.pom.purchaseorder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrderPage {
	
	@FindBy(id="scrollright")
	private WebElement scroll;
	
	@FindBy(xpath="//a[contains(text(),'Purchase Orders')]")
	private WebElement purchaseOrderTab;
	
	@FindBy(xpath="//input[@value='New Purchase Order']")
	private WebElement newPorder;
	
	@FindBy(name="property(Subject)")
	private WebElement subject;
	
	@FindBy(name="property(PO Number)")
	private WebElement poNumber;
	
	@FindBy(xpath="//img[@title='Vendor Name Lookup']")
	private WebElement vendorName;
	
	@FindBy(xpath="//a[contains(text(),'girish')]")
	private WebElement selectVendor;
	
	@FindBy(name="property(Tracking Number)")
	private WebElement trackingNumber;
	
	@FindBy(xpath="//img[@title='Contact Name Lookup']")
	private WebElement contact;
	@FindBy(xpath="//a[contains(text(),'Girish Sir')]")
	private WebElement selectContact;
	
	@FindBy(name="property(Due Date)")
	private WebElement dueDate;
	
	@FindBy(name="property(PO Date)")
	private WebElement podate;
	
	@FindBy(name="property(Billing City)")
	private WebElement billingCity;
	
	@FindBy(name="property(Billing State)")
	private WebElement billingState;
	
	@FindBy(name="property(Billing Country)")
	private WebElement billingCountry;
	
	@FindBy(name="copyAddress")
	private WebElement copyAddress;
	
	@FindBy(xpath="//img[@title='Product Name Lookup']")
	private WebElement productName;
	@FindBy(xpath="//a[contains(text(),'bluewings')]")
	private WebElement selectproduct;
	
	@FindBy(name="property(txtQty1)")
	private WebElement qty;
	
	@FindBy(name="property(txtListPrice1)")
	private WebElement listPrice;
	@FindBy(name="property(Terms and Conditions)")
	private WebElement termsCondition;
	
	@FindBy(xpath="(//input[@value='Save'])[2]")
	private WebElement save;
	
	
	public PurchaseOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void clickScroll(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(scroll).clickAndHold().perform();
		act.release().click().perform();
		
	}

	public void purchaseOrderTab()
	{
		purchaseOrderTab.click();
	}
	
	public void newPorder()
	{
		newPorder.click();
	}
	
	public void vendorName()
	{
		vendorName.click();
	}
	//select vendor
	public void selecVendor()
	{
		selectVendor.click();
	}
	public void poNumber(String number)
	{
		poNumber.sendKeys(number);
	}
	
	public void subject(String subject)
	{
		this.subject.sendKeys(subject);
	}
	
	public void trackingNumber(String trackNumber)
	{
		trackingNumber.sendKeys(trackNumber);
	}
	
	public void clickContact() {
		contact.click();
	}
	public void clickContactName()
	{
		selectContact.click();
	}
	public void dueDate(String date)
	{
		dueDate.sendKeys(date);
	}
	
	public void poDate(String date)
	{
		podate.sendKeys(date);
	}
	
	

	public void setBillingCity(String billingCity) {
		this.billingCity.sendKeys(billingCity);
	}

	public void setBillingState(String billingState) {
		this.billingState.sendKeys(billingState);
	}

	public void setBillingCountry(String billingCountry) {
		this.billingCountry.sendKeys(billingCountry);
	}

	public void clickCopyAddress() {
		this.copyAddress.click();;
	}

	public void clickProductName() {
		this.productName.click();
	}
	public void selectProduct() {
		selectproduct.click();
		
	}

	public void setListPrice(String listPrice) {
		this.listPrice.sendKeys(listPrice);
	}
	public void setQty(String qty) {
		this.qty.sendKeys(qty);
	}

	public void setTermsCondition(String termsCondition) {
		this.termsCondition.sendKeys(termsCondition);
	}
	public void clickSave() {
		save.click();
		
	}
	
}
