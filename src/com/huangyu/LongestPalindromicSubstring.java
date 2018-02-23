package com.huangyu;

/**
 * 5. Longest Palindromic Substring
 * 
 * @author huangyu
 *
 */
public class LongestPalindromicSubstring {

	public String longestPalindrome(String s) {
		int length = s.length();
		int max = 0;
		String result = null;
		boolean[][] dp = new boolean[length][length];

		for (int i = length - 1; i >= 0; i--) {
			for (int j = i; j < length; j++) {
				dp[i][j] = (s.charAt(i) == s.charAt(j)) && (j - i < 3 || dp[i + 1][j - 1]);
				if (dp[i][j] && j + 1 - i > max) {
					result = s.substring(i, j + 1);
					max = j + 1 - i;
				}
			}
		}
		return result;
	}

}
