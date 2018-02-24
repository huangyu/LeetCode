package com.huangyu;

import java.util.Arrays;

/**
 * 1. Two Sum
 * 
 * @author huangyu
 *
 */
public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		int[] sorted = new int[nums.length];
		System.arraycopy(nums, 0, sorted, 0, nums.length);
		Arrays.sort(sorted);

		int left = 0, right = sorted.length - 1;
		while (left < right) {
			if (sorted[left] + sorted[right] == target) {
				break;
			} else if (sorted[left] + sorted[right] > target) {
				right--;
			} else {
				left++;
			}
		}

		int result1 = -1, result2 = -1;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == sorted[left]) {
				if (result1 == -1) {
					result1 = i;
					continue;
				}
			}
			if (nums[i] == sorted[right]) {
				if (result2 == -1) {
					result2 = i;
					continue;
				}
			}
		}

		return new int[] { result1, result2 };
	}

}
