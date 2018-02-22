package com.sorts;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int input[] = { 10, 5, 3, 2, 7, 4, 8, 9 };
		new SelectionSort().sort(input, 0, input.length - 1);
		System.out.println(Arrays.toString(input));
	}

	public void sort(int[] arr, int start, int end) {
		if (start < end) {
			int temp = arr[start];
			int index = start;
			for (int i = start; i <= end; i++) {
				if (temp > arr[i]) {
					index = i;
					temp = arr[i];
				}

			}
			arr[index] = arr[start];
			arr[start] = temp;
			sort(arr, start + 1, end);
		}
	}
}
