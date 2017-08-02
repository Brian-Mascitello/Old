package easyquestions;

public class AddBinarySolution {
	public static void main(String[] args) {
		//String a = "11";
		//String b = "1";
		//String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
		//String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
		String a = "1010";
		String b = "1011";
		
		System.out.print(addBinary(a, b));
	}
	
	public static String addBinary(String a, String b) {
		
		// Finds and stores the max length of the two string inputs.
		int maxLength = 0;
		if (a.length() > b.length()) {
			maxLength = a.length();
		} else {
			maxLength = b.length();
		}
		
		// Used in while loops.
		int counter = 0;
		
		// Creates integer arrays to store each element of the provided strings.
		int[] aArray = new int[maxLength];
		int[] bArray = new int[maxLength];
		
		// Carries a digit over if the sum of binaries is greater than one.
		int carryOver = 0;
		
		// Contains the summation of the binary digits.
		int currentSum = 0;
		
		// Prepares the solution string for return.
		String finalSum = "";
				
		// Fills the integer arrays with the corresponding digits of their strings.
		for (int index = maxLength - 1; index >= 0; index--) {
			if (index < a.length()) {
				aArray[a.length() - 1 - index] = Character.digit(a.charAt(index), 10);
			}
			if (index < b.length()) {
				bArray[b.length() - 1 - index] = Character.digit(b.charAt(index), 10);
			}
		}
		
		while (counter < maxLength || carryOver > 0) {
			if (counter < maxLength) {
				// Sums the array values at current index and the carryOver value.
				currentSum = aArray[counter] + bArray[counter] + carryOver;
				
				// Determines the carryOver value to take to the next iteration.
				carryOver = currentSum / 2;
				
				// Reduces the currentSum after finding the next carryOver to a zero or one.
				currentSum %= 2;
				
				// Concatenates the currentSum to the finalSum string.
				finalSum = Integer.toString(currentSum) + finalSum;	
			} else {
				// Only occurs after counter exceeds maxLength.
				finalSum = Integer.toString(carryOver) + finalSum;
				
				carryOver = 0;
			}
			counter++;
		}
		
	// Returns a string as desired.
	return finalSum;
		
	}
}