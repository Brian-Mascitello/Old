package mediumquestions;

public class TwoSumSolution {
	
	public int[] twoSum(int[] nums, int target) {
		// Finds the indices of two numbers which sum to equal the target integer.
		
        int[] sumArray = new int[2]; // new two-index array to use as a return condition
		
		for (int a = 0; a < nums.length - 1; a++) {
			for (int b = a + 1; b < nums.length; b++) {
				if (nums[a] + nums[b] == target) {
					sumArray[0] = a+1;
					sumArray[1] = b+1;
					return sumArray;
				}
			}
		}
		
		return sumArray;
    }
}
