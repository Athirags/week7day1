package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.projectspecificmethod;

public class findAccounts extends projectspecificmethod{
	public findAccounts() {}
	public  findAccounts EnterID(String ID) {
		driver.findElement(By.xpath("//input[@name= 'id']")).sendKeys(ID);
		return this;
	}
	public  findAccounts EnterAccountname1(String AccountName) {
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys(AccountName);
		return this;
	}
	
	public  findAccounts Clicknewfindaccounts() {
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		return this;
	}	
	public  AccountDetails Clickdebitlimitedaccount() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		return new AccountDetails();
	}	
}
