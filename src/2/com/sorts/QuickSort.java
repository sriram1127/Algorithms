package com.sorts;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		int[] input = new int[] { 1, 6, 8, 3, 5, 6, 2, 9, 0, 6, 5, -1 };
		new QuickSort().sort(input, 0, input.length - 1);
		System.out.println(Arrays.toString(input));
	}

	public void sort(int[] arr, int start, int end) {
		if (start >= 0 && end <= arr.length - 1 && start < end) {
			int pivot = arr[end];
			int temp, i, j;

			for (i = start - 1, j = start; j <= end; ++j) {
				if (arr[j] <= pivot) {
					temp = arr[j];
					arr[j] = arr[++i];
					arr[i] = temp;
				}
			}
			sort(arr, 0, i - 1);
			sort(arr, i + 1, end);
		}
	}

}
