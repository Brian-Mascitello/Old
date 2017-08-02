package easyquestions;

import java.util.ArrayList;

public class ZigZagConversionSolution {

	public String convert(String s, int numRows) {

		boolean forwards = true;
		int current = 0;
		String solution = "";
		ArrayList<String> ranks = new ArrayList<String>(numRows);

		if (numRows < 2 || numRows >= s.length()) {
			return s;
		}

		for (int index = 0; index < s.length(); index++) {
			
			if (ranks.size() <= current) {
				ranks.add(current, Character.toString(s.charAt(index)));
			}
			else {
				ranks.set(current, ranks.get(current) + s.charAt(index));
			}

			if (forwards) {
				current++;
				if (current == numRows - 1) {
					forwards = !forwards;
				}
			}
			else {
				current--;
				if (current == 0) {
					forwards = !forwards;
				}
			}
		}

		for (int rowIndex = 0; rowIndex < numRows; rowIndex++) {
			solution += ranks.get(rowIndex);
		}

		return solution;
	}
}