package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.projectspecificmethod;

public class ViewLead extends projectspecificmethod {
	public ViewLead() {}
public ViewLead verifyviewlead() {
	boolean displayed = driver.findElement(By.id("sectionHeaderTitle_leads")).isDisplayed();
	if(displayed) {
		System.out.println("View Lead HomePage Displayed");
	}
	else
	{
		System.out.println(" View Lead Home page is not displayed");
	}

return this;
}
}