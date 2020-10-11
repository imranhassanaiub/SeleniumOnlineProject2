package AdvanceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateTimePickerTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Imran\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList/reset/1");

		// Date Time Picker

		driver.findElement(By.xpath("//*[@id=\"calFromDate\"]")).click();
		// Select Month
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).click();
		Select Month = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")));
		Month.selectByVisibleText("Aug");
		// Select Year
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")).click();
		Select year = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")));
		year.selectByVisibleText("2070");

        // Select Date	
		WebElement dateWidget = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));

		for (WebElement cell : columns) {
			// Select 13th Date
			if (cell.getText().equals("25")) {
				cell.findElement(By.linkText("25")).click();
				break;
			}

		}

	}
}