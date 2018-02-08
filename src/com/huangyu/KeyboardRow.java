package com.huangyu;

import java.util.ArrayList;
import java.util.List;

/**
 * 500. Keyboard Row
 * 
 * @author huangyu
 *
 */
public class KeyboardRow {

	String[] rows = new String[] { "QWERTYUIOPqwertyuiop", "ASDFGHJKLasdfghjkl", "ZXCVBNMzxcvbnm" };

	public String[] findWords(String[] words) {
		List<String> resultList = new ArrayList<>();
		for (String word : words) {
			if (isInSameRow(word)) {
				resultList.add(word);
			}
		}
		return resultList.toArray(new String[resultList.size()]);
	}

	public boolean isInSameRow(String word) {
		int lastRow = -1;
		for (char c : word.toCharArray()) {
			int row = getCharInRow(Character.toString(c));
			if (lastRow != -1 && lastRow != row) {
				return false;
			}
			lastRow = row;
		}
		return true;
	}

	public int getCharInRow(String s) {
		for (int i = 0; i < rows.length; i++) {
			if (rows[i].contains(s)) {
				return i;
			}
		}
		return -1;
	}

}
