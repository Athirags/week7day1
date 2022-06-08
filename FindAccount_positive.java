package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.projectspecificmethod;
import com.leaftaps.ui.pages.loginPage;

public class FindAccount_positive extends projectspecificmethod {
	@BeforeTest
	public void setFileName() {
		fileName="tc006";

	}
	@Test(dataProvider="testData")
	public void tc006(String UserName,String Password,String ID,String AccountName ) throws InterruptedException
	{ 
		new loginPage().enterusername(UserName).enterpassword(Password)
	.clickloginbutton().clickCRMSFA().clickAccounts().ClickFindaccounts().EnterID(ID).EnterAccountname1(AccountName).Clicknewfindaccounts().Clickdebitlimitedaccount()
	.Clickeditbutton().verifyaccountnamepage().verifyDescription();
}
}
