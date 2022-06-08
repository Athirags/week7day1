package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.projectspecificmethod;

public class EditLead extends projectspecificmethod{
	public EditLead() {}
	public EditLead newcompanyname(String updateLeadFormcompanyName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(updateLeadFormcompanyName);
	    return this;
	}
	

	public EditLead clickupdate() {
		driver.findElement(By.name("submitButton")).click();
	    return this;}
}
