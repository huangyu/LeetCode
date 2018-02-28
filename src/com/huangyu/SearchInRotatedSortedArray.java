package com.huangyu;

/**
 * 33. Search in Rotated Sorted Array
 * 
 * @author huangyu
 *
 */
public class SearchInRotatedSortedArray {

	public int search(int[] nums, int target) {
		return search(nums, 0, nums.length - 1, target);
	}

	public int search(int[] nums, int first, int last, int target) {
		if (first > last) {
			return -1;
		}

		int mid = (first + last) / 2;
		if (nums[mid] == target) {
			return mid;
		}

		if (nums[first] <= nums[mid]) {
			if (target <= nums[mid] && target >= nums[first]) {
				return search(nums, first, mid - 1, target);
			} else {
				return search(nums, mid + 1, last, target);
			}
		}
		if (nums[mid] <= nums[last]) {
			if (target >= nums[mid] && target <= nums[last]) {
				return search(nums, mid + 1, last, target);
			} else {
				return search(nums, first, mid - 1, target);
			}
		}

		return -1;
	}

}
