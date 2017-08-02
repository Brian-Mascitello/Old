package easyquestions;

public class ReverseIntegerSolution {

	public int reverse(int x) {

		// x is a single digit.
		if (x > -10 && x < 10) {
			return x;
		}

		int reversed = 0; // Going to be used for return value.

		// Reduces x if it has trailing zeroes. x = 100 becomes x = 1.
		while (x % 10 == 0) {
			x /= 10;
		}

		if (String.valueOf(x).length() > 9) {
			while (x != 0) {
				if (reversed != 0 && Integer.MAX_VALUE / reversed > -10 && Integer.MAX_VALUE / reversed < 10) {
					return 0;
				}

				reversed = (reversed * 10) + (x % 10);
				x /= 10;
			}
		}
		else {
			while (x != 0) {				
				reversed = (reversed * 10) + (x % 10);
				x /= 10;
			}
		}

		return reversed;
	}
}