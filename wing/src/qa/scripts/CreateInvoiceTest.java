package qa.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import qa.generics.BaseTest;
import qa.pom.invoice.InvoicePage;

public class CreateInvoiceTest extends BaseTest {
	
	@Test
	public void createInvoice()throws Exception {
		InvoicePage invoicePage = new InvoicePage(driver);
		//Thread.sleep(ETO);
		invoicePage.clickScroll(driver);
		Thread.sleep(ETO);
		invoicePage.clickInvoiceTab();
		invoicePage.clicknewInvoice();
		String parent = driver.getWindowHandle();
		invoicePage.clickSalesOrder();
		for(String h:driver.getWindowHandles())
		{
			WebDriver window = driver.switchTo().window(h);
			if(!window.getTitle().contains("Zoho CRM - Create Invoice"))
			{
				
				invoicePage.selectSalesOrder();
				Thread.sleep(ITO);
				break;
			}
			
		}
		Thread.sleep(1000);
		driver.switchTo().window(parent);
		
		invoicePage.clickSave();

	}

}
