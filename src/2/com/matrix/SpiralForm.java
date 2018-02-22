package com.matrix;

public class SpiralForm {
	public static void main(String args[]) {

		int[][] m = { { 1, 2, 3, 1 }, { 5, 6, 7, 2 }, { 8, 9, 6, 4 }, { 1, 2, 3, 7 } };
		new SpiralForm().spiral(m, 0, m.length - 1, 0, m[0].length - 1);
	}

	public void spiral(int[][] m, int rb, int re, int cb, int ce) {
		// System.out.println(rb + " " + re + " " + cb + " " + ce + " ");
		if (rb <= re && cb <= ce) {
			// r=, c= 0 to n -1
			if (rb == re && re == cb && cb == ce) {
				System.out.print(m[rb][cb]);
			}

			for (int i = cb; i < ce; ++i) {
				System.out.print(m[rb][i]);
			}

			for (int i = rb; i < re; ++i) {
				System.out.print(m[i][ce]);
			}

			for (int i = ce; i > cb; --i) {
				System.out.print(m[re][i]);
			}

			for (int i = re; i > rb; --i) {
				System.out.print(m[i][cb]);
			}
			// System.out.println(rb + " " + re + " " + cb + " " + ce + " ");
			spiral(m, rb + 1, re - 1, cb + 1, ce - 1);

		}

	}
}
