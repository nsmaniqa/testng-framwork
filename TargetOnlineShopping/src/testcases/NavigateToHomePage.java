package testcases;

import org.testng.annotations.Test;

import common_method.BaseTestConfiguration;

public class NavigateToHomePage extends BaseTestConfiguration{
	@Test
	public void loginVerification() throws InterruptedException{
		Reports.startTest("loginverification");
		oHomePage.clickonlogin();
		Reports.endTest();
		
	}
	

}
