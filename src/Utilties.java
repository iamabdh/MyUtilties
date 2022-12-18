import java.awt.im.InputMethodHighlight;
import java.lang.reflect.Array;
import java.security.Identity;
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
		int[] arr = new int[] {1, 12, 8, 400,  10, 1001, 6, 87, 300};
		int[] output = findLargestNumberArray(arr);
		System.out.println("max: "+ output[0]);
		System.out.println("second: "+ output[1]);
		System.out.println("third: "+ output[2]);
	}
	
	public static int[] findLargestNumberArray(int[] arr) {
		int max = arr[0];
		int secondMax =  arr[0];
		int thirdMax = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < max && secondMax < arr[i]) {
				secondMax = arr[i];
			}
		}
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < max && arr[i] < secondMax && thirdMax < arr[i]) {
				thirdMax = arr[i];
			}
		}
		
		return new int[] {max, secondMax, thirdMax};
	}

}