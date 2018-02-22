package com.sorts;

public class MergeSorting {

	public static void main(String[] args) {

		int array[] = new int[] { 1, 9, 5, 6, 6 };

		new MergeSorting().sort(array, 0, array.length - 1);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

	}

	public void sort(int array[], int l, int r) {
		if (l < r) {

			int m = (l + r) / 2;

			sort(array, l, m);
			sort(array, m + 1, r);
			merge(array, l, r, m);
		}

	}

	public void merge(int[] a, int l, int r, int m) {

		int la[] = new int[m - l + 1];
		int ra[] = new int[r - m];
		int i = 0, j = 0;
		int k = l;
		for (int p = 0; p < la.length; ++p) {
			la[p] = a[l++];
		}
		for (int p = 0; p < ra.length; ++p) {
			ra[p] = a[m + 1 + p];
		}
		while (i < la.length && j < ra.length) {
			if (la[i] <= ra[j]) {
				a[k++] = la[i++];
			} else {
				a[k++] = ra[j++];
			}
		}
		while (i < la.length) {
			a[k++] = la[i++];
		}
		while (j < ra.length) {
			a[k++] = ra[j++];
		}

	}
}
