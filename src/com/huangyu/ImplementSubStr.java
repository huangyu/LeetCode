package com.huangyu;

/**
 * 28. Implement strStr()
 * 
 * @author huangyu
 *
 */
public class ImplementSubStr {

	/**
	 * 暴力破解法
	 * 
	 * @param haystack
	 *            主串
	 * @param needle
	 *            模式串
	 * @return 如果找到，返回在主串中第一个字符出现的下标，否则为-1
	 */
	public static int bfSubStr(String haystack, String needle) {
		char[] t = haystack.toCharArray();
		char[] p = needle.toCharArray();
		int i = 0;
		int j = 0;
		while (i < t.length && j < p.length) {
			// 当两个字符相同，就比较下一个
			if (t[i] == p[j]) {
				i++;
				j++;
			}
			// 一旦不匹配，i回溯，j归0
			else {
				i = i - j + 1;
				j = 0;
			}
		}

		if (j == p.length) {
			return i - j;
		} else {
			return -1;
		}
	}

	/**
	 * KMP法
	 * 
	 * @param haystack
	 *            主串
	 * @param needle
	 *            模式串
	 * @return 如果找到，返回在主串中第一个字符出现的下标，否则为-1
	 */
	public static int kmpSubStr(String haystack, String needle) {
		char[] t = haystack.toCharArray();
		char[] p = needle.toCharArray();
		int i = 0;
		int j = 0;
		int[] next = getNext(needle);
		while (i < t.length && j < p.length) {
			// 当两个字符相同，就比较下一个，当j为-1时，要移动的是i，当然j也要归0
			if (j == -1 || t[i] == p[j]) {
				i++;
				j++;
			}
			// j回到指定位置
			else {
				j = next[j];
			}
		}

		if (j == p.length) {
			return i - j;
		} else {
			return -1;
		}
	}

	/**
	 * 求解next数组
	 * next数组其实就是查找needle中每一位前面的子串的前后缀有多少位匹配，从而决定j失配时应该回退到哪个位置
	 * 
	 * @param needle 模式串
	 * @return
	 */
	public static int[] getNext(String needle) {
		char[] p = needle.toCharArray();
		int[] next = new int[p.length];
		if (next.length > 0) {
			next[0] = -1;
		} else {
			return next;
		}
		int j = 0;
		int k = -1;
		while (j < p.length - 1) {
			if (k == -1 || p[j] == p[k]) {
				// 当两个字符相等时要跳过
				if (p[++j] == p[++k]) {
					next[j] = next[k];
				} else {
					next[j] = k;
				}
			} else {
				k = next[k];
			}
		}
		return next;
	}

}
