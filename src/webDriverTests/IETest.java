package webDriverTests;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IETest {

	public static void main(String[] args) {
		 String service = "C:\\Eclipse\\Webdrivers\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe";
		 System.setProperty("webdriver.ie.driver", service);

		 InternetExplorerDriver  driver = new InternetExplorerDriver();
		 driver.get("http://demoqa.com");

	}

}

/*Locate the IE webdriver using cmd and type the name of the webdriver .exe follow by
 - help for commands and port addresses etc*/
