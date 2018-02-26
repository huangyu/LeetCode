package com.huangyu;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. Generate Parentheses
 * 
 * @author huangyu
 *
 */
public class GenerateParentheses {

	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
		generate("", result, n, n);
		return result;
	}

	public void generate(String str, List<String> result, int open, int close) {
        if(open > close) {
            return;
        }
        
		if (open > 0) {
			generate(str + "(", result, open - 1, close);
		}

		if (close > 0) {
			generate(str + ")", result, open, close - 1);
		}

		if (open == 0 && close == 0) {
			result.add(str);
			return;
		}
	}

}
