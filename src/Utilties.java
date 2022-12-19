import java.awt.im.InputMethodHighlight;
import java.lang.reflect.Array;
import java.security.Identity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.PrimitiveIterator.OfDouble;

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
		int[] arr = new int[] {2, 4, 6, 8, 1,  19};
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
			if (max > arr[i]) {
				if (secondMax > arr[i] && secondMax != max) {
					if (thirdMax > arr[i] && thirdMax != max) {
						continue;
					} else {
						// assign
						thirdMax = arr[i];
					}
				} else {
					// swap
					thirdMax = secondMax;
					secondMax = arr[i];
				}		
			} else {
				// swap
				secondMax = max;
				max = arr[i];
			}
		}
	
		
		return new int[] {max, secondMax, thirdMax};
	}

}