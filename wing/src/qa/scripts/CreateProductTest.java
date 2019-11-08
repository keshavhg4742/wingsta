package qa.scripts;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import qa.generics.*;
import qa.pom.product.CreateProductPage;

public class CreateProductTest extends BaseTest {
	
	@Test
	public void createProduct() throws Exception
	{					
			CreateProductPage productPage = new CreateProductPage(driver);
			productPage.ClickProduct();
			productPage.clickCreteproduct();
			String parent = driver.getWindowHandle();
			productPage.setProductCode(XL.getData(XL_PATH, "createProduct", 1, 0));
			productPage.clickvendor();
			Set<String> handles = driver.getWindowHandles();
			for(String w:handles)
			{
				WebDriver window = driver.switchTo().window(w);
				if(!(window.getTitle().equals("Zoho CRM - Create Product")))
				{
				if(!driver.getWindowHandle().equals(parent))
					{	productPage.selectkvendor();
						break;
				}
			}
			}
			driver.switchTo().window(parent);
			SimpleDateFormat date=new SimpleDateFormat("MM/dd/yyyy");
			productPage.setProductName(XL.getData(XL_PATH, "createProduct", 1, 1));
			productPage.setProductCategory(XL.getData(XL_PATH, "createProduct", 1, 2));
			productPage.setManufacturer(XL.getData(XL_PATH, "createProduct", 1, 3));
			productPage.setSalesStartDate(date.format(new Date(XL.getData(XL_PATH, "createProduct", 1, 4))));
			productPage.setSalesEndDate(date.format(new Date(XL.getData(XL_PATH, "createProduct", 1, 5))));
			productPage.setUnitPrice(XL.getData(XL_PATH, "createProduct", 1, 6));
			productPage.setUsageUnit(XL.getData(XL_PATH, "createProduct", 2, 7));
			productPage.setQtyStock(XL.getCel(XL_PATH, "createProduct", 1, 8));
			productPage.clickSave();
			
		
	}

}
