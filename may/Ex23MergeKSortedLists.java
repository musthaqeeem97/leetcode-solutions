package may;

import java.util.PriorityQueue;

public class Ex23MergeKSortedLists {

	class ListNode {
		
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public ListNode mergeKLists(ListNode[] lists) {
        
		PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val - b.val);
		
		
		for (ListNode listNode : lists) {
			
			if (listNode!=null) {
				pq.add(listNode);
			}
		}
		ListNode dummy = new ListNode(-1);
		ListNode current = dummy;
		
		while(!pq.isEmpty()) {
			
			ListNode minNode = pq.poll();	
			current.next = minNode;
			current = current.next;
			
			if (minNode.next!=null) {
				pq.add(minNode.next);
			}
		}
		return dummy.next;
    }
	
}
