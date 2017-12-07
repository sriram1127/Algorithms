package com.tree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ProperBraces {

	public static void main(String[] args) {
		String a[] = braces(new String[] { "}" });
		System.out.println(a[0]);
	}

	static String[] braces(String[] values) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('{', 1);
		map.put('}', -1);
		map.put('(', 2);
		map.put(')', -2);
		map.put('[', 3);
		map.put(']', -3);
		Stack<Character> stack = new Stack<Character>();
		String string = null;
		String result[] = new String[values.length];
		for (int i = 0; i < values.length; ++i) {
			string = values[i];
			boolean set = false;
			if (string == null) {
				result[i] = "YES";
				continue;
			}
			for (Character c : string.toCharArray()) {
				if (map.get((char) c) > 0) {
					stack.push(c);
				} else {
					if (stack.size() != 0) {
						if (map.get((char) stack.peek()) * -1 != map.get((char) c)) {
							result[i] = "NO";
							set = true;
							break;
						} else {
							stack.pop();
						}
					} else {
						result[i] = "NO";
						set = true;
						break;
					}
				}
			}
			if (!set) {
				if (stack.size() != 0) {
					result[i] = "NO";
				} else {
					result[i] = "YES";
				}
			}
			stack.clear();
		}
		return result;
	}
}
