package com.bitm.SeleniumOnlineProject2.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.SeleniumOnlineProject2.Utils.DriverManager;
import com.bitm.SeleniumOnlineProject2.Utils.UrlTextUtils;
import com.bitm.SeleniumOnlineProject2.Utils.XpathUtils;

public class LoginTest {

	private WebDriver driver=null;
		
	@Test
	public void CheckLoginPageTitle()
	{
		driver=DriverManager.driver;		
		driver.get(UrlTextUtils.URL.Base_URL);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.HomePageTitle);
		System.out.println("Login Page Title Verified!");
	}
	
	@Test(dependsOnMethods = "CheckLoginPageTitle")
	public void Logintest()
	{
		driver.findElement(By.xpath(XpathUtils.LoginModule.Username)).sendKeys("Admin");
		driver.findElement(By.xpath(XpathUtils.LoginModule.Password)).sendKeys("admin123");
		driver.findElement(By.xpath(XpathUtils.LoginModule.LoginBTN)).click();
		System.out.println("Successfully Logged IN!!");
	}
}
