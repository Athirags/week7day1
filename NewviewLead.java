package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.projectspecificmethod;

public class NewviewLead extends projectspecificmethod{
	public NewviewLead() {}
	public EditLead clickEdit() {
		driver.findElement(By.linkText("Edit")).click();
	    return new EditLead();
	}
	public myLeads deletelead() {
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Delete']")).click();
		return new myLeads();
	}
}