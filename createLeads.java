package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.projectspecificmethod;

public class createLeads extends projectspecificmethod{
	public createLeads() {}
public createLeads entercompanyname(String Cname) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Cname);
	return this;
}
public createLeads enterfirstname(String FName) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FName);	
	return this;
}
public createLeads enterlastname(String LName) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LName);
	return this;
}
public ViewLead clickleadbutton() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLead();
}
}
