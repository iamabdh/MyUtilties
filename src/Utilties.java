import java.awt.im.InputMethodHighlight;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-4
 *
 */
public class Utilties {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("output: "+ findLargestNumberArray(new int[] {50, 12, 8, 10, 1001, 6, 87}));
	}
	
	public static int findLargestNumberArray(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}