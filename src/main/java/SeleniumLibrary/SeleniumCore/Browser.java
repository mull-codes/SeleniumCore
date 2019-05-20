package SeleniumLibrary.SeleniumCore;

import org.openqa.selenium.WebDriver;

public class Browser {
	
	//Static driver
	public static WebDriver driverStatic;
	
	public static void start() {
		
	}
	
	public static boolean textExists(String text) {
		return false;
	}
	
	public static String getTitle() {
		return Core.driver.getTitle();
	}
	
	public static void close() {
		driverStatic.close();
		driverStatic.quit();
	}
	
}
