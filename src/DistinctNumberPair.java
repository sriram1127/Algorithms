package com.tree;

import java.util.Arrays;
import java.util.HashSet;
// distint pair number to get sum
public class DistinctNumberPair {
	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE);
		System.out.println(numberOfPairs(new int[] { 2, 3, 4 , 5 }, 4));
	}

	@SuppressWarnings("unlikely-arg-type")
	static int numberOfPairs(int[] a, long k) {
		int count = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> more = new HashSet<Integer>();
		HashSet<Integer> duplicate = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (!set.add(a[i])) {
				more.add(a[i]);
			}
		}
		long check = 0;
		for (int i = 0; i < a.length; i++) {
			if (!duplicate.contains(a[i])) {
				check = k - a[i];
				if (check != a[i] && set.contains((int) check)) {
					++count;
					duplicate.add(a[i]);
					duplicate.add((int) check);
					continue;
				}
				if (2 * a[i] == (int) k && more.contains(a[i])) {
					++count;
					duplicate.add(a[i]);
				}
			}
		}

		return count;
	}
}
