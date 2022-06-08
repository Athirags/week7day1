package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.projectspecificmethod;

public class MyTeamsAccounts extends projectspecificmethod{
	public MyTeamsAccounts() {}
	public  findAccounts ClickFindaccounts() {
		driver.findElement(By.linkText("Find Accounts")).click();
		return new findAccounts();
		}

	public  CreateAccount ClickCreateAccounts() {
		 driver.findElement(By.linkText("Create Account")).click();
		return new CreateAccount();
		}
}
