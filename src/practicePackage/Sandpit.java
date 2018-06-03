package practicePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sandpit {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.uk/");
		String pageTitle = driver.getTitle();
		
		System.out.println(pageTitle);
		
		driver.quit();

	}

}
