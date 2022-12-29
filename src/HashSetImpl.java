import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;

import javax.imageio.ImageTranscoder;

public class HashSetImpl {
	
	public static void findUniqueStrings() {
		ArrayList<String> nameArrayList = new ArrayList<>();
		HashSet<String> nameUniqueHashSet = new HashSet<String>();
		nameArrayList.add("Mr A");
		nameArrayList.add("Mr B");
		nameArrayList.add("Mr C");
		nameArrayList.add("Mr C");
		nameArrayList.add("Mr A");
		nameArrayList.add("Mr B");
		nameArrayList.add("Mr D");
		nameArrayList.add("Mr A");
		nameArrayList.add("Mr A");
		
		for (int i = 0; i < nameArrayList.size(); i ++) {
			nameUniqueHashSet.add(nameArrayList.get(i));
		}
		System.out.println(nameUniqueHashSet);
	}
	
	public static void findUniqueStringsWithoutHashSet() {
		ArrayList<String> nameArrayList = new ArrayList<>();
		ArrayList<String> nameUniqueArrayList = new ArrayList<>();
		nameArrayList.add("Mr A");
		nameArrayList.add("Mr B");
		nameArrayList.add("Mr C");
		nameArrayList.add("Mr C");
		nameArrayList.add("Mr A");
		nameArrayList.add("Mr B");
		nameArrayList.add("Mr D");
		nameArrayList.add("Mr A");
		nameArrayList.add("Mr A");
		
		for (int i = 0; i < nameArrayList.size(); i ++) {
			if (!nameUniqueArrayList.contains(nameArrayList.get(i))) {
				nameUniqueArrayList.add(nameArrayList.get(i));
			} 
		}
		System.out.println(nameUniqueArrayList);
	}
	
	public static void findUnion() {
		HashSet<String> nameHashSet1 = new HashSet<>();
		HashSet<String> nameHashSet2 = new HashSet<>();
		nameHashSet1.add("Mr A");
		nameHashSet1.add("Mr F");
		nameHashSet1.add("Mr G");
		nameHashSet1.add("Mr T");
		nameHashSet1.add("Mr B");
		nameHashSet1.add("Mr C");
		
		nameHashSet2.add("Mr C");
		nameHashSet2.add("Mr D");
		nameHashSet2.add("Mr Y");
		nameHashSet2.add("Mr T");
		nameHashSet2.add("Mr K");
		
		nameHashSet1.retainAll(nameHashSet2);
		System.out.println("intersection: " + nameHashSet1);
	}
	
	public static void findUnionWithoutHashSet() {
		
		ArrayList<String> nameArrayList1 = new ArrayList<>();
		ArrayList<String> nameArrayList2 = new ArrayList<>();
		ArrayList<String> nameArrayListUnion = new ArrayList<>();
		nameArrayList1.add("Mr A");
		nameArrayList1.add("Mr F");
		nameArrayList1.add("Mr G");
		nameArrayList1.add("Mr T");
		nameArrayList1.add("Mr B");
		nameArrayList1.add("Mr C");
		
		nameArrayList2.add("Mr C");
		nameArrayList2.add("Mr D");
		nameArrayList2.add("Mr Y");
		nameArrayList2.add("Mr T");
		nameArrayList2.add("Mr K");
		
		// assuming nameArrayList1 has more empolyee so iterate through less empolyee to find union 
		
		for(int i = 0; i < nameArrayList2.size(); i++) {
			if (nameArrayList1.contains(nameArrayList2.get(i))) {
				nameArrayListUnion.add(nameArrayList2.get(i));
			}
		}
		
		System.out.println("intersection: " + nameArrayListUnion);
	}
}
