package com.saggezza;

public class InsertionSort {

	public static void main(String[] args) {
		insertIntoSorted(new int[] { 2, 4, 6, 8, 1 });
	}

	public static void insertIntoSorted(int[] ar) {
		int no = ar[ar.length - 1];
		boolean sorted = false;
		for (int i = ar.length - 2; i > -1; i--) {
			if (ar[i] > no) {
				ar[i + 1] = ar[i];
			} else {
				ar[i + 1] = no;
				sorted = true;
			}
			for (int j = 0; j < ar.length; j++) {
				System.out.print(ar[j] + " ");
			}
			if (sorted) {
				break;
			}
			System.out.println();
		}
		if (!sorted) {
			ar[0] = no;
			for (int j = 0; j < ar.length; j++) {
				System.out.print(ar[j] + " ");
			}
		}

	}
}
