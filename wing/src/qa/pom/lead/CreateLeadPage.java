package qa.pom.lead;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadPage {
	
	@FindBy(linkText="Leads")
	private WebElement leadTab;
	
	@FindBy(xpath="//input[@value='New Lead']")
	private WebElement newLeadTab;
	
	@FindBy(linkText="Hplatop")
	private WebElement txt;
	
	@FindBy(name="property(Company)")
	private WebElement company;
	@FindBy(name="property(First Name)")
	private WebElement firstName;
	@FindBy(name="property(Last Name)")
	private WebElement lastName;
	@FindBy(name="property(Designation)")
	private WebElement design;
	@FindBy(name="property(Mobile)")
	private WebElement mobile;
	
	@FindBy(name="property(Email)")
	private WebElement email;
	@FindBy(name="property(Fax)")
	private WebElement fax;
	@FindBy(name="property(Website)")
	private WebElement webSite;
	@FindBy(name="property(Lead Source)")
	private WebElement leadSource;
	@FindBy(name="property(Lead Status)")
	private WebElement leadStatus;
	@FindBy(name="property(Industry)")
	
	private WebElement industry;
	@FindBy(name="property(No of Employees)")
	private WebElement numOfEmp;
	@FindBy(name="property(Annual Revenue)")
	private WebElement annualRevenu;
	@FindBy(name="property(Rating)")
	private WebElement rating;
	//@FindBy(xpath="(//tr[@id='row8']//img")
	@FindBy(css=("img[title='Campaign Name Lookup']"))
	private WebElement campignSource;
	
	@FindBy(name="property(Street)")
	private WebElement street;
	@FindBy(name="property(City)")
	private WebElement city;
	@FindBy(name="property(State)")
	private WebElement state;
	@FindBy(name="property(Country)")
	private WebElement country;
	@FindBy(name="property(Zip Code)")
	private WebElement countryzipCode;
	@FindBy(name="property(Description)")
	private WebElement description;
	
	@FindBy(xpath="(//input[@value='Save'])[2]")
	private WebElement save;
	
	public CreateLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clckLead() {
		leadTab.click();
	}
	public void createNewLead() {
		newLeadTab.click();
	}
	
	public void setCompany(String Cname) {
		company.sendKeys(Cname);
	}
	
	public void setFirstName(String name) {
		firstName.sendKeys(name);
	}
	
	public void setLastName(String lastname) {
		lastName.sendKeys(lastname);
	}
	public void setDesgn(String desc) {
		design.sendKeys(desc);
	}
	public void setMobile(String mob) {
		mobile.sendKeys(mob);
	}
	public void setemail(String em) {
		email.sendKeys(em);
	}
	public void setFax(String faxs) {
		fax.sendKeys(faxs);
	}
	public void setWebSite(String site) {
		webSite.sendKeys(site);
	}
	public void setLeadSource(String src) {
		Select s=new Select(leadSource);
		s.selectByValue(src);
	}
	public void setLeadStatus(String sts) {
		Select s=new Select(leadStatus);
		s.selectByValue(sts);
	}
	public void setIndustry(String ind) {
		Select s=new Select(industry);
		s.selectByValue(ind);
	}
	public void setnoEmp(String emp) {
		numOfEmp.sendKeys(emp);
	}
	public void clickcampSrc() {
		
		campignSource.click();
	}
	public void clcikText() {
		txt.click();
	}
	public void setannualRevenu(String rev) {
		annualRevenu.sendKeys(rev);
	}
	public void setRating(String rat) {
		Select s=new Select(rating);
		s.selectByValue(rat);
	}
	
	public void setStreet(String strt) {
		street.sendKeys(strt);
	}
	public void setCity(String city) {
		this.city.sendKeys(city);
	}
	public void setState(String st) {
		state.sendKeys(st);
	}
	public void setCountry(String ctry) {
		country.sendKeys(ctry);
	}
	public void setzipCode(String code) {
		countryzipCode.sendKeys(code);
	}
	public void setDescription(String dsc) {
		description.sendKeys(dsc);
	}
	
	public void clckSave() {
		save.click();
	}
	

}
