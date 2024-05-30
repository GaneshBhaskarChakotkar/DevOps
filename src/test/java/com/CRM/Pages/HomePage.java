package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
		
		WebDriver POMdriver;
		public HomePage (WebDriver d){
			 this.POMdriver = d; 
		 }

		public void enterUserNameTextBox(String un) {
			POMdriver.findElement(By.id("username")).sendKeys(un);	
		}
		
		public void enterPassWordTextBox(String ps) {
			POMdriver.findElement(By.id("password")).sendKeys(ps);
		}
		
		public void clickOnLoginBtn() {
			POMdriver.findElement(By.id("login")).click();	
			}
		
	}



