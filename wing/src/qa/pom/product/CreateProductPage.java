package qa.pom.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateProductPage {
	
	@FindBy(xpath="//a[text()='Products']")
	private WebElement product;
	
	@FindBy(xpath="//input[@value='New Product']")
	private WebElement creteproduct;
	
	@FindBy(name="property(Product Code)")
	private WebElement productCode;
	
	@FindBy(xpath="//img[@title='Vendor Name Lookup']")
	private WebElement vendorName;
	
	@FindBy(linkText="girish")
	private WebElement selectVendor;
	
	@FindBy(name="property(Product Category)")
	private WebElement productCategory;
		
	@FindBy(name="property(Product Name)")
	private WebElement productName;
	
	@FindBy(name="property(Manufacturer)")
	private WebElement manufacturer;
	
	@FindBy(name="property(Sales Start Date)")
	private WebElement salesStartDate;
	
	@FindBy(name="property(Sales End Date)")
	private WebElement salesEndDate;
	
	@FindBy(name="property(Unit Price)")
	private WebElement unitPrice;
	
	@FindBy(name="property(Usage Unit)")
	private WebElement usageUnit;
	
	@FindBy(name="property(Qty in Stock)")
	private WebElement qtyStock;
	
	@FindBy(xpath="(//input[@name='Button'])[3]")
	private WebElement clickSave;
	
	
	public CreateProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ClickProduct()
	{
		product.click();
	
	}
	public void clickCreteproduct() {
		creteproduct.click();
	}
	public void setProductCode(String productCode) {
		this.productCode.sendKeys(productCode);
		
	}
	
	public void clickvendor() {
		vendorName.click();
	}
	public void selectkvendor() {
		selectVendor.click();
	}
	public void setProductCategory(String prodCategory) {
		Select pcat = new Select(productCategory);
		pcat.selectByValue(prodCategory);
	}
	public void setProductName(String productName) {
		this.productName.sendKeys(productName);
	}
	public void setManufacturer(String mfg) {
		Select mf = new Select(manufacturer);
		mf.selectByValue(mfg);
	}
	public void setSalesStartDate(String salesStartDate) {
		this.salesStartDate.sendKeys(salesStartDate);
	}
	public void setSalesEndDate(String salesEndDate) {
		this.salesEndDate.sendKeys(salesEndDate);
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice.sendKeys(unitPrice);
	}
	public void setUsageUnit(String usageUnit) {
		this.usageUnit.sendKeys(usageUnit);
	}
	public void setQtyStock(String stock) {
		qtyStock.sendKeys(stock);
	}
	public void clickSave() {
		clickSave.click();
	}
	

}
