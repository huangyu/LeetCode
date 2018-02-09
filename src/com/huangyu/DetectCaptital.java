package com.huangyu;

/**
 * 520. Detect Capital
 * 
 * @author huangyu
 *
 */
public class DetectCaptital {
	
	public boolean detectCapitalUse(String word) {
		return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
	}
	
}
