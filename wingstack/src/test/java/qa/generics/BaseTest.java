package qa.generics;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;



import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class BaseTest implements IAutoConstant {
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		 WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.get(APP_URL);
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@alt='Sign In']")).click();
		
	}
	/*public ExtentReports extent;
	public ExtentTest extentTest;
	
	@BeforeTest
	public void setExtent()
	{
		extent= new ExtentReports(System.getProperty("user.dir")+"./test-output/extentReport.html",true);
		extent.addSystemInfo("HostName", "keshav_windows");
		extent.addSystemInfo("userName", "keshav");
		extent.addSystemInfo("Environment", "QA");
	}
	@AfterTest
	public void endReport()
	{
		extent.flush();
		extent.close();
	}
	public static String getScreenShot(WebDriver driver,String screenshot)
	{
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String dest=System.getProperty("user.dir")+"/images/"+screenshot+dateName+".png";
		File fileDest = new File(dest);
		try {
			FileUtil.copyFile(src, fileDest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dest;
		
	}
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			 extentTest.log(LogStatus.FAIL,"Test case is failed"+result.getName()); 
			 extentTest.log(LogStatus.FAIL,"Test case is failed"+result.getThrowable()); 
			 String screenshot=BaseTest.getScreenShot(driver, result.getName());
			 extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshot));
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			extentTest.log(LogStatus.SKIP,"Test case is skipped"+result.getName()); 
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			extentTest.log(LogStatus.PASS,"Test case is passed"+result.getName()); 
		}
		extent.endTest(extentTest);
		//driver.close();
	}*/
	
	@AfterMethod
	public void closeApp(ITestResult iTestResult) {
		int status = iTestResult.getStatus();
		String name = iTestResult.getName();
		if(status==1)
		{
			Reporter.log("Test"+name+"is pass",true);
		}
		else {
			Reporter.log("Test"+name+"is FAIL/SKIP",true);
			AutoLib.getPhoto(driver, IMG_PATH+name+".png");
		}
		driver.close();
		
	}
}
