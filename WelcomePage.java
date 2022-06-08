package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.projectspecificmethod;

public class WelcomePage extends projectspecificmethod{
	public WelcomePage() {}
	public myHome clickCRMSFA () {
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		return new myHome();
}
}