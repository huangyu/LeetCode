package com.huangyu;

/**
 * 463. Island Perimeter
 * 
 * @author huangyu
 *
 */
public class IslandPerimeter {

	public int islandPerimeter(int[][] grid) {
		if (grid == null || grid.length == 0) {
			return 0;
		}

		int row = grid.length;
		int column = grid[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (grid[i][j] == 1) {
					return getPerimeter(grid, i, j);
				}
			}
		}

		return 0;
	}

	public int getPerimeter(int[][] grid, int i, int j) {
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
			return 1;
		}

		if (grid[i][j] == 0) {
			return 1;
		}

		if (grid[i][j] == -1) {
			return 0;
		}

		// mark the position has been counted
		grid[i][j] = -1;

		int count = 0;
		count += (getPerimeter(grid, i - 1, j)
				+ getPerimeter(grid, i + 1, j)
				+ getPerimeter(grid, i, j - 1)
				+ getPerimeter(grid, i, j + 1));
		return count;
	}

}
