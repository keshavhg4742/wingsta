package qa.scripts;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import qa.generics.*;
import qa.pom.quatation.CreateQuatationPage;

public class CreateQuatTest extends BaseTest {
	
	@Test
	public void createQuat() throws Exception {
		CreateQuatationPage qtuPage = new CreateQuatationPage(driver);
		Thread.sleep(ETO);
		qtuPage.clickScroll(driver);
		Thread.sleep(ITO);
		qtuPage.clickQuatTab();
		qtuPage.clickNewQuatTab();
		String parent = driver.getWindowHandle();
		qtuPage.clickPotentialLead();
		//
		Set<String> handles = driver.getWindowHandles();
		
		
		for(String h:handles)
		{
			WebDriver window = driver.switchTo().window(h);
		
			if(!(window.getTitle().equals("Zoho CRM - Create Quote")));
			{
				if(!driver.getWindowHandle().contains(parent))
				{				
					qtuPage.clickPLead();
					break;
			}}
		}
		driver.switchTo().window(parent);
		qtuPage.setSubject(XL.getData(XL_PATH, "quatation",1,0));
		qtuPage.setValidTill(new SimpleDateFormat("MM/dd/yyyy").format(new Date(XL.getData(XL_PATH, "quatation",1,1))));
		
		qtuPage.setQuteStage(XL.getData(XL_PATH, "quatation",2,2));
		qtuPage.clickContact();
		for(String s:driver.getWindowHandles())
		{
			WebDriver window = driver.switchTo().window(s);
			if(!(window.getTitle().equals("Zoho CRM - Create Quote")));
			{
				if(!driver.getWindowHandle().contains(parent))
				{	
					qtuPage.clickContactName();
					break;
			}
		}
		}
		Thread.sleep(ETO);
		driver.switchTo().window(parent);
		
		qtuPage.clickAccountName();
		for(String s:driver.getWindowHandles())
		{
			WebDriver window = driver.switchTo().window(s);
			if(!(window.getTitle().equals("Zoho CRM - Create Quote")));
			{
				if(!driver.getWindowHandle().contains(parent))
				{	
					qtuPage.selectAccName();
					break;
			}
		}
		}
		driver.switchTo().window(parent);
		/*
		qtuPage.setCarrier(XL.getData(XL_PATH, "quatation",1,3));
		qtuPage.setBillingCity(XL.getData(XL_PATH, "quatation",1,4));
		qtuPage.setBillingState(XL.getData(XL_PATH, "quatation",1,5));
		qtuPage.setBillingCountry(XL.getData(XL_PATH, "quatation",1,6));
		qtuPage.clickCopyAddress();*/
		qtuPage.clickProductName();
		for(String s:driver.getWindowHandles())
		{
			WebDriver window = driver.switchTo().window(s);
			if(!(window.getTitle().equals("Zoho CRM - Create Quote")));
			{
				if(!driver.getWindowHandle().contains(parent))
				{	
					qtuPage.selectProduct();
					break;
			}
		}
		}
		Thread.sleep(ITO);
		driver.switchTo().window(parent);
		
		qtuPage.setQty(XL.getData(XL_PATH, "quatation",1,7));
		qtuPage.setListPrice(XL.getData(XL_PATH, "quatation",1,8));
		qtuPage.setTermsCondition(XL.getData(XL_PATH, "quatation",1,9));
		qtuPage.clickSave();

	}

}
