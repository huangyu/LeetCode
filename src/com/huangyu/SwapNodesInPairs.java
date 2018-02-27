package com.huangyu;

import com.huangyu.bean.ListNode;

/**
 * 24. Swap Nodes in Pairs
 * 
 * @author huangyu
 *
 */
public class SwapNodesInPairs {

	public ListNode swapPairs(ListNode head) {
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode h = dummy, p, q;
        
		while (h.next != null && h.next.next != null) {
			p = h.next;
			q = h.next.next;
			p.next = q.next;
            q.next = p;
			h.next = q;

			h = h.next.next;
		}

		return dummy.next;
	}

}
