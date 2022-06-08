package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.projectspecificmethod;

public class myLeads extends projectspecificmethod {
	public myLeads() {}
public createLeads clickcreatelead() {
	driver.findElement(By.linkText("Create Lead")).click();
	return new createLeads();
}

public findleads clickFindLeads() throws InterruptedException {

	driver.findElement(By.linkText("Find Leads")).click();
return new findleads();
}
 
 
}
