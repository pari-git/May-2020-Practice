package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		
		
		System.out.println(text);
		
		if(text.equals("Please enter a valid user name")){
			System.out.println("correct alert message");
		}
		else{
			System.out.println("incorrect alert message");
		}
		
		//alert.accept();
		alert.dismiss();
		
		driver.switchTo().defaultContent();
	}

}
