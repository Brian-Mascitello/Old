package easyquestions;

public class MoveZeroesSolution {

	/*public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};

		moveZeroes(nums);
		for (int index = 0; index < nums.length; index ++) {
			System.out.println(nums[index]);
		}
	}*/

	public void moveZeroes(int[] nums) {
		int count = 0;
		int zeroCounter = 0;

		while (count < nums.length - zeroCounter) {
			if (nums[count] == 0) {
				System.arraycopy(nums, count + 1, nums, count, nums.length - count - 1);
				nums[nums.length - 1] = 0;
				zeroCounter++;
			}
			else {
				count++;
			}
		}
	}
}