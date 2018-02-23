package com.huangyu;

/**
 * 9. Palindrome Number
 * 
 * @author huangyu
 *
 */
public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}

	public static boolean isPalindrome(int x) {
		int y = 0, r = x;
		
		while (x > 0) {
			y = y * 10 + x % 10;
			x /= 10;
		}

		return r == y;
	}

}
