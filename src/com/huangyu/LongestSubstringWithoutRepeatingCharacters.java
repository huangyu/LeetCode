package com.huangyu;

import java.util.HashSet;
import java.util.Set;

/**
 * 3.Longest Substring Without Repeating Characters
 * 
 * @author huangyu
 *
 */
public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
		int length = 0;
		Set<Character> set = new HashSet<>();
		for (char c : s.toCharArray()) {
			if (set.contains(c)) {
				set.remove(c);
				length = Math.max(length, set.size());
			} else {
				set.add(c);
			}
		}
		return length;
	}

}
