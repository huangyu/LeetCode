package com.huangyu;

import java.util.ArrayList;
import java.util.List;

/**
 * 17. Letter Combinations of a Phone Number
 * 
 * @author huangyu
 *
 */
public class LetterCombinationsOfAPhoneNumber {

	String[] charArray = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<>();
		if (digits.length() == 0) {
			return result;
		}

		result.add("");
		for (char digit : digits.toCharArray()) {
			String chars = charArray[digit - '0'];
			List<String> list = new ArrayList<>();
			for (char c : chars.toCharArray()) {
				for (String r : result) {
					list.add(r + c);
				}
			}
			result = list;
		}
		return result;
	}

}
