package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		List<WebElement>linksList = driver.findElements(By.xpath("x"));
		System.out.println("total links: " + linksList.size());
		
		for(int i =0; i<linksList.size(); i++){
			
			String text = linksList.get(i).getText();
			if(!text.isEmpty())
			
			System.out.println(text);
			if(text.equals("telugu")){
				linksList.get(i).click();
				break;
			}
		}
		
		
	}

}
