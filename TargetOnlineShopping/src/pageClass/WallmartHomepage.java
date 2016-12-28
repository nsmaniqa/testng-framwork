package pageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.relevantcodes.extentreports.LogStatus;

import tools.Utility;

public class WallmartHomepage {

	
	@FindBy(xpath="//a[contains(.,'Hello. Sign In')]")
	WebElement hellosignin_link;
	driver.findElement(By.xpath(""));
	
	public WallmartHomepage ()
	{
		PageFactory.initElements(driver, this);
	}
	
public void clickonlogin() throws InterruptedException{
	signinlink_menu.click();
	wait.until(ExpectedConditions.elementToBeClickable(signin_menu));
	signin_menu.click();
	Thread.sleep(1000);
	if(Utility.isEqual("sign in", sigin_button.getText()))
	{
		Reports.log(LogStatus.PASS, "login is pass");
		
	}
	else
		Reports.log(LogStatus.FAIL, " login is not sucess");
	emailidtext_menu.sendKeys("durai.me72@gmail.com");
	Thread.sleep(1000);
	passwordtext_menu.sendKeys("dhakshan25");
	Thread.sleep(1000);
	sigin_button.click();
	if(Utility.isEqual("hello Ayyadurai", loginname_text.getText()))
	{
		Reports.log(LogStatus.PASS, "login is pass");
		
	}
	else
		Reports.log(LogStatus.FAIL, " login is not sucess");
}
}
