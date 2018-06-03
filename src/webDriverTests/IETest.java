package webDriverTests;

import java.io.File;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverLogLevel;
import org.openqa.selenium.ie.InternetExplorerDriverService;

public class IETest {

	public static void main(String[] args) {
		String exePath = "C:\\Users\\abc\\Documents\\IEDriverServer\\IEDriverServer.exe";
		InternetExplorerDriverService.Builder serviceBuilder = new InternetExplorerDriverService.Builder();
		serviceBuilder.usingAnyFreePort(); // This specifies that sever can pick any available free port to start
		serviceBuilder.usingDriverExecutable(new File(exePath)); //Tell it where you server exe is
		serviceBuilder.withLogLevel(InternetExplorerDriverLogLevel.TRACE); //Specifies the log level of the server
		serviceBuilder.withLogFile(new File("C:\\Users\\abc\\Documents\\logFile.txt")); //Specify the log file. Change it based on your system
		InternetExplorerDriverService service = serviceBuilder.build(); //Create a driver service and pass it to Internet explorer driver instance
		InternetExplorerDriver driver = new InternetExplorerDriver(service);
		driver.get("http://toolsqa.wpengine.com");

	}

}

/*Locate the IE webdriver using cmd and type the name of the webdriver .exe follow by
 - help for commands and port addresses etc*/
