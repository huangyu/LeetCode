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
		int length = 0, i = 0, j = 0;
		Set<Character> set = new HashSet<>();
		while (i < s.length()) {
			if (set.contains(s.charAt(i))) {
				set.remove(s.charAt(j++));
			} else {
				set.add(s.charAt(i++));
				length = Math.max(length, set.size());
			}
		}
		return length;
	}

}
