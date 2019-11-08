package qa.pom.campaign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateCampaignPage {
	@FindBy(name="property(Campaign Name)")
	private WebElement campaignName;
	
	@FindBy(name="property(Start Date)")
	private WebElement startDate;
	
	@FindBy(name="property(End Date)")
	private WebElement endDate;
	
	@FindBy(name="property(Type)")
	private WebElement type;
	
	@FindBy(name="property(Status)")
	private WebElement status;
	
	@FindBy(name="property(Expected Revenue)")
	private WebElement expectedRevenu;
	
	@FindBy(name="property(Actual Cost)")
	private WebElement actualCost;
	
	@FindBy(name="property(Num sent)")
	private WebElement numSent;
	
	@FindBy(name="property(Budgeted Cost)")
	private WebElement budgeCost;
	
	@FindBy(name="property(Expected Response)")
	private WebElement expectedResponse;
	
	@FindBy(name="property(Description)")
	private WebElement description;
	
	@FindBy(name="Button")
	private WebElement save;
	
	public CreateCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setCamaignName(String campName) {
		campaignName.sendKeys(campName);
	}
	public void setstartDate(String startdate) {
		startDate.sendKeys(startdate);
	}
	public void setendDate(String enddate) {
		endDate.sendKeys(enddate);
	}
	public void settype(String type) {
		Select se=new Select(this.type);
		se.selectByValue(type);
	}
	public void setstatus(String stat) {
		Select se=new Select(status);
		se.selectByValue(stat);
	}
	public void setExpectedRevenu(String revenu) {
		expectedRevenu.sendKeys(revenu);
	}
	public void setactualCost(String cost) {
		actualCost.sendKeys(cost);
	}
	public void setnumSent(String numsent) {
		numSent.sendKeys(numsent);
	}
	public void setBudgetCost(String bdcost) {
		budgeCost.sendKeys(bdcost);
	}
	public void setexpectedRespo(String respo) {
		expectedResponse.sendKeys(respo);
	}
	public void setDescription(String descriptions) {
		description.sendKeys(descriptions);
	}
	public void save() {
		save.click();
	}

}
