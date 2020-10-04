package com.bitm.SeleniumOnlineProject2.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverManager {

	static {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Imran\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
	}
	public static WebDriver driver = new ChromeDriver();
		
	private DriverManager()
	{
		
	}
}
