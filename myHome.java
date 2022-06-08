package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.projectspecificmethod;

public class myHome extends projectspecificmethod{
	public myHome() {}
public myLeads clickleads() {
	driver.findElement(By.linkText("Leads")).click();
	return new myLeads();
}
public MyTeamsAccounts clickAccounts()  {

	driver.findElement(By.linkText("Accounts")).click();
     return new MyTeamsAccounts();
}



}
