package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author tsree
 *
 */
public class WebDriverfactory {

	public WebDriver driver;
	
	/**
	 * This method is used to launch the browser on the basis of given browser name
	 * @param browser
	 * @return browser
	 */
	
	public WebDriver launchBrowser(String browser){
		
		System.out.println("Browser value is: " + browser);
		
		if(browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
			
		else if(browser.equalsIgnoreCase("FireFox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("SafariDriver")){
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
		}
		
		else{
			System.out.println("Please pass the correct browser: " + browser);
		}
		
		return driver;
	}
	/**
	 * This is to launch the url
	 * @param url
	 */
	
	public void LaunchUrl(String url){
		
		System.out.println("url launched is: " + url);
		driver.get(url);
	}
	
	/**
	 * This is used to get the page title
	 * @return PAGE TITLE
	 */
	public String getPageTitle(){
		return driver.getTitle();
	}
	
	/**
	 * This is used to get the current url
	 * @return current url
	 */
	public String getPageCurrentUrl(){
		return driver.getCurrentUrl();
	}
	
	/**
	 * This will close the browser
	 */
	public void closeBrowser(){
		driver.quit();
	}
}
