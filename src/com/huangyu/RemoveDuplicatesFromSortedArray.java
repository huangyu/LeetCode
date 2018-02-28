package com.huangyu;

/**
 * 26. Remove Duplicates from Sorted Array
 * 
 * @author huangyu
 *
 */
public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[] { 1, 2, 3, 3, 4 }));
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0 || nums.length == 1) {
			return nums.length;
		}

		int result = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[result] = nums[i];
				result++;
			}
		}
		return result;
	}

}
