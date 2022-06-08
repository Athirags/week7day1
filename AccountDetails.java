package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.projectspecificmethod;

public class AccountDetails extends projectspecificmethod{
	public AccountDetails() {}
	public  EditAccount Clickeditbutton() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditAccount();
	}	
	
}
