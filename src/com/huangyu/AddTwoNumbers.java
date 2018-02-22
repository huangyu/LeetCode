package com.huangyu;

import com.huangyu.bean.ListNode;

/**
 * 2. Add Two Numbers
 * 
 * @author huangyu
 *
 */
public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode node = new ListNode(0);
		ListNode head = node;
		ListNode n1 = l1;
		ListNode n2 = l2;
		int val1, val2, carry = 0, sum = 0, remainder = 0;
		while (n1 != null || n2 != null || carry != 0) {
			val1 = n1 == null ? 0 : n1.val;
			val2 = n2 == null ? 0 : n2.val;
			sum = val1 + val2 + carry;
            remainder = sum % 10;
            carry = sum / 10;
			ListNode next = new ListNode(remainder);
			node.next = next;
			node = next;

			n1 = n1 == null ? null : n1.next;
			n2 = n2 == null ? null : n2.next;
		}
		return head.next;
	}

}
