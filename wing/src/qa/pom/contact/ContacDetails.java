package qa.pom.contact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContacDetails {
	@FindBy(name="property(First Name)")
	private WebElement firstName;
	@FindBy(name="property(Last Name)")
	private WebElement lastName;

	@FindBy(xpath="//img[@title='Vendor Name Lookup']")
	private WebElement vendor;
	@FindBy(xpath="//a[text()='girish']")
	private WebElement vendTxt;

	@FindBy(xpath="//img[@title='Account Name Lookup']")
	private WebElement accName;
	@FindBy(xpath="//a[contains(text(),'QSpiders Bull Temple')]")
	private WebElement text;

	@FindBy(name="property(Email)")
	private WebElement email;
	@FindBy(xpath="//input[@name='property(Department)']")
	private WebElement dept;
	@FindBy(name="property(Mobile)")
	private WebElement mob;

	@FindBy(name="property(Mailing Street)")
	private WebElement street;
	@FindBy(name="property(Mailing City)")
	private WebElement city;
	@FindBy(name="property(Mailing State)")
	private WebElement state;
	@FindBy(name="property(Mailing Zip)")
	private WebElement zip;
	@FindBy(name="property(Mailing Country)")
	private WebElement country;

	@FindBy(id="copyAddress")
	private WebElement copyAddr;
	@FindBy(xpath="(//input[@name='Button'])[3]")
	private WebElement clickSave;

	public ContacDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}




	public void setFirstName(String fname ) {
		firstName.sendKeys(fname);
	}
	public void setLastName(String lname) {
		lastName.sendKeys(lname);
	}



	public void setAccName( ) {
		accName.click();
	}
	public void clcikText() {
		text.click();
	}

	public void setVendor(String acName) {
		this.accName.sendKeys(acName);
	}
	public void clcikVend() {
		vendTxt.click();
	}


	public void setEmail(String emails) {
		email.sendKeys(emails);
	}

	public void setDept(String depts) {
		dept.sendKeys(depts);
	}

	public void setMob(String mobil) {
		mob.sendKeys(mobil);
	}
	public void setStreet(String street) {
		this.street.sendKeys(street);
	}
	public void setCity(String city) {
		this.city.sendKeys(city);
	}
	public void setState(String st) {
		state.sendKeys(st);
	}
	public void setZip(String zipc) {
		zip.sendKeys(zipc);
	}
	public void setCountry(String contr) {
		country.sendKeys(contr);
	}
	public void copyAddr() {
		copyAddr.click();
	}
	public void clickSave() {
		clickSave.click();
	}
}
