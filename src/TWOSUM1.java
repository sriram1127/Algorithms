package com.leet;

import java.util.HashMap;

public class TWOSUM1 {

	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int result[] = new int[2];
		Integer temp = null;
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			temp = map.get(target - nums[i]);
			if (temp != null && temp != i) {
				result[0] = i;
				result[1] = temp;
				return result;
			}
		}
		return result;
	}

}
