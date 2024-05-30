package com.CRM.TestCases;

import org.testng.annotations.Test;

import com.CRM.Pages.HomePage;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class HomePageTest {
	WebDriver driver;
	HomePage o1 ;
  @Test
  public void login() throws InterruptedException {
	  o1.enterUserNameTextBox("GaneshDon");
	  o1.enterPassWordTextBox("pass@123");
	  o1.clickOnLoginBtn();
	  Thread.sleep(3000);
	  System.out.println(driver.getTitle());
  }
  @BeforeTest
  public void beforeTest() {
	  	driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://adactinhotelapp.com/");
		o1 = new HomePage(driver);
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
	}	
}


