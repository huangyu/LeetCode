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

	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		return kSum(nums, 0, 4, target);
	}

	public List<List<Integer>> kSum(int[] nums, int start, int k, int target) {
		List<List<Integer>> result = new ArrayList<>();
		if (k == 2) {
			result.addAll(twoSum(nums, start, target));
		} else {
			for (int i = start; i < nums.length - (k - 1); i++) {
				if (i > start && nums[i] == nums[i - 1]) {
					continue;
				}
				List<List<Integer>> temp = kSum(nums, i + 1, k - 1, target - nums[i]);
				for (List<Integer> t : temp) {
					t.add(0, nums[i]);
				}
				result.addAll(temp);
			}
		}
		return result;
	}

	public List<List<Integer>> twoSum(int[] nums, int start, int target) {
		List<List<Integer>> list = new ArrayList<>();
		int left = start, right = nums.length - 1;
		while (left < right) {
			if (nums[left] + nums[right] == target) {
				List<Integer> path = new ArrayList<>();
				path.add(nums[left]);
				path.add(nums[right]);
				list.add(path);
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
		return list;
	}

}
