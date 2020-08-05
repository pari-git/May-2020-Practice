package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	static String expectedTitle = "Amazon.com: online shopping" ;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tsree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.Amazon.com");
		
		String actualTitle = driver.getTitle();
		System.out.println("Page title is : " + driver.getTitle());
		
		
		
		if(actualTitle.equals("expectedTitle")){
			System.out.println("correct title");
		}
			else{
				System.out.println("incorrect title");
			}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("Books")){
			System.out.println("correct url");
		}
		Thread.sleep(3000);
		driver.quit();
		
		//System.out.println(driver.getPageSource());
		}
		
	}


