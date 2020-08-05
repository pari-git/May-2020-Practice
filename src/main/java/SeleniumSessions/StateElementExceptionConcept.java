package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StateElementExceptionConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://app.hubspot.com/login");
		
		WebElement element = driver.findElement(By.id("username"));
		
		element.sendKeys("shreya999@gmail.com");
		
		driver.navigate().refresh();
		
		element.sendKeys("test@gmail.com");
		
		
	}

}
