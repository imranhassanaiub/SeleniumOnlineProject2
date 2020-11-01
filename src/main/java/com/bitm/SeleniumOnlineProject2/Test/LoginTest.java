package com.bitm.SeleniumOnlineProject2.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bitm.SeleniumOnlineProject2.DTO.LoginDTO;
import com.bitm.SeleniumOnlineProject2.DataProvider.LoginDataProvider;
import com.bitm.SeleniumOnlineProject2.Utils.DriverManager;
import com.bitm.SeleniumOnlineProject2.Utils.TestNGReporting;
import com.bitm.SeleniumOnlineProject2.Utils.UrlTextUtils;
import com.bitm.SeleniumOnlineProject2.Utils.XpathUtils;

@Listeners(TestNGReporting.class)
public class LoginTest {

	private WebDriver driver = null;

	@Test
	public void CheckLoginPageTitle() {
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.URL.Base_URL);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.HomePageTitle);

	}

	@Test(dependsOnMethods = "CheckLoginPageTitle", dataProvider = "loginData", dataProviderClass = LoginDataProvider.class)
	public void Logintest(List<LoginDTO> logdata) {
		for (LoginDTO login : logdata) {
			driver.findElement(By.xpath(XpathUtils.LoginModule.Username)).sendKeys(login.getUsername());
			driver.findElement(By.xpath(XpathUtils.LoginModule.Password)).sendKeys(login.getPassword());
			driver.findElement(By.xpath(XpathUtils.LoginModule.LoginBTN)).click();

		}

	}
}
