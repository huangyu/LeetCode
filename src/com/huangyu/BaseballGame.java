package com.huangyu;

import java.util.Stack;

/**
 * 682. Baseball Game
 * 
 * @author huangyu
 *
 */
public class BaseballGame {

	public static int calPoints(String[] ops) {
		if (ops.length == 0) {
			return 0;
		}
		Stack<Integer> scoreStack = new Stack<>();

		int point = 0, value, last, last2;
		for (String op : ops) {
			switch (op) {
			case "C":
				last = scoreStack.pop();
				point -= last;
				break;
			case "D":
				last = scoreStack.peek();
				value = last * 2;
				point += value;
				scoreStack.push(value);
				break;
			case "+":
				last = scoreStack.pop();
				last2 = scoreStack.peek();
				value = last + last2;
				point += value;
				scoreStack.push(last);
				scoreStack.push(value);
				break;
			default:
				value = Integer.valueOf(op);
				point += value;
				scoreStack.push(value);
				break;
			}
		}
		return point;
	}

}
