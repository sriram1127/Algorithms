package com.leet;

public class MergeArrays {
	public static void main(String args[]) {
		merge(new int[] { 1, 2, 0, 0 }, new int[] { -5, 9 }, 2, 2);
		System.out.println();
	}

	private static int[] merge(int[] a, int[] b, int m, int n) {
		int p1 = 0, p2 = 0;
		int temp = 0;
		for (; p1 < n; p1++) {
			if (a[p1] > b[p2]) {
				temp = a[p1];
				a[p1] = b[p2];
				b[p2] = temp;
			}
		}
		for (; p1 < a.length && p2 < b.length; p1++, p2++) {
			a[p1] = b[p2];
		}
		return a;
	}
}
