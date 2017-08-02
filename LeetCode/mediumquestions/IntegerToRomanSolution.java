package mediumquestions;

public class IntegerToRomanSolution {

	public static void main(String[] args) {
		// used http://www.rapidtables.com/math/symbols/roman_numerals.htm to check test cases before running
		// figured out you can test directly in LeetCode, how cool!
		System.out.println(intToRoman(1)); // I
		System.out.println(intToRoman(18)); // XVIII
		System.out.println(intToRoman(74)); // LXXIV
		System.out.println(intToRoman(523)); // DXXIII
		System.out.println(intToRoman(2015)); // MMXV
		System.out.println(intToRoman(3999)); // MMMCMXCIX
	}
	
	public static String intToRoman(int num) {
		String romanNumeral = "";
		
		if (num > 999) {
			romanNumeral = romanNumeral.concat(romanDigit(num / 1000, "M", "", ""));
			num %= 1000;
		}
		
		if (num > 99) {
			romanNumeral = romanNumeral.concat(romanDigit(num / 100, "C", "D", "M"));
			num %= 100;
		}
		
		if (num > 9) {
			romanNumeral = romanNumeral.concat(romanDigit(num / 10, "X", "L", "C"));
			num %= 10;
		}
		
		if (num > 0) {
			romanNumeral = romanNumeral.concat(romanDigit(num, "I", "V", "X"));
		}
		
		return romanNumeral;
	}
	
	public static String romanDigit(int number, String first, String second, String third) {
		if (number == 1) {return first;}
		else if (number == 2) {return first + first;}
		else if (number == 3) {return first + first + first;}
		else if (number == 4) {return first + second;}
		else if (number == 5) {return second;}
		else if (number == 6) {return second + first;}
		else if (number == 7) {return second + first + first;}
		else if (number == 8) {return second + first + first + first;}
		else if (number == 9) {return first + third;}
		else {return "";}
	}
}
