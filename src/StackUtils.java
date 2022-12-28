import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Stack;
import java.util.PrimitiveIterator.OfDouble;

import javax.sound.midi.MidiUnavailableException;

public class StackUtils {
	
	public static Stack<Character> StackingString(String str) {
		Stack<Character> newStack = new Stack<Character>();
		for (int i = 0; i < str.length(); i ++) {
			newStack.push(str.charAt(i));
		}
		return newStack;
	}
	
	public static boolean checkingValidStatement(String str) {
		Stack<Character> stack = new Stack<Character>();
		int i = 0;
		while (i < str.length()) {
			if (str.charAt(i) == '{') {
				stack.push(str.charAt(i));
			} else if (str.charAt(i) == '}') {
				if (!stack.isEmpty() && stack.peek() == '{') {
					stack.pop();
				} else {
					stack.push(str.charAt(i));
				}
			}
			i ++;
		}
		System.out.println(stack);
		return stack.isEmpty();
	}
	
	public static String reverseStringWithString(String str) {
		String reString = new String();
		String[] strArrStrings = str.split(" ");
		for (int i =  strArrStrings.length - 1; i >= 0; i--) {
			reString += strArrStrings[i] + " ";
		}
		return reString;
	}
	
	public static Stack<String> reverseStackWithStack(String str) {
		Stack<String> stack = new Stack<String>();
		String[] strArrStrings = str.split(" ");
		for (int i =  strArrStrings.length - 1; i >= 0; i--) {
			stack.push(strArrStrings[i]);
		}
		return stack;
	}
	
	public static String splitImpl(String str, char dlimeter) {
		ArrayList<String> stringWordArrayList = new ArrayList<>();
		String reStrings = new String();
		String wordStrings = new String();
		for (int i =  0; i < str.length(); i ++) {
			if (str.charAt(i) == dlimeter || i+1 == str.length()) {
				if (i + 1 == str.length()) {
					wordStrings += str.charAt(i);
				}
				stringWordArrayList.add(wordStrings);
				wordStrings = "";
			} else {
				wordStrings += str.charAt(i);
			}
		}
		for (int i = stringWordArrayList.size() - 1; i >= 0; i --) {
			reStrings += stringWordArrayList.get(i) + " ";
		}
		return reStrings;
	}
	
	public static boolean checkingValidStatementBalance(String str) {
		Stack<Character> stack = new Stack<Character>();
		int i = 0;
		while (i < str.length()) {
			if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
				stack.push(str.charAt(i));
			} else if (str.charAt(i) == '}') {
				if (!stack.isEmpty() && stack.peek() == '{') {
					stack.pop();	
				}
				else {
					stack.push(str.charAt(i));
				}
			} else if (str.charAt(i) == ')') {	
				if (!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();	
				}
				else {
					stack.push(str.charAt(i));
				}
			} else if (str.charAt(i) == ']') {	
					if (!stack.isEmpty() && stack.peek() == '[') {
						stack.pop();	
					}
					else {
						stack.push(str.charAt(i));
					}
				} 
			i ++;
		}
		System.out.println(stack);
		return stack.isEmpty();
	}
	
	public static String splitImplNewUpperCase(String str) {
		ArrayList<String> stringWordArrayList = new ArrayList<>();
		String reStrings = new String();
		String wordStrings = new String();
		for (int i =  0; i < str.length(); i ++) {
			if (Character.isUpperCase(str.charAt(i))) {
				stringWordArrayList.add(wordStrings);
				wordStrings = "";
			} else if (i+1 == str.length()) {
				wordStrings += str.charAt(i);	
				stringWordArrayList.add(wordStrings);
			}
			wordStrings += str.charAt(i);	
			System.out.println(wordStrings);
		}
		for (int i = stringWordArrayList.size() - 1; i >= 0; i --) {
			reStrings += stringWordArrayList.get(i) + " ";
		}
		return reStrings;
	}
	
	public static void splitSentenceWithout(String str) {
		String reStrings = new String();
		String wordStrings = new String();
		
		for (int i = str.length() - 1; i >= 0; i --) {
			if (str.charAt(i) == ' ' || i == 0) {
				wordStrings  = str.charAt(i) + wordStrings;	
				reStrings += wordStrings + " ";
				wordStrings = "";
			} else {
				wordStrings  = str.charAt(i) + wordStrings;	
			}
			System.out.println(reStrings);
		}
		System.out.println(reStrings);
	}
}
