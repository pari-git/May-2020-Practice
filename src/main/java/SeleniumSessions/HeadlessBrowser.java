package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {
		
		String expectedtitle = "https://www.amazon.com/";
		
		
//		WebDriverManager.chromedriver().setup();
//		
//		ChromeOptions co = new ChromeOptions();
//		
//		co.addArguments("--headless");
//		
//		WebDriver driver = new ChromeDriver(co);
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxOptions fo = new FirefoxOptions();
		
		fo.addArguments("--headless");
				
		WebDriver driver = new FirefoxDriver(fo);
		
		driver.get("https://www.amazon.com/");
		
		String actualTitle = driver.getTitle();
		
		System.out.println("actualTitle is: " + actualTitle);
		
		if(actualTitle.equals(expectedtitle)){
			
			System.out.println("currect title");
		}
		
		else{
			
			System.out.println("incorrect title");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);

		if(url.contains("amazon")){
			System.out.println("correct url");
		}
	}

}
