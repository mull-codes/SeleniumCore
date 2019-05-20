package SeleniumLibrary.SeleniumCore;

import org.junit.Assert;

public class Log {
	
	public void LogScriptInfo(String info) {
		println("*********************************************************************");
		println(info);
		println("*********************************************************************");
	}
	
	public boolean altVerity(String expected, String actual) {
		if(expected.equals(actual)) {
			return true;
		}else {
			println("Expected\t-\t" + expected + "\tdid not match\t-\tActual\t" + actual);
			return false;
		}
	}
	
	public boolean altVerify(int expected, int actual) {
		if(expected == actual) {
			return true;
		}else {
			println("Expected\t-\t" + expected + "\tdid not match\t-\tActual\t" + actual);
			return false;
		}
	}
	
	public boolean altVerify(long expected, long actual) {
		if(expected == actual) {
			return true;
		}else {
			println("Expected\t-\t" + expected + "\tdid not match\t-\tActual\t" + actual);
			return false;
		}
	}
	
	private void errorMessage(String message) {
		println("ERROR\t-\t" + message);
	}
	
	
	public void print(String s) {
		System.out.print(s);
	}
	
	public void println(String s) {
		System.out.print(s);
	}
}
