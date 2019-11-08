package qa.scripts;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import qa.generics.*;
import qa.pom.lead.CreateLeadPage;

public class CreateLeadTest extends BaseTest {
	
	@Test
	public void createLeadTest() throws Exception
	{
		CreateLeadPage leadPage = new CreateLeadPage(driver);
		String parent = driver.getWindowHandle();
				
		leadPage.clckLead();
		leadPage.createNewLead();
		leadPage.setCompany(XL.getData(XL_PATH, "Lead", 1, 0));
		leadPage.setFirstName(XL.getData(XL_PATH, "Lead", 1, 1));
		leadPage.setLastName(XL.getData(XL_PATH, "Lead", 1, 2));
		leadPage.setDesgn(XL.getData(XL_PATH, "Lead", 1, 3));
		leadPage.setemail(XL.getData(XL_PATH, "Lead", 1, 4));
		leadPage.setFax(XL.getData(XL_PATH, "Lead", 1, 5));
		leadPage.setMobile(XL.getCel(XL_PATH, "Lead", 1, 6));
		leadPage.setWebSite(XL.getData(XL_PATH, "Lead", 1, 7));
		leadPage.setLeadSource(XL.getData(XL_PATH, "Lead", 1, 8));
		leadPage.setLeadStatus(XL.getData(XL_PATH, "Lead", 3, 9));
		leadPage.setIndustry(XL.getData(XL_PATH, "Lead", 1, 10));
		leadPage.setnoEmp(XL.getCel(XL_PATH, "Lead", 1, 11));
		leadPage.setannualRevenu(XL.getCel(XL_PATH, "Lead", 1, 12));
		leadPage.setRating(XL.getData(XL_PATH, "Lead", 2, 13));
		
		Thread.sleep(ETO);
		leadPage.clickcampSrc();
		Set<String> handles = driver.getWindowHandles();
		for(String s:handles)
		{
			WebDriver window = driver.switchTo().window(s);
			if(window.getTitle().contains("Campaign Name Lookup"))
				{
				leadPage.clcikText();
				
				break;
				}
		}
		driver.switchTo().window(parent);
		leadPage.setStreet(XL.getData(XL_PATH, "Lead", 1, 15));
		leadPage.setCity(XL.getData(XL_PATH, "Lead", 1, 16));
		leadPage.setState(XL.getData(XL_PATH, "Lead", 1, 17));
		leadPage.setCountry(XL.getData(XL_PATH, "Lead", 1, 18));
		leadPage.setzipCode(XL.getCel(XL_PATH, "Lead", 1, 19));
		leadPage.setDescription(XL.getData(XL_PATH, "Lead", 1, 20));
		leadPage.clckSave();
	}

}
