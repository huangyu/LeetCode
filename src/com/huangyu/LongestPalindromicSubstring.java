package com.huangyu;

/**
 * 5. Longest Palindromic Substring
 * 
 * @author huangyu
 *
 */
public class LongestPalindromicSubstring {

	public String longestPalindrome(String s) {

	}

	private String findPalindromic(String s) {
		StringBuilder sb = new StringBuilder(s);
		if (sb.reverse().equals(s)) {
			return s;
		}
		return null;
	}

}
