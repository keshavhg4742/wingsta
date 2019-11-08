package qa.scripts;

import org.testng.annotations.Test;

import qa.generics.*;
import qa.pom.billbook.CreatePriceBookPage;



public class CreatePriceBookTest extends BaseTest {
	
	@Test
	public void priceBook() throws Exception {
		CreatePriceBookPage bookPage = new CreatePriceBookPage(driver);
		
		bookPage.clickScroll(driver);
		Thread.sleep(ITO);
		bookPage.clickPriceBook();
		bookPage.clickCreatePriceBook();
		bookPage.setPriceBookName(XL.getData(XL_PATH, "priceBook",1, 0));
		bookPage.clicksave();
		

	}

}
