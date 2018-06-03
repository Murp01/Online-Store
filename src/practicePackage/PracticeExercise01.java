package practicePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeExercise01 {

	public static void main(String[] args) {
		
		String url = "http://store.demoqa.com/";
	
		//1. Launch a new Fire fox driver
		WebDriver driver = new FirefoxDriver();
		
		//2. Open Store.DemoQA.com
		driver.get("http://store.demoqa.com/");
		
		//3. Get Page Title name and Title length
		String pageTitle = driver.getTitle();
		int titleLength = driver.getTitle().length();
		
		//4. Print Page Title and Title length on the Eclipse Console.
		System.out.println("The title of the page is " + pageTitle);
		System.out.println("The length of the title's string is " + titleLength);
		
		//5. Get Page URL and verify if the it is a correct page opened
		String currentURL = driver.getCurrentUrl();
		
		if (currentURL.equals(url)){
			System.out.println("The URL is correct");
		}
		else {
			System.out.println("The actual url is " + currentURL);
			System.out.println("The url should be " + url);
		}
		
		//6. Storing Page Source in String variable
		String pageSource = driver.getPageSource();
		
		//Storing Page Source length in Int variable
		int pageSourceLength = driver.getPageSource().length();
		
		//7. Print Page Length on Eclipse Console.
		System.out.println("The length of the page source is " + pageSourceLength);
		
		//8. Close Browser
		driver.close();

		
		
	}
}
