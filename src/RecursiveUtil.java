import java.io.ObjectInputFilter;
import java.nio.file.attribute.FileAttributeView;
import java.util.ArrayList;

import javax.naming.ldap.StartTlsRequest;
import javax.naming.spi.InitialContextFactoryBuilder;

class RecursiveUtil {
	public static int Pow(int b, int e) {
		if (e == 1) {
			return 1;
		}
		return b * (e - 1);
	}
	
	public static int factorial(int a) {
		if (a == 0) {
			return 1;
		}
		System.out.println(a);
		return a * factorial(a - 1);
	}
	
	public static String reverseString(String str, int index, String newStr) {
		if (index == 0) {
			return "";
		}
		// newStr +=Character.toString(str.charAt(index - 1));
		//System.out.println(str.charAt(index - 1));
		return str.charAt(index - 1) + reverseString(str, index -1, newStr);
	}
	
	public static String incrDecr(int num, int start) {
		if (start == num+1) {
			return "";
		}
		return start + incrDecr(num, start+1) + start;
	}
	
	public static boolean isPlaindorm(String str, int index) {
		if ((int)Math.floor(str.length()/2) == index) {
			return true;
		}
		return isPlaindorm(str, index + 1) && str.charAt(index) == str.charAt(str.length() - 1 - index);
	}
	
	public static int fab(int num) {
		int x = 0;
		if (num <= 1) {
			x = num;
		}
		else {
			x = fab(num - 1) + fab(num - 2);
		}
		System.out.print(x + " ");
		return x;
	}
	
	public static String fibPrint(int num, String xString) {
		if (num <= 0) {
			return "";
		}
		xString = fab(num - 1) + " ";
		return fibPrint(num - 1, xString) + xString;
	}
}