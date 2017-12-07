package com.saggezza;

import java.util.Scanner;

public class StockMaximize {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		long result[] = new long[t];
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int[] arr = new int[n];
			for (int arr_i = 0; arr_i < n; arr_i++) {
				arr[arr_i] = in.nextInt();
			}
			long[] high = new long[arr.length];
			long profit = 0;
			long count = 0;
			long share = 0;
			long tempHigh = 0;
			for (int i = arr.length - 1; i > -1; --i) {
				high[i] = arr[i] > tempHigh ? arr[i] : tempHigh;
				tempHigh = high[i];
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < high[i]) {
					share += arr[i];
					++count;
				} else {
					profit += count * arr[i] - share;
					share = 0;
					count = 0;
				}
			}
			result[a0] = profit;
		}
		in.close();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
