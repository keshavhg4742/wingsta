package qa.scripts;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import qa.generics.*;
import qa.pom.salesorder.SalesOrderPage;

public class SalesOrderTest extends BaseTest {
	@Test
	public void salesOrder() throws Exception
	{
		SalesOrderPage salesOrderPage = new SalesOrderPage(driver);
		salesOrderPage.clickScroll(driver);
		salesOrderPage.salesOrderTab();
		salesOrderPage.newSalesOrder();
		String parent = driver.getWindowHandle();
		salesOrderPage.setporder(XL.getData(XL_PATH, "salesOrder", 1, 0));
		salesOrderPage.setdueDate(new SimpleDateFormat("MM/dd/yyyy").format(new Date(XL.getData(XL_PATH, "salesOrder", 1, 1))));
		salesOrderPage.qutaName();
		for(String h:driver.getWindowHandles())
		{
			
			WebDriver window = driver.switchTo().window(h);
			if(!(window.getTitle().equals("Zoho CRM - Create Sales Order")))
			{
			if(!driver.getWindowHandle().equals(parent))
				salesOrderPage.selectqutaName();
				break;
		}
		}
		Thread.sleep(1000);
		driver.switchTo().window(parent);
		
		//salesOrderPage.setTermsCondition(XL.getData(XL_PATH, "salesOrder", 1, 2));
		salesOrderPage.clickSave();
		
	}

}
