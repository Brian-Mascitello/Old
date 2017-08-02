package mediumquestions;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharactersSolution {

	public int lengthOfLongestSubstring(String s) {

		if (s.length() < 3) {
			if (s.length() < 1) {
				return 0;
			}
			else if (s.length() == 1) {
				return 1;
			}
			else {
				if (s.charAt(0) == s.charAt(1)) {
					return 1;
				}
				else {
					return 2;
				}
			}
		}
		else {
			char[] convertedString = s.toCharArray();
			HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
			int leftBound = 0;
			int maximum = 0;
			int rightBound = 0;
			
			for (int index = 0; index < convertedString.length; index++) {
				if (charMap.containsKey(convertedString[index]) == false || charMap.get(convertedString[index]) < leftBound) {
					rightBound++;
				} else {
					maximum = Math.max(maximum, rightBound);
					leftBound = charMap.get(convertedString[index]) + 1;
					rightBound = index + 1 - leftBound;
				}
				charMap.put(convertedString[index], index);
			}
			
			maximum = Math.max(maximum, rightBound);
			
			return maximum;
		}
	}
}