import java.util.Stack;

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
}
