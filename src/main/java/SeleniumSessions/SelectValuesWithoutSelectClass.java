package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectValuesWithoutSelectClass {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		//driver.get("https://www.facebook.com");
		 driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		String dob = "18-Nov-2011";
		
		By day = By.id("day");
		
		By month = By.id("month");
		
		By year = By.id("year");
		
		By daysOptions = By.xpath("//select[@id = 'day']/option");
		
		By monthOptions = By.xpath("//select[@id = 'month']/option");
		
		By yearOptions = By.xpath("//select[@id = 'year']/option");
		
		By countryOption = By.xpath("//select[@id ='Form_submitForm_Country']/option");
		
		//String dob = "18-Nov-2011";
		
//		selectValuesFromDropdown(driver, daysOptions, dob.split("-")[0]);
//		
//		selectValuesFromDropdown(driver, monthOptions, dob.split("-")[1]);
//		
//		selectValuesFromDropdown(driver, yearOptions, dob.split("-")[2]);
		
		selectValuesFromDropdown(driver, countryOption, "India");
//		
		
	}
	
public static void selectValuesFromDropdown(WebDriver driver, By locator,String value){
	
	List<WebElement> daysList = driver.findElements(locator);
	
	//System.out.println(daysList.size());
	
	for(int i = 0; i<daysList.size(); i++){
		
		String text = daysList.get(i).getText();
		
		//System.out.println(text);
		
		if(text.equals(value)){
			
			daysList.get(i).click();
			
			break;
		}
	}
	}
}