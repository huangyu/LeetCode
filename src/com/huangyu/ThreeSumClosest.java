package com.huangyu;

import java.util.Arrays;

public class ThreeSumClosest {

	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);

		int closest = nums[0] + nums[1] + nums[nums.length - 1];

		for (int i = 0; i < nums.length - 2; i++) {
			int left = i + 1, right = nums.length - 1;
			int sum = nums[i] + nums[left] + nums[right];

			while (left < right) {
				if (sum > target) {
					right--;
				} else {
					left++;
				}

				closest = (Math.abs(sum - target) < Math.abs(closest - target)) ? sum : closest;
			}
		}
		return closest;
	}

}
