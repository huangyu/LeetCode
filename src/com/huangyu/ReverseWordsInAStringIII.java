package com.huangyu;

/**
 * 557. Reverse Words in a String III
 * 
 * @author huangyu
 *
 */
public class ReverseWordsInAStringIII {

	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
		System.out.println(reverseWords("Let's"));
	}

	public static String reverseWords(String s) {
		if (s == null || s.isEmpty()) {
			return "";
		}

		StringBuilder result = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		char[] chars = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			char c = chars[i];
			if (c == ' ') {
				sb.append(c);
				sb.reverse();
				result.append(sb);
				sb = new StringBuilder();
			} else {
				if (i == s.length() - 1) {
					sb.append(c);
					sb.append(" ");
					sb.reverse();
					result.append(sb);
				} else {
					sb.append(c);
				}
			}
		}
		return result.toString().replaceFirst(" ", "");
	}

}
