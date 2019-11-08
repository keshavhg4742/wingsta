package qa.scripts;

import java.util.Set;

import org.testng.annotations.Test;

import qa.generics.*;
import qa.pom.contact.ContacDetails;
import qa.pom.contact.CreateContact;

public class CreateContactTest extends BaseTest {
	
	@Test
	public void createContactTest() {
					
			CreateContact contact = new CreateContact(driver);
			contact.clickContact();
			contact.clickNewContact();
			
		ContacDetails cd = new ContacDetails(driver);
		String parent = driver.getWindowHandle();
		
		cd.setFirstName(XL.getData(XL_PATH, "contact", 1, 0));
		cd.setLastName(XL.getData(XL_PATH, "contact", 1, 1));
		
		/*cd.setAccName();
		Set<String> windowHandles = driver.getWindowHandles();
		for(String w:windowHandles)
		{
			driver.switchTo().window(w);
			if(!driver.getWindowHandle().contains(parent))
			{
				cd.clcikText();
			break;
			}
		}
		driver.switchTo().window(parent);*/
		
		
		
		
		cd.setEmail(XL.getData(XL_PATH, "contact", 1, 2));
		cd.setDept(XL.getData(XL_PATH, "contact", 1, 3));
		cd.setMob(XL.getData(XL_PATH, "contact", 1, 4));
		cd.setStreet(XL.getData(XL_PATH, "contact", 1, 5));
		cd.setCity(XL.getData(XL_PATH, "contact", 1, 6));
		cd.setState(XL.getData(XL_PATH, "contact", 1, 7));
		cd.setZip(XL.getData(XL_PATH, "contact", 1, 8));
		cd.setCountry(XL.getData(XL_PATH, "contact", 1, 9));
		cd.clickSave();
		
	}


}
