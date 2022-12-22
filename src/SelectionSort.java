import java.nio.channels.InterruptedByTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class SelectionSort {
	
	public static void SelectionSortAlgoArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int max = arr[i];
			int indexOfMax = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > max) {
					max = arr[j];
					indexOfMax = j;
				}
 			}
			// swapping 
			int t = arr[i];
			arr[i] = max;
			arr[indexOfMax] = t; 
		}
	}
	
	public static void BubbleSortAlgoArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
 			}
		}
	}
	
	public static void BubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i ++) {
			for (int j = 1; j < arr.length; j ++) {
				if (arr[j-1] < arr[j]) {
					int t = arr[j - 1];
					arr[j -1] = arr[j];
					arr[j] = t;
				}
			}
 		}
	}
	
	
	public static ArrayList<Character> UniqueAlphapet(ArrayList<Character> arr) {
		ArrayList<Character> uniqueChars = new ArrayList<>();
		for (int i = 0; i < arr.size(); i ++) {
			if (!uniqueChars.contains(arr.get(i))) {
				uniqueChars.add(arr.get(i));
			}
		}
		return uniqueChars;
	}
	
	
	public static Set<Character> UniqueAlphapetHashMap(ArrayList<Character> arr) {
		HashMap<Character, Integer> uniqueCharsHashMap = new HashMap();
		for (int i = 0; i < arr.size(); i ++) {
			uniqueCharsHashMap.put(arr.get(i), 0);
		}
		return  uniqueCharsHashMap.keySet();
	}
	
	public static void ArrayRepeatationHashMap(int[] arr) {
		HashMap<Integer, Integer> RepeatedNumberArray = new HashMap<>();
		for (int i = 0; i < arr.length; i ++) {
			if (!RepeatedNumberArray.containsKey(arr[i])) {
				RepeatedNumberArray.put(arr[i], 1);
			} else {
				int count = RepeatedNumberArray.get(arr[i])+1;
				RepeatedNumberArray.put(arr[i], count);
			}
		}
		
		for (int number : RepeatedNumberArray.keySet()) {
			System.out.println( number + " repeated : "+ RepeatedNumberArray.get(number) + " time (s)");
		}
	}
	
	public static ArrayList<ArrayList<Integer>> TargetNumber(int[] arr, int target) {
		ArrayList<ArrayList<Integer>> resultPairTargerArrayList = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> usedIndexArrayList = new ArrayList<>();
		for (int i = 0; i < arr.length; i ++) {
			for (int j = i + 1; j < arr.length; j ++) {
				if (arr[i] + arr[j] == target && !usedIndexArrayList.contains(i) && !usedIndexArrayList.contains(j)) {
					ArrayList<Integer> newArrayList = new ArrayList<Integer>();
					newArrayList.add(arr[i]);
					newArrayList.add(arr[j]);
					resultPairTargerArrayList.add(newArrayList);
					usedIndexArrayList.add(i);
					usedIndexArrayList.add(j);
				}
			}
		}
		return resultPairTargerArrayList;
	}
	
	
	public static ArrayList<Integer> TargetNumberHashMap(int[] arr, int target) {
		HashMap<ArrayList<Integer>, Integer> resultPairTargemHashMap = new HashMap<>();
		ArrayList<ArrayList<Integer>> pairedArrayList = new ArrayList<ArrayList<Integer>>();
		for (int i  = 0; i < arr.length; i++) {
			for (int j = i +1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println(arr[i] + arr[j]);
					ArrayList<Integer> newArrayList = new ArrayList<Integer>();
					if (arr[i] < arr[j]) {
						newArrayList.add(arr[i]);
						newArrayList.add(arr[j]);
					} else {
						newArrayList.add(arr[j]);
						newArrayList.add(arr[i]);	
					}
					
					resultPairTargemHashMap.put(newArrayList, 0);
				}
			}
		}	

		return new ArrayList<Integer>((Set)resultPairTargemHashMap.keySet());
	}
	
	public static ArrayList<Integer> TargetNumberHashMapOneLoop(int arr[], int target) {
		HashMap<ArrayList<Integer>, Integer> resultPairTargemHashMap = new HashMap<>();
		int j = 0;
		for (int i = j + 1; i < arr.length; i++) {
			if (target - arr[i] == arr[j]) {
				ArrayList<Integer> newArrayList = new ArrayList<Integer>();
				if (arr[i] < arr[j]) {
					newArrayList.add(arr[i]);
					newArrayList.add(arr[j]);
				} else {
					newArrayList.add(arr[j]);
					newArrayList.add(arr[i]);	
				}
				
				resultPairTargemHashMap.put(newArrayList, 0);
				++j;
				i = j + 1;
			} else if (i == arr.length - 1) {
				++j;
				i = j + 1;
			}
		}		
		return new ArrayList<Integer>((Set)resultPairTargemHashMap.keySet());
	}
	
	public static ArrayList<ArrayList<Integer>> TargetNumberHashMapOneLoopAnotherSol(int arr[], int target) {
		HashMap<Integer, Boolean> resultPairTargemHashMap = new HashMap<>();
		ArrayList<ArrayList<Integer>> pairedArrayList = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < arr.length; i++) {
			if (resultPairTargemHashMap.containsKey(target - arr[i]) && !resultPairTargemHashMap.get(target - arr[i])) {
				resultPairTargemHashMap.put(target - arr[i], true);
				resultPairTargemHashMap.put(arr[i], true);
				ArrayList<Integer> newArrayList = new ArrayList<Integer>();
				newArrayList.add(target - arr[i]);
				newArrayList.add(arr[i]);
				pairedArrayList.add(newArrayList);
				
			} else {
				resultPairTargemHashMap.put(arr[i], false);
			}
		}
		return pairedArrayList;
	}
	
	public static ArrayList<ArrayList<Integer>> TargetNumberHashOneLoopAnotherSolSol(int arr[], int target) {
		HashMap<Integer, Integer> resultPairTargemHashMap = new HashMap<>();
		ArrayList<ArrayList<Integer>> pairedArrayList = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i < arr.length; i++) {
			int pairPart = target - arr[i];
			if (resultPairTargemHashMap.containsKey(pairPart) && resultPairTargemHashMap.get(pairPart) >= 1) {
				int count = resultPairTargemHashMap.get(pairPart) - 1;
				resultPairTargemHashMap.put(arr[i], count);
				System.out.println(arr[i] + " - " + pairPart);
			} else if (resultPairTargemHashMap.containsKey(arr[i])) {
				int count = resultPairTargemHashMap.get(arr[i]) + 1;
				resultPairTargemHashMap.put(arr[i], count);
			} else {
				resultPairTargemHashMap.put(arr[i], 1);
			}
			System.out.println(resultPairTargemHashMap);
		}
		System.out.println(resultPairTargemHashMap);
		
		return pairedArrayList;
	}
	
	
	public static HashMap<String, ArrayList<Integer>> OddEvenNumber (int[] arr) {
		HashMap<String, ArrayList<Integer>> oddEvenNumberResultHashMap = new HashMap<>();
		oddEvenNumberResultHashMap.put("even", new ArrayList<Integer>());
		oddEvenNumberResultHashMap.put("odd", new ArrayList<Integer>());
		for (int i = 0; i < arr.length; i ++) {
			if (arr[i] % 2 == 0) {
				ArrayList<Integer> oddEvenResultArrayList = oddEvenNumberResultHashMap.get("even");
				oddEvenResultArrayList.add(arr[i]);
				oddEvenNumberResultHashMap.put("even", oddEvenResultArrayList);
			} else {
				ArrayList<Integer> oddEvenResultArrayList = oddEvenNumberResultHashMap.get("odd");
				oddEvenResultArrayList.add(arr[i]);
				oddEvenNumberResultHashMap.put("odd", oddEvenResultArrayList);
			}
		}
		return oddEvenNumberResultHashMap;
	}
	
	
	public static int POW(int a, int b) {
		int g = a;
		if (b == 0) {
			a = 1;
		} else  {
			for (int i  = 1; i < b; i ++) {
				a *= g;
			}
		}
		return a;
	}
	
	public static String reverseString(String str) {
		ArrayList<Character> strCharsArrayList = new ArrayList<>();
		String newString = new String();
		for (int i = str.length() - 1; i >= 0; i--) {
			strCharsArrayList.add(str.charAt(i));
		}
		
		for (int i = 0; i < strCharsArrayList.size(); i ++) {
			newString += strCharsArrayList.get(i);
		}
		
		return newString;
	}
	
	public static int factorial(int num) {
		int n = 1;
		if (num == 0) {
			n = 0;
		} else {
			for (int i = 1; i <= num; i++) {
				n *=i;
			}
		}
		return n;
	}
	
	public static boolean plaindrom(String str) {
		
		int maxIndex = (int)Math.floor(str.length()/2);
		boolean is = true;
		int i = 0;
		while(i < maxIndex) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				is = false;
			}
			i ++;
		}
		return is;
	}
}










