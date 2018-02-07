package com.huangyu;

/**
 * 657. Judge Route Circle
 * 
 * @author huangyu
 *
 */
public class JudgeRouteCircle {

	public boolean judgeCircle(String moves) {
		int[] positions = new int[2];
		positions[0] = 0;
		positions[1] = 1;
		for (char move : moves.toCharArray()) {
			switch (move) {
			case 'L':
				positions[0]--;
				break;
			case 'R':
				positions[0]++;
				break;
			case 'U':
				positions[1]++;
				break;
			case 'D':
				positions[0]--;
				break;
			}
		}

		if (positions[0] == 0 && positions[1] == 1) {
			return true;
		} else {
			return false;
		}
	}

}
