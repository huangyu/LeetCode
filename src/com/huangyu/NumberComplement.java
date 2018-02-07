package com.huangyu;

/**
 * 476. Number Complement
 * 
 * @author huangyu
 *
 */
public class NumberComplement {

	public int findComplement(int num) {
		int sum = 0;
		while(sum < num) {
			sum = sum << 1 | 1;
		}
		return sum - num;
	}

}
