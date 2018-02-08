package com.huangyu;

/**
 * 485. Max Consecutive Ones
 * 
 * @author huangyu
 *
 */
public class MaxConsecutiveOnes {

	public static int findMaxConsecutiveOnes(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int max = 0;
		int cur = 0;
		for (int num : nums) {
			if (num == 0) {
				cur = 0;
			}
			cur += num;
			if (cur > max) {
				max = cur;
			}
		}

		return max;
	}

}
