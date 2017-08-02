package hardquestions;

public class MedianOfTwoSortedArraysSolution {

	/*public static void main(String[] args) {
		int[] nums1 = {2, 4, 8};
		int[] nums2 = {1, 3, 5, 7};

		System.out.print(findMedianSortedArrays(nums1, nums2));
	}*/

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double medianOne = 0.0;
		double medianTwo = 0.0;
		int totalLength = nums1.length + nums2.length;

		if (nums1.length == 0) {
			return oneEmptyArray(nums2);
		}
		else if (nums2.length == 0) {
			return oneEmptyArray(nums1);
		}
		else if (totalLength % 2 == 0) {
			medianOne = (double) medianRecursive(nums1, nums2, 0, 0, nums1.length, nums2.length, totalLength / 2);
			medianTwo = (double) medianRecursive(nums1, nums2, 0, 0, nums1.length, nums2.length, (totalLength / 2) + 1);
			return (medianOne + medianTwo) / 2;
		}
		else {
			return medianRecursive(nums1, nums2, 0, 0, nums1.length, nums2.length, (totalLength + 1) / 2);
		}
	}

	public int medianRecursive(int nums1[], int nums2[], int initialNums1, int initialNums2, int finalNums1, int finalNums2, int desiredElement) {

		int distanceNums1 = finalNums1 - initialNums1;
		int distanceNums2 = finalNums2 - initialNums2;
		int middleOfNums1 = (initialNums1 + finalNums1) / 2;
		int middleOfNums2 = (initialNums2 + finalNums2) / 2;

		if (distanceNums1 <= 0) {
			return nums2[initialNums2 + desiredElement - 1];
		}
		if (distanceNums2 <= 0) {
			return nums1[initialNums1 + desiredElement - 1];
		}
		if (desiredElement == 1) {
			if (nums1[initialNums1] < nums2[initialNums2]) {
				return nums1[initialNums1];
			}
			else {
				return nums2[initialNums2];
			}
		}

		if (nums1[middleOfNums1] <= nums2[middleOfNums2]) {
			if (desiredElement <= distanceNums1 / 2 + distanceNums2 / 2 + 1) {
				return medianRecursive(nums1, nums2, initialNums1, initialNums2, finalNums1, middleOfNums2, desiredElement);
			}
			else {
				return medianRecursive(nums1, nums2, middleOfNums1 + 1, initialNums2, finalNums1, finalNums2, desiredElement - distanceNums1 / 2 - 1);
			}
		}
		else {
			if (desiredElement <= distanceNums1 / 2 + distanceNums2 / 2 + 1) {
				return medianRecursive(nums1, nums2, initialNums1, initialNums2, middleOfNums1, finalNums2, desiredElement);
			}
			else {
				return medianRecursive(nums1, nums2, initialNums1, middleOfNums2 + 1, finalNums1, finalNums2, desiredElement - distanceNums2 / 2 - 1);
			}	
		}
	}

	public double oneEmptyArray(int[] nums) {

		if (nums.length % 2 == 0) {
			return (double)(nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2;
		}
		else {
			return nums[nums.length / 2];
		}
	}
}