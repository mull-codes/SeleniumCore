package SeleniumLibrary.SeleniumCore;

import org.openqa.selenium.WebDriver;

public class Browser {
	
	//Static driver
	public static WebDriver driverStatic;
	
	public static void start() {
		
	}
	
	public static boolean textExists(String text) {
		boolean txtFound = false;
		try {
			txtFound = driverStatic.getPageSource().contains(text);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return txtFound;
	}
	
	public static String getTitle() {
		String title = "";
		try {
			title = driverStatic.getTitle();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return title;
	}
	
	public static void close() {
		try {
			driverStatic.close();
			driverStatic.quit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
