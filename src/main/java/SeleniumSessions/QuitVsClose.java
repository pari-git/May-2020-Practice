package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tsree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		String actualTitle = driver.getTitle();
		System.out.println(driver.getTitle());
		
		//driver.quit();
		
		driver.close();
		driver = new ChromeDriver();
		driver.get("http:\\www.google.com");
		driver.getTitle();
		
		
		System.out.println(driver.getTitle());
	}

}
