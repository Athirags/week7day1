package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.projectspecificmethod;
import com.leaftaps.ui.pages.loginPage;

public class CreateAccount_Positive extends projectspecificmethod{
	@BeforeTest
	public void setFileName() {
		fileName="tc005";

	}
	@Test(dataProvider="testData")
	public void tc005(String UserName,String Password,String accountName,String groupNameLocal ,String officeSiteName,String annualRevenue) 
	{
		new loginPage().enterusername(UserName).enterpassword(Password).clickloginbutton().clickCRMSFA().clickAccounts().ClickCreateAccounts().enteraccountname(accountName)
		.enterLocalName(groupNameLocal).enterofficeSiteName(officeSiteName).enterAnnualRevenue(annualRevenue).clicknewCreateAccount();
		
	}
}
