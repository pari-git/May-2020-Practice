package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelectConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country = By.id("Form_submitForm_Country");
		
		By noofemployees = By.id("Form_submitForm_NoOfEmployees");
		
		By industry = By.id("Form_submitForm_Industry");
		
		//WebElement countryEle = driver.findElement(country);
			
		selectvaluesfromdropdown(country);
		
		selectvaluesfromdropdown(noofemployees);
		
		selectvaluesfromdropdown(industry);
		
	}
	
	


		public static void selectvaluesfromdropdown(By locator){
			
			Select select = new Select(getelement(locator));
			
			List<WebElement> droplist =  select.getOptions();
			
			System.out.println(droplist.size());
			
			for(int i = 0; i < droplist.size(); i++){
				
					String countryname = droplist.get(i).getText();
					
					System.out.println(countryname);
			}
		}
			
		
		public static WebElement getelement(By locator){
			WebElement element = driver.findElement(locator);
			return element;
			
		}
	
	
	
	
	
}
