package com.drchrono;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RockCollectors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max = 0;
		int no = Integer.MIN_VALUE;
		int tempsum = 0;
		int n = scanner.nextInt();
		int[] input1 = new int[n];
		int[] input2 = new int[n];
		HashMap<Integer, Integer> sum = new HashMap<Integer, Integer>();
		// int[] sum = new int[n];
		for (int i = 0; i < n; i++) {
			input1[i] = scanner.nextInt();
			input2[i] = input1[i];
		}
		Arrays.sort(input2);
		for (int i = 0; i < n; i++) {
			tempsum = input1[i] + input2[i];
			if (sum.containsKey(tempsum)) {
				sum.put(tempsum, sum.get(tempsum) + 1);
				if (sum.get(tempsum) >= max) {
					max = sum.get(tempsum);
				}
			} else {
				sum.put(tempsum, 1);
			}
		}
		for (Map.Entry<Integer, Integer> item : sum.entrySet()) {
			if (item.getValue() == max) {
				no = item.getKey() > no ? item.getKey() : no;
			}
		}
		System.out.println(no);
	}

}
