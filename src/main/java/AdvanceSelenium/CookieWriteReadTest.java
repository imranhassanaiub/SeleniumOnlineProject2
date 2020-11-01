package AdvanceSelenium;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieWriteReadTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Imran\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		File filecreate = new File("Cookies.txt");
		// Cookie Write
		try {
			filecreate.delete();
			filecreate.createNewFile();

			FileWriter fileWrite = new FileWriter(filecreate);
			BufferedWriter bufferwrite = new BufferedWriter(fileWrite);
			// Get current cookies
			for (Cookie cookies : driver.manage().getCookies()) {
				bufferwrite.write(cookies.getName() + ";" + cookies.getValue() + ";" + cookies.getDomain() + ";"
						+ cookies.getPath() + ";" + cookies.getExpiry() + ";" + cookies.isSecure());
				bufferwrite.newLine();
			}
			bufferwrite.close();
			fileWrite.close();
			System.out.println("Cookie Write Operation Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
       // Read Saved cookies
		try {
			File fileRead = new File("Cookies.txt");
			FileReader filereader= new FileReader(fileRead);
			BufferedReader bufferRead = new BufferedReader(filereader);
			
			String strline;
			while((strline=bufferRead.readLine()) !=null)
			{
				StringTokenizer tokens = new StringTokenizer(strline, ";");
				
				while(tokens.hasMoreTokens())
				{
					String name= tokens.nextToken();
					String value= tokens.nextToken();
					String domain= tokens.nextToken();
					String path= tokens.nextToken();
					Date expiry= null;
					
					String val;
					if(!(val=tokens.nextToken()).equals("null"))
					{
						String desireddate= "Sun Nov 05 23:59:59 IST 2022";
						DateFormat df= new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
						expiry=df.parse(desireddate);
					}
					
					Boolean isSecure= new Boolean(tokens.nextToken()).booleanValue();
					
					Cookie newcookie= new Cookie(name, value, domain, path, expiry, isSecure);
					System.out.println(newcookie);
					driver.manage().addCookie(newcookie); // This will add the stored cookie to your current session
					System.out.println("Cookie Read operation is done");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();

		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

}
