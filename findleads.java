package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.projectspecificmethod;

public class findleads extends projectspecificmethod{
	
	public findleads clickPhoneButton() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	    return this;
	}
	public findleads enterphonenumber(String phoneNumber) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
	    return this;
	}
	public findleads clicknewfindleads() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    return this;
	}
	
	public findleads getleadId() throws InterruptedException {
		Thread.sleep(5000);
		String leadid = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println(leadid);
	    return this;
	}
	public NewviewLead clickleadId() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
	    return new NewviewLead();
	}
	public findleads enterLeadID(String id) {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(id);
		return this;
	}
public findleads verifydisplay1() throws InterruptedException {
		
	String text = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
	if (text.equals("No records to display")) {
		System.out.println("Text matched");
	} else {
		System.out.println("Text not matched");
	}
	    return this;
	}
}