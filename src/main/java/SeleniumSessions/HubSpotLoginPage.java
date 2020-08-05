package SeleniumSessions;

public class HubSpotLoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverfactory wf = new WebDriverfactory();
		
		String browser = "chrome";
		
		String url = "https://app.hubspot.com/login";
				
		wf.launchBrowser(browser);
		
		wf.LaunchUrl(url);
		
		Thread.sleep(5000);
		
		String Title = wf.getPageTitle();
		System.out.println("Page title is: " + Title);
		
		if(Title.equals("HubSpot Login")){
			System.out.println("Correct title");
		}
		
		else{
			System.out.println("Incorrect title");
		}
		
		wf.closeBrowser();
		
		
	}

}
