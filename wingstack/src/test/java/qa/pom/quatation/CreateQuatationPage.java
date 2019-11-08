package qa.pom.quatation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateQuatationPage {
	
	@FindBy(xpath="//img[@id='scrollright']")
	private WebElement scroll;
	
	@FindBy(xpath="//a[contains(text(),'Quotes')]")
	private WebElement qutTab;
	
	@FindBy(xpath="//input[@value='New Quote']")
	private WebElement newQutTab;
	
	@FindBy(name="property(Subject)")
	private WebElement subject;
	
	@FindBy(xpath="//img[@title='Potential Name Lookup']")
	private WebElement potentialLead;
	
	@FindBy(xpath="//a[contains(text(),'QSpiders Pvt Ltd')]")/*xpath="(//a[@class='link'])[1]"*/
	private WebElement selectPLead;
	
	
	@FindBy(name="property(Valid Till)")
	private WebElement validTill;
	

	@FindBy(name="property(Quote Stage)")
	private WebElement quteStage;
	
	@FindBy(xpath="//img[@title='Contact Name Lookup']")
	private WebElement contact;
	@FindBy(xpath="//a[contains(text(),'Girish Sir')]")
	private WebElement selectContact;
	
	@FindBy(name="property(Carrier)")
	private WebElement carrier;
	

	@FindBy(xpath="//img[contains(@title,'Account Name Lookup')]")
	private WebElement accountName;
	@FindBy(xpath="//a[contains(text(),'QSpiders Banaswadi')]")
	private WebElement selectAccName;
	
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
	@FindBy(xpath="//a[text()='HDD']")
	private WebElement selectproduct;
	
	@FindBy(name="property(txtQty1)")
	private WebElement qty;
	
	@FindBy(name="property(txtListPrice1)")
	private WebElement listPrice;
	@FindBy(name="property(Terms and Conditions)")
	private WebElement termsCondition;
	
	@FindBy(xpath="(//input[@value='Save'])[2]")
	private WebElement save;
	
	public CreateQuatationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickScroll(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(scroll).clickAndHold().perform();
		act.release().click().perform();
		
	}
	public void clickQuatTab()
	{
		qutTab.click();
	}
	public WebElement getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty.sendKeys(qty);
	}

	public void setSubject(String subject) {
		this.subject.sendKeys(subject);
	}

	public void clickPotentialLead() {
		potentialLead.click();
	}

	public void setValidTill(String validTill) {
		this.validTill.sendKeys(validTill);
	}

	public void setQuteStage(String qStage) {
		new Select(quteStage).selectByValue(qStage);
	}

	public void clickContact() {
		contact.click();
	}

	public void setCarrier(String carrie) {
		new Select(carrier).selectByValue(carrie);
	}

	public void clickAccountName() {
		accountName.click();
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

	public void setListPrice(String listPrice) {
		this.listPrice.sendKeys(listPrice);
	}

	public void setTermsCondition(String termsCondition) {
		this.termsCondition.sendKeys(termsCondition);
	}

	public void clickNewQuatTab()
	{
		newQutTab.click();
	}
	public void clickPLead()
	{
		selectPLead.click();
	}
	public void clickContactName()
	{
		selectContact.click();
	}
	

	public void selectAccName() {
		selectAccName.click();
		
	}
	
	public void selectProduct() {
		selectproduct.click();
		
	}
	public void clickSave() {
		save.click();
		
	}
	

}
