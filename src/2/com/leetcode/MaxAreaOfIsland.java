package com.leetcode;

public class MaxAreaOfIsland {
	public static void main(String[] args) {
		int[][] d = { { 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0 }};
		System.out.println(new MaxAreaOfIsland().maxArea(d));
	}

	public int maxArea(int[][] d) {
		int max = 0;
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[0].length; j++) {
				if (d[i][j] == 1) {
					max = Math.max(length(d, i, j, d.length, d[0].length), max);
				}
			}
		}
		return max;
	}

	public int length(int[][] d, int i, int j, int r, int c) {
		if (i >= 0 && i < r && j >= 0 && j < c && d[i][j] == 1) {
			d[i][j] = -1;
			return 1 + length(d, i + 1, j, r, c) + length(d, i - 1, j, r, c) + length(d, i, j + 1, r, c)
					+ length(d, i, j - 1, r, c);
		} else {
			return 0;
		}

	}
}
