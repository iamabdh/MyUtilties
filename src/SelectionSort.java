import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

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
}

