package common_method;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

import pageClass.HomePage;
import tools.ReportManager;
import tools.Utility;

public class BaseTestConfiguration {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static ExtentReports Reports;
	public static HomePage oHomePage;
	@BeforeSuite(alwaysRun=true)
	public void setup(){
		File file = new File(System.getProperty("user.dir")+"\\Resource\\" + "chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
		String timestamp = new SimpleDateFormat("yyyyMMddhhmm'.html'").format(new Date());
		Reports=ReportManager.getReporter(System.getProperty("user.dir")+"\\Report\\"+"Report"+timestamp);
		driver =new ChromeDriver();
		wait=new WebDriverWait(driver,20);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		


		driver.get("https://www.walmart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		oHomePage=new HomePage();

		}
		@AfterSuite
		public void closethebrowser()
		{
			//driver.close();
			//driver.quit();
		}
@AfterMethod
public void forscreenshot(ITestResult result){
	if(ITestResult.FAILURE==result.getStatus())
	{
		Utility.captureScreenshotnshot(result.getName());
	}
}
	

}
