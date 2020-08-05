package SeleniumSessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagNameConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//find out total # of links on the page
		//print the text of each link on the console
		
		driver.get("https://www.amazon.in/");
		List<WebElement> linkslist = driver.findElements(By.tagName("a") );
		System.out.println("total links: " + linkslist.size());
		
		for (int i = 0; i<linkslist.size(); i++){
			String text = linkslist.get(i).getText();
			if(!text.isEmpty())
			
			System.out.println(text);
			
		}
		
		
	}

}
