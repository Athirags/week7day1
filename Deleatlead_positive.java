package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.projectspecificmethod;
import com.leaftaps.ui.pages.loginPage;

public class Deleatlead_positive extends projectspecificmethod {
	@BeforeTest
	public void setFileName() {
		fileName="tc002";

	}
	@Test(dataProvider="testData")
	public void tc002(String UserName,String Password,String phonrNumber,String id) throws InterruptedException {
	new loginPage().enterusername(UserName).enterpassword(Password)
	.clickloginbutton().clickCRMSFA().clickleads().clickFindLeads().clickPhoneButton().enterphonenumber(phonrNumber)
	.clicknewfindleads().getleadId().clickleadId().deletelead().clickFindLeads().enterLeadID(id).clicknewfindleads()
	.verifydisplay1();
	
	}
}