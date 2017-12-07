package com.saggezza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Pairs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int count = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int difference = scanner.nextInt();
		for (int i = 0; i < length; i++) {
			list.add(scanner.nextInt());
		}
		Collections.sort(list);
		HashSet<Integer> set = new HashSet<Integer>(list);
		for (Integer no : set) {
			if (set.contains(no + difference)) {
				++count;
			}
		}
		System.out.println(count);
	}
}
