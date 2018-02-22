package com.huangyu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 762. Prime Number of Set Bits in Binary Representation
 * 
 * @author huangyu
 *
 */
public class PrimeNumberOfSetBitsInBinaryRepresentation {

	public int countPrimeSetBits(int L, int R) {
		// 10^6 < 2^20 so the max prime is 19
		Set<Integer> primeSet = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19));
		int count = 0;
		for (int i = L; i <= R; i++) {
			int bitCount = 0;
			for (int n = i; n > 0; n >>= 1) {
				bitCount += n & 1;
			}
			count += primeSet.contains(bitCount) ? 1 : 0;
		}
		return count;
	}

}
