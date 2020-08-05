package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tsree\\Downloads\\geckodriver-v0.26.0-win64.zip.exe");
		WebDriver driver = new FirefoxDriver();
	}

}
