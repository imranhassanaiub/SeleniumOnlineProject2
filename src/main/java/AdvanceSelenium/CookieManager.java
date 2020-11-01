package AdvanceSelenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieManager {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Imran\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//Capturing all cookies from Browser/Webapp
		Set<Cookie> cookies=driver.manage().getCookies();
		
		//Getting total size of cookies
		System.out.println("Size Of Cookies for this webapp : "+cookies.size());
		
		// Getting information of each cookie
		
		for(Cookie cookie: cookies)
		{
			System.out.println(cookie.getName()+ " :- " + cookie.getValue());
		}
		System.out.println("--------------------------------------------------------");
		//Getting specifiq cookie information 
		System.out.println(driver.manage().getCookieNamed("session-id"));
		System.out.println("--------------------------------------------------------");
		
		//Adding new cookie
		Cookie newcookie= new Cookie("testcookie", "Test123456");
		driver.manage().addCookie(newcookie);
		System.out.println(newcookie);	
		cookies=driver.manage().getCookies();
		System.out.println("Size Of Cookies for this webapp : "+cookies.size());
		System.out.println("--------------------------------------------------------");
		
        //Deleting cookie
		driver.manage().deleteCookie(newcookie);
		cookies=driver.manage().getCookies();
		System.out.println("Size Of Cookies for this webapp : "+cookies.size());
		System.out.println("--------------------------------------------------------");
		//Deleting all cookies
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println("Size Of Cookies for this webapp : "+cookies.size());
		
	}

}
