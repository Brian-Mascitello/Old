package mediumquestions;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class AddTwoNumbersSolution {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// Continuously adds the val of two ListNodes to create a separate Linked List with the sum.
		// Each link contains a single digit, meant for numbers stored in reverse order.
		
		int carryDigit = 0; // if the sum of the two vals is 10-19, will store a 1.
		int sumDigit = 0; // keeps a running total of the sum.
		ListNode returnHead = new ListNode(0); // Creates a linked list and remembers the head for returning later.
		ListNode sumLinkList = returnHead; // Simulates the addition of digits while returnHead stays at the head of the list.
		
		while (l1 != null || l2 != null) {
			
			sumDigit = 0; // resets at each iteration.
			
			if (carryDigit > 0) {
				// adds the carry digit if it exists, and resets the carryDigit to zero.
				sumDigit += carryDigit;
				carryDigit = 0;
			}
			
			if (l1 != null) {
				// if the list l1 exists, adds the value to the sumDigit.
				sumDigit += l1.val;
				l1 = l1.next;
			}
			
			if (l2 != null) {
				// if the list l2 exists, adds the value to the sumDigit.
				sumDigit += l2.val;
				l2 = l2.next;
			}
			
			if (sumDigit > 9) {
				// increases the carryDigit to one in the LeetCode example, since 1+9+9=19 is the greatest possible value.
				// ensures sumDigit is a single digit in this case.
				carryDigit = sumDigit / 10;
				sumDigit %= 10;
			}
			
			// creates a new node with value sumDigit, and then moves into the newest node.
			sumLinkList.next = new ListNode(sumDigit);
			sumLinkList = sumLinkList.next;
		}
		
		if (carryDigit > 0) {
			// adds a final node in the case which the last l1 and l2 summed were more than 9.
			sumLinkList.next = new ListNode(carryDigit);
		}
		
		return returnHead.next;
	}

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
