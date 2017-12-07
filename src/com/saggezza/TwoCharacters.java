package com.saggezza;

import java.util.HashSet;

public class TwoCharacters {
	public static void main(String[] args) {
		System.out.println(twoCharacter("abcdabb"));
	}

	@SuppressWarnings("unlikely-arg-type")
	public static int twoCharacter(String s) {
		char prev = ' ';
		int count = 0;
		int maxCount = 0;
		HashSet<Character> set = new HashSet<Character>();
		for (Character c : s.toCharArray()) {
			set.add(c);
		}
		for (int i = 'a'; i <= 'z'; i++) {
			for (int j = 'a'; j <= 'z'; j++) {
				if (i == j || !(set.contains((char) i) && set.contains((char) j))) {
					continue;
				}
				count = 0;
				for (int z = 0; z < s.length(); z++) {
					if (s.charAt(z) == i || s.charAt(z) == j) {
						if (prev != s.charAt(z)) {
							if (s.charAt(z) == i) {
								prev = (char) i;
							} else if (s.charAt(z) == j) {
								prev = (char) j;
							}
						} else {
							count = 0;
							break;
						}
						++count;
					}
				}
				maxCount = maxCount > count ? maxCount : count;
			}
		}
		return maxCount;
	}
}
