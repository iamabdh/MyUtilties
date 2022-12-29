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
		HashSetImpl hs = new HashSetImpl();
		hs.findUnionWithoutHashSet();;
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] findLargestNumberArray(int[] arr) {
		int max = -1;
		int secondMax =  -1;
		int thirdMax = -1;
		for (int i = 0; i < arr.length; i++) {
			if (max > arr[i]) {
				if (secondMax > arr[i]) {
					if (thirdMax > arr[i]) {
						continue;
					} else {
						thirdMax = arr[i];
					}
				} else {
					thirdMax = secondMax;
					secondMax = arr[i];
				}
			} else {
				thirdMax = secondMax;
				secondMax = max;
				max = arr[i];
			}
		}

		return new int[] {max, secondMax, thirdMax};
	}

}