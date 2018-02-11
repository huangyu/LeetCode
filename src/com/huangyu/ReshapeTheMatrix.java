package com.huangyu;

/**
 * 566. Reshape the Matrix
 * 
 * @author huangyu
 *
 */
public class ReshapeTheMatrix {

	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int row = nums.length;
		int column = nums[0].length;

		if (row * column != r * c) {
			return nums;
		}

		int[][] matrix = new int[r][c];
		for (int i = 0; i < r * c; i++) {
			matrix[i / c][i % c] = nums[i / column][i % column];
		}
		return matrix;
	}

}
