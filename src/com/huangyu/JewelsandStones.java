package com.huangyu;

/**
 * 771. Jewels and Stones
 * 
 * @author huangyu
 *
 */
public class JewelsandStones {

	/**
	 * Example: Input: J = "aA", S = "aAAbbbb" Output: 3
	 */
	public int numJewelsInStones(String J, String S) {
		if (J.length() == 0 || S.length() == 0) {
			return 0;
		}

		int count = 0;
		for (char c : S.toCharArray()) {
			if(J.indexOf(c) != -1) {
				count++;
			}
		}

		return count;
	}

}
