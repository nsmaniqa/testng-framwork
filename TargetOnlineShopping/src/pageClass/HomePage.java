package pageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.relevantcodes.extentreports.LogStatus;

import common_method.BaseTestConfiguration;
import tools.Utility;

public class HomePage extends BaseTestConfiguration{
	
	/*@FindBy(xpath="//*[@id='js-toggleRightNavLg']/span")
	WebElement signinlink_menu;
	@FindBy(xpath="//*[@id='rightNav-signIn']")
	WebElement signin_menu;
	@FindBy(xpath="//*[@id='logonIdSide']")
	WebElement emailidtext_menu;
	@FindBy(xpath="//*[@id='logonPasswordSider']")
	WebElement passwordtext_menu;
	@FindBy(xpath="//*[@id='signin-btn']")
	WebElement sigin_button;

	@FindBy(xpath="//*[@id='js-toggleRightNavLg']/span")
	WebElement loginname_text;
	
	
	public HomePage ()
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
}*/

	@FindBy(xpath="//a[contains(.,'Hello. Sign In')]")
	WebElement hellosignin_link;
	@FindBy(xpath="//input[@data-tl-id='signin-email-input']")
	
	WebElement email_text;
	@FindBy(xpath="//input[@type='password']")
	WebElement password_text;
	@FindBy(xpath="//button[@data-tl-id='signin-submit-btn']")
	WebElement signin_button;
	@FindBy(xpath="//*[@id='top']/div[3]/div/div/div/div/div[4]/div/div[1]/div[1]/p/span[1]")
	WebElement hellodurai;
	
	public HomePage ()
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonlogin() throws InterruptedException{
		hellosignin_link.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(signin_button));
		email_text.sendKeys("durai.me72@gmail.com");
		password_text.sendKeys("dhakshan25");
		signin_button.click();
		if(Utility.isEqual("Hello, Durai", hellodurai.getText())){
			
			Reports.log(LogStatus.PASS, "login is pass");
			
		}
		else
			Reports.log(LogStatus.FAIL, " login is not sucess");
	}
	
}