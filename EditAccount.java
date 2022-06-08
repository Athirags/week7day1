package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.projectspecificmethod;

public class EditAccount extends projectspecificmethod{
	public EditAccount() {}
	public  EditAccount verifyaccountnamepage() {
		String text = driver.findElement(By.xpath("//input[@id='accountName']")).getAttribute("value");
		System.out.println(text);
		return this;
	
	}	
	public  EditAccount verifyDescription() {
		String text1 = driver.findElement(By.xpath("//textarea[@name='description']")).getText();

		System.out.println(text1);
		return this;
		}
	
}
