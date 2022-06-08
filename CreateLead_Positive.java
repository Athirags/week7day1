package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.projectspecificmethod;
import com.leaftaps.ui.pages.WelcomePage;
import com.leaftaps.ui.pages.loginPage;

public class CreateLead_Positive extends projectspecificmethod{
	@BeforeTest
	public void setFileName() {
		fileName="tc001";

	}
	
	@Test(dataProvider="testData")
	public void tc001(String UserName,String Password,String Cname,String FName ,String LName) 
	{

new loginPage().enterusername(UserName)
.enterpassword(Password)
.clickloginbutton()
.clickCRMSFA().clickleads().clickcreatelead()
.entercompanyname(Cname)
.enterfirstname(FName)
.enterlastname(LName)
.clickleadbutton().verifyviewlead();



}
}