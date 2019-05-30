package SeleniumLibrary.SeleniumCore;
import static org.junit.Assert.*;

public class Log {
	
	public static void LogScriptInfo(String info) {
		println("*********************************************************************");
		println(info);
		println("*********************************************************************");
	}
	
	public static boolean altVerify(String expected, String actual) {
		/*boolean result = false;
		try {
			if(expected.equals(actual)) {
				println("Expected\t-\t" + expected + "\tand\t-\tActual\t" + actual + "\t-\t both true");
				result =  true;
			}else{
				println("Expected\t-\t" + expected + "\tdid not match\t-\tActual\t" + actual);
				result = false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
		*/
		assertEquals(expected, actual);
		return true;
	}
	
	public static boolean altVerify(int expected, int actual) {
		boolean isTrue = false;
		try {
			if(expected == actual) {
				println("Expected\t-\t" + expected + "\tand\t-\tActual\t" + actual + "\t-\t both true");
				isTrue = true;
			}else{
				println("Expected\t-\t" + expected + "\tdid not match\t-\tActual\t" + actual);
				isTrue = false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isTrue;
	}
	
	public static boolean altVerify(long expected, long actual) {
		boolean isTrue = false;
		try {
			if(expected == actual) {
				println("Expected\t-\t" + expected + "\tand\t-\tActual\t" + actual + "\t-\t both true");
				isTrue = true;
			}else{
				println("Expected\t-\t" + expected + "\tdid not match\t-\tActual\t" + actual);
				isTrue = false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isTrue;
	}
	
	private static void errorMessage(String message) {
		println("ERROR\t-\t" + message);
	}
	
	
	public static void print(String s) {
		System.out.print(s);
	}
	
	public static void println(String s) {
		System.out.println(s);
	}
}
