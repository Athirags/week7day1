package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.projectspecificmethod;
import com.leaftaps.ui.pages.loginPage;

public class Edilead_positive extends projectspecificmethod  {
	@BeforeTest
	public void setFileName() {
		fileName="tc004";

	}
	
	@Test(dataProvider="testData")
	public void tc004(String UserName,String Password,String phonrNumber,String updateLeadFormcompanyName ) throws InterruptedException
	{ 

new loginPage().enterusername(UserName)
.enterpassword(Password)
.clickloginbutton()
.clickCRMSFA().clickleads()
.clickFindLeads().clickPhoneButton()
.enterphonenumber(phonrNumber)
.clicknewfindleads().clickleadId()
.clickEdit()
.newcompanyname(updateLeadFormcompanyName )
.clickupdate();
	}
}
