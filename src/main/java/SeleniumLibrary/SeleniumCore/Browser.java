package SeleniumLibrary.SeleniumCore;

//import Core Library
import SeleniumLibrary.SeleniumCore.Core;

public class Browser {
	
	public void start() {
		
	}
	
	public boolean textExists(String text) {
		return false;
	}
	
	public void close() {
		Core.driver.close();
		Core.driver.quit();
	}
	
}
