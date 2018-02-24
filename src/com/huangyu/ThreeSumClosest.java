package com.huangyu;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		System.out.println(threeSumClosest(new int[] { 0, 2, 1, -3 }, 1));
	}

	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);

		int closest = nums[0] + nums[1] + nums[nums.length - 1];

		for (int i = 0; i < nums.length - 2; i++) {
			int left = i + 1, right = nums.length - 1;

			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				
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
