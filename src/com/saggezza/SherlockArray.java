package com.saggezza;

public class SherlockArray {
	public static void main(String[] args) {
		System.out.println(solve(new int[] { 0, 0 }));
	}

	static String solve(int[] a) {
		String result = "NO";
		long left = 0, right = 0;
		for (int i = 0; i < a.length; i++) {
			right += a[i];
		}
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			left += temp;
			right -= a[i];

			if (left == right)
				return "YES";
			temp = a[i];
		}
		return result;
	}
}
