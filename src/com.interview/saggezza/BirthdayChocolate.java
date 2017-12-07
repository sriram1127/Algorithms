package com.saggezza;

import java.util.Scanner;

public class BirthdayChocolate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int input[] = new int[length];
		for (int i = 0; i < input.length; i++) {
			input[i] = scanner.nextInt();
		}
		int tempSum = 0;
		int count = 0;
		int d = scanner.nextInt();
		int m = scanner.nextInt();
		if (m <= length) {
			for (int i = 0; i < m; i++) {
				tempSum += input[i];
			}
			if (tempSum == d)
				++count;
			for (int i = 0, j = m; m < length; m++, i++) {
				tempSum = tempSum - input[i] + input[j];
				if (tempSum == d)
					++count;
			}
		}
		System.out.println(count);
	}

}
