package com.huangyu;

import java.util.HashSet;
import java.util.Set;

/**
 * 575. Distribute Candies
 * 
 * @author huangyu
 *
 */
public class DistributeCandies {

	public int distributeCandies(int[] candies) {
		Set<Integer> candiesSet = new HashSet<>();
		for (int candy : candies) {
			candiesSet.add(candy);
		}
		return Math.min(candiesSet.size(), candies.length / 2);
	}

}
