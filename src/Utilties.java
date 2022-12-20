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
		int[] arr = new int[] {2, 3, 1, 8, 4, 5, 0, 2};
//		ArrayList<Character> arr1 = new ArrayList<>();
//		arr1.add('e');
//		arr1.add('e');
//		arr1.add('f');
//		arr1.add('g');
//		arr1.add('w');
//		arr1.add('w');
//		arr1.add('g');
//		arr1.add('f');
//		arr1.add('t');
//		arr1.add('r');
//		arr1.add('a');
		SelectionSort xSelectionSort = new SelectionSort();
//		SelectionSort.BubbleSort(arr);
//		printArray(arr);
		
		System.out.println(xSelectionSort.TargetNumber(arr, 5));
		
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