package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		//Create a web element and perform an action on it
		//WE + click
		//WE + sendKeys
		//WE + getText
//		driver.findElement(By.id("username")).sendKeys("shreya999@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Sreeja2004");
//		driver.findElement(By.id("loginBtn")).click();
//		WebElement email = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
	
//		email.sendKeys("shreya999@gmail.com");
//		password.sendKeys("password");
//		loginBtn.click();
//		
		By email =  By.id("username");
		
		By password = By.id("password");
		
		By loginBtn = By.id("loginBtn");
		
//		driver.findElement(email).sendKeys("shreya999@gmail.com");
//		driver.findElement(password).sendKeys("Sreeja2004");
//		driver.findElement(loginBtn).click();
//		getElement(email).sendKeys("shreya999@gmail.com");
//		getElement(password).sendKeys("Sreeja2004");
//		getElement(loginBtn).click();
		
		//driver.findElement(By.name("username")).sendKeys("shreya999@gmail.com");
		
//		driver.findElement(By.className("login-email")).sendKeys("shreya999@gmail.com");;
//		driver.findElement(By.className("login-password")).sendKeys("Sreeja2004");
//		
//		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("shreya999@gmail.com");
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Sreeja2004");
//		
//		driver.findElement(By.cssSelector("#username")).sendKeys("shreya999@gmail.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("Sreeja2004");
		
		driver.findElement(By.linkText("Sign up")).click();
	}

	public static WebElement getElement(By locator){
		WebElement element = driver.findElement(locator);
		return element;
			}
	
	public static void doSendKeys(By locator, String value){
		getElement(locator).sendKeys(value);
		
	}
	
	public static void doClick(By locator){
		getElement(locator).click();
	}
	
	
}
