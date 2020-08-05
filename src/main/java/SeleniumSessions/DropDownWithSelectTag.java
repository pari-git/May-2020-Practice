package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithSelectTag {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		By day = By.id("day");
		
		By month = By.id("month");
		
		By year = By.id("year");
		
		doSelectValuesByVisibleText(day, "5");
		
		doSelectValuesByVisibleText (month, "Apr");
		
		doSelectValuesByVisibleText(year, "1974");
		
		doSelectValuesByIndex(day, 5);
		
		doSelectValuesByIndex(month, 1);
		
		doSelectValuesByIndex(year, 20);
		
//		WebElement day = driver.findElement(By.id("day"));
//		
//		Select select = new Select(day);
//		
//		select.selectByIndex(5);
//		select.selectByVisibleText("10");	
//		select.selectByValue("31");
//		
//		WebElement month = driver.findElement(By.id("month"));
//		Select select1 = new Select(month);
//		select1.selectByVisibleText("Nov");
//		select1.selectByIndex(5);
		
		
		
	}
	
	public static void doSelectValuesByVisibleText(By locator, String value){
		getElement(locator);
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	
	public static void doSelectValuesByIndex(By locator, int index){
		getElement(locator);
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectValuesByValue(By locator, String value){
		getElement(locator);
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	public static WebElement  getElement(By locator){
		WebElement element = driver.findElement(locator);
		return element;
	}
		
}
