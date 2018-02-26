package com.huangyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 18. 4Sum
 * 
 * @author huangyu
 *
 */
public class FourSum {

	public static void main(String[] args) {
		System.out.println(fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0));
	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		return kSum(nums, 0, 4, target);
	}

	public static List<List<Integer>> kSum(int[] nums, int start, int k, int target) {
		List<List<Integer>> result = new ArrayList<>();
		// 解2Sum问题
		if (k == 2) {
			result.addAll(twoSum(nums, target));
		} else {
			for (int i = start; i < nums.length - (k - 1); i++) {
				if (i > start && nums[i] == nums[i - 1]) {
					continue;
				}
				// 将kSum问题转化为k-1Sum问题直至2Sum
				List<List<Integer>> kSumResult = kSum(nums, i + 1, k - 1, target - nums[i]);
				for (List<Integer> list : kSumResult) {
					list.add(0, nums[i]);
				}
				result.addAll(kSumResult);
			}
		}
		return result;
	}

	public static List<List<Integer>> twoSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<>();
		int left = 0, right = nums.length - 1;
		while (left < right) {
			if (nums[left] + nums[right] == target) {
				result.add(Arrays.asList(nums[left], nums[right]));
				left++;
				right--;
				while (left < right && nums[left] == nums[left - 1]) {
					left++;
				}
				while (left < right && nums[right] == nums[right + 1]) {
					right--;
				}
			} else if (nums[left] + nums[right] > target) {
				right--;
			} else {
				left++;
			}
		}
		return result;
	}

}
