package practicePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeExercise02 {

	public static void main(String[] args) {
		//01. Launch a new Firefox browser
		WebDriver driver = new FirefoxDriver();
		
		//02. Open http://demoqa.com/frames-and-windows/
		driver.get("http://demoqa.com/frames-and-windows/");
		
		//03. Use this statement to click on a New Window button 
		driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		
		//04. close browser
		driver.close();
		
		//note: only one tab will close.  driver.quit will close all

	}

}
