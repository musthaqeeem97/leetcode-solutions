package may;

public class Ex02AddingTwoNumbers {
	

	 public class ListNode {
		 int val;
	     ListNode next;
	     
	     ListNode() {
	    	 
	     }
	     ListNode(int val) { 
	    	 this.val = val; 
	    	 }
	     ListNode(int val, ListNode next) {
	    	 this.val = val;
	    	 this.next = next;
	    	 }
	  }

	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		
		int carry = 0;
		while (l1!=null || l2!=null) {
			int x = l1!=null?l1.val:0;
			int y = l2!=null?l2.val:0;
			
			int sum = x+y+carry;
			carry = sum/10;
			
			tail.next = new ListNode(sum%10);
			tail = tail.next;
			
			if(l1!=null) l1=l1.next;
			if(l2!=null)l2=l2.next;
		
		}
		// check whether there is any carry 
		if (carry>0)tail.next = new ListNode(carry);
		
		return dummy.next;
	  }
}

/*
 
Example 1:
  2->4->3
  5->6->4
   
  7->0->8
   
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 */