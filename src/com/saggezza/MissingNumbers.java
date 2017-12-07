package com.saggezza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MissingNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer temp = 0, no = 0;
		int no1 = Integer.parseInt(scanner.nextLine());
		ArrayList<Integer> result = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < no1; ++i) {
			no = scanner.nextInt();
			temp = map.get(no);
			if (temp == null) {
				map.put(no, 1);
			} else {
				map.put(no, temp + 1);
			}
		}
		int no2 = scanner.nextInt();
		for (int i = 0; i < no2; ++i) {
			no = scanner.nextInt();
			temp = map.get(no);
			if (temp == null) {
				map.put(no, 1);
			} else {
				map.put(no, temp - 1);
			}
		}
		for (Map.Entry<Integer, Integer> item : map.entrySet()) {
			if (item.getValue() != 0) {
				result.add(item.getKey());
			}
		}
		Collections.sort(result);
		for (Integer output : result) {
			System.out.print(output + " ");
		}
	}
}
