package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.projectspecificmethod;

public class CreateAccount extends projectspecificmethod{
	public CreateAccount() {}
public CreateAccount enteraccountname(String accountName) {
	driver.findElement(By.id("accountName")).sendKeys(accountName);
	return this;
}
public CreateAccount enterLocalName(String groupNameLocal) {
	 driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys(groupNameLocal);
	return this;
}
public CreateAccount enterofficeSiteName(String officeSiteName) {
	 driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys(officeSiteName);
	return this;
}
public CreateAccount enterAnnualRevenue(String annualRevenue) {
	   driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys(annualRevenue);
	return this;
}
public CreateAccount clicknewCreateAccount() {
	driver.findElement(By.className("smallSubmit")).click();
	return this;
}
}
