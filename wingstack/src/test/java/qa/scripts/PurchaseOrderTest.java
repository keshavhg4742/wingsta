package qa.scripts;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import qa.generics.*;
import qa.pom.purchaseorder.PurchaseOrderPage;

public class PurchaseOrderTest extends BaseTest {
	
	@Test
	public void PurchaseOrder() throws Exception
	{
		PurchaseOrderPage orderPage = new PurchaseOrderPage(driver);
		SimpleDateFormat date=new SimpleDateFormat("MM/dd/yyyy");
		//Thread.sleep(ETO);
		orderPage.clickScroll(driver);
		Thread.sleep(ITO);
		orderPage.purchaseOrderTab();
		orderPage.newPorder();
		String parent = driver.getWindowHandle();
		orderPage.poNumber(XL.getData(XL_PATH, "purchaseOrder", 1, 0));
		orderPage.subject(XL.getData(XL_PATH, "purchaseOrder", 1, 1));
		orderPage.vendorName();
		Set<String> handles = driver.getWindowHandles();
		for(String h:handles)
		{
			WebDriver window = driver.switchTo().window(h);
			if(!(window.getTitle().equals("Zoho CRM - Create Purchase Order")))
			{
				if(!driver.getWindowHandle().contains(parent))
				{	
					orderPage.selecVendor();
					break;
			}}
		}
		driver.switchTo().window(parent);
		
		orderPage.trackingNumber(XL.getData(XL_PATH, "purchaseOrder", 1, 2));
		
		orderPage.clickContact();
		
		
		for(String h:driver.getWindowHandles())
		{
			WebDriver window = driver.switchTo().window(h);
			if(!(window.getTitle().equals("Zoho CRM - Create Purchase Order")))
			{
				if(!driver.getWindowHandle().contains(parent))
				{	
					orderPage.clickContactName();
					break;
			}}
		}
		driver.switchTo().window(parent);
		orderPage.dueDate(date.format(new Date(XL.getData(XL_PATH, "purchaseOrder", 1, 3))));
		orderPage.poDate(date.format(new Date(XL.getData(XL_PATH, "purchaseOrder", 1, 4))));
		
		orderPage.setBillingCity(XL.getData(XL_PATH, "purchaseOrder", 1, 5));
		orderPage.setBillingState(XL.getData(XL_PATH, "purchaseOrder", 1, 6));
		orderPage.setBillingCountry(XL.getData(XL_PATH, "purchaseOrder", 1, 7));
		orderPage.clickCopyAddress();
		
		orderPage.clickProductName();
		for(String s:driver.getWindowHandles())
		{
			WebDriver window = driver.switchTo().window(s);
			if(!(window.getTitle().equals("Zoho CRM - Create Purchase Order")))
			{
				if(!driver.getWindowHandle().contains(parent))
				{	
				orderPage.selectProduct();
					break;
			}
		}
		}
		Thread.sleep(ITO);
		driver.switchTo().window(parent);
		orderPage.setQty(XL.getData(XL_PATH, "purchaseOrder", 1, 8));
		orderPage.setListPrice(XL.getData(XL_PATH, "purchaseOrder", 1, 9));
		orderPage.setTermsCondition(XL.getData(XL_PATH, "purchaseOrder", 1, 10));
		orderPage.clickSave();
	}

}
