package com.leet;

public class MaximumSubArraySum {
	public static void main(String[] args) {
		int a[] = { -2, -3};
		
		int max = a[0];
		int currentMax = a[0];
		for (int i = 1; i < a.length; i++) {
			currentMax = Math.max(a[i], currentMax+a[i]);
			max = Math.max(max, currentMax);
		}
		System.out.println(max);
	}
}
