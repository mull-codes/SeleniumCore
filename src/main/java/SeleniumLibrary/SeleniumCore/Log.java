package SeleniumLibrary.SeleniumCore;

public class Log {
	
	public static void LogScriptInfo(String info) {
		println("*********************************************************************");
		println(info);
		println("*********************************************************************");
	}
	
	public static boolean altVerify(String expected, String actual) {
		if(expected.equals(actual)) {
			println("Expected\t-\t" + expected + "\tand\t-\tActual\t" + actual + "\t-\t both true");
			return true;
		}else {
			println("Expected\t-\t" + expected + "\tdid not match\t-\tActual\t" + actual);
			return false;
		}
	}
	
	public static boolean altVerify(int expected, int actual) {
		if(expected == actual) {
			println("Expected\t-\t" + expected + "\tand\t-\tActual\t" + actual + "\t-\t both true");
			return true;
		}else {
			println("Expected\t-\t" + expected + "\tdid not match\t-\tActual\t" + actual);
			return false;
		}
	}
	
	public static boolean altVerify(long expected, long actual) {
		if(expected == actual) {
			println("Expected\t-\t" + expected + "\tand\t-\tActual\t" + actual + "\t-\t both true");
			return true;
		}else {
			println("Expected\t-\t" + expected + "\tdid not match\t-\tActual\t" + actual);
			return false;
		}
	}
	
	private static void errorMessage(String message) {
		println("ERROR\t-\t" + message);
	}
	
	
	public static void print(String s) {
		System.out.print(s);
	}
	
	public static void println(String s) {
		System.out.print(s);
	}
}
