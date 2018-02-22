package com.drchrono;

import java.util.HashSet;

public class Encrypt {

	public static void main(String[] args) {
		String str = "yxyxyxyxyxyxyxyxyxyxyxyxyxyxioioioioioioioi";
		char init = 'a' - 1;
		StringBuffer processed = new StringBuffer();
		StringBuffer output = new StringBuffer();
		HashSet<Character> set = new HashSet<Character>();
		HashSet<Character> vowels = new HashSet<Character>();

		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		for (Character character : str.toCharArray()) {
			if (!vowels.contains(character)) {
				if (set.add(character)) {
					processed.append(character);
				}
			}
		}
		for (int i = 0; i < processed.length() - 1; i++) {
			System.out.println((init + (processed.charAt(i) + processed.charAt(i + 1) - 2 * init) % 26));
			output.append((char) (init + (processed.charAt(i) + processed.charAt(i + 1) - 2 * init) % 26));
		}
		output.append((char) (init + (processed.charAt(processed.length() - 1) + processed.charAt(0) - 2 * init) % 26));
		System.out.println(output);
	}

}
