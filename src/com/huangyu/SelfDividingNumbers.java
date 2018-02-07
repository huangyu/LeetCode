package com.huangyu;

import java.util.ArrayList;
import java.util.List;

/**
 * 728. Self Dividing Numbers
 * 
 * @author huangyu
 *
 */
public class SelfDividingNumbers {

	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> selfDividingNumbers = new ArrayList<>();
		for (int num = left; num <= right; num++) {
			if (isSelftDividingNumber(num)) {
				selfDividingNumbers.add(num);
			}
		}
		return selfDividingNumbers;
	}

	public static boolean isSelftDividingNumber(int num) {
		int originNum = num;
		while (num > 0) {
			int n = num % 10;
			if (n == 0 || originNum % n != 0) {
				return false;
			}
			num /= 10;
		}
		return true;
	}

}
