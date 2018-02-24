package com.huangyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 3Sum
 * 
 * @author huangyu
 *
 */
public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();

		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			int left = i + 1, right = nums.length - 1;
			while (left < right) {
				if (nums[left] + nums[right] + nums[i] == 0) {
					result.add(Arrays.asList(nums[left], nums[right], nums[i]));
					left++;
					right--;
					while (left < right && nums[left] == nums[left - 1]) {
						left++;
					}
					while (left < right && nums[right] == nums[right + 1]) {
						right--;
					}
				} else if (nums[left] + nums[right] + nums[i] > 0) {
					right--;
				} else {
					left++;
				}
			}
		}

		return result;
	}

}
