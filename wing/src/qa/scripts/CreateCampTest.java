package qa.scripts;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

import qa.generics.BaseTest;
import qa.generics.XL;
import qa.pom.campaign.CreateCampaignPage;
import qa.pom.campaign.DisplayCustPage;
import qa.pom.campaign.HomePage;


public class CreateCampTest extends BaseTest {
	
	@Test
	public void createCampTest() throws Exception {
		
		SimpleDateFormat date=new SimpleDateFormat("MM/dd/yyyy");
		
		
		
		
		Thread.sleep(ITO);
		new HomePage(driver).clickCampaign();
		Thread.sleep(ITO);
		new DisplayCustPage(driver).clckNewCampaign();
		Thread.sleep(1000);
		CreateCampaignPage createCampaignPage = new CreateCampaignPage(driver);
		createCampaignPage.setCamaignName(XL.getData(XL_PATH, "CreateCampaign", 1,0));
		
		createCampaignPage.setstartDate(date.format(new Date(XL.getData(XL_PATH, "CreateCampaign", 1,1))));
		
		//createCampaignPage.setExpectedRevenu((new BigDecimal(XL.getData(XL_PATH, "CreateCampaign", 1,2)).toBigInteger().toString()));
		
		createCampaignPage.setExpectedRevenu(XL.getCel(XL_PATH, "CreateCampaign", 1,2));
		
		createCampaignPage.setactualCost(XL.getData(XL_PATH, "CreateCampaign", 1,3));
		createCampaignPage.setnumSent(XL.getCel(XL_PATH, "CreateCampaign", 1,4));
		createCampaignPage.settype(XL.getData(XL_PATH, "CreateCampaign", 2,5));
		createCampaignPage.setstatus(XL.getData(XL_PATH, "CreateCampaign", 2,6));
		
		createCampaignPage.setendDate(date.format(new Date(XL.getData(XL_PATH, "CreateCampaign", 1,7))));
		createCampaignPage.setBudgetCost(XL.getData(XL_PATH, "CreateCampaign", 1,8));
		createCampaignPage.setexpectedRespo(XL.getCel(XL_PATH, "CreateCampaign", 1,9));
		createCampaignPage.setDescription(XL.getData(XL_PATH, "CreateCampaign", 1,10));
		//Thread.sleep(ITO);
		createCampaignPage.save();
		

	}

}
