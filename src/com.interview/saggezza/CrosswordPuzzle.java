package com.saggezza;

import java.util.Scanner;

public class CrosswordPuzzle {

	public static void main(String[] args) {
		char input[][] = new char[10][10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			input[i] = scanner.nextLine().toCharArray();
		}
		String str = scanner.nextLine().replaceAll(";", "");
		int k = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (input[i][j] == '-') {
					input[i][j] = str.charAt(k);
					++k;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(input[i][j]);
			}
			System.out.println();
		}
	}

}
