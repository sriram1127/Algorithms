package com.duo;

public class LinkedList {

	public static void main(String[] args) {
		LinkedListNode node = new LinkedListNode(4);
		LinkedListNode node1 = new LinkedListNode(4);
		LinkedListNode node2 = new LinkedListNode(7);
		LinkedListNode node3 = new LinkedListNode(2);
		LinkedListNode node4 = new LinkedListNode(9);
		LinkedListNode node5 = new LinkedListNode(5);
		node.next = node1;
		node.next = node1;
		node.next = node1;
		node.next = node1;
		node.next = node1;
		node.next = node1;
	}

	public static class LinkedListNode {
		LinkedListNode(int val){
			this.val = val;
		}
		int val;
		LinkedListNode next;
	}

	public static LinkedListNode insert(LinkedListNode head, LinkedListNode tail, int val) {

		if (head == null) {
			return head;
		}
		while (head != null && head.val > val) {
			head = head.next;
		}
		LinkedListNode temp = head;
		while (temp!= null && temp.next != null) {
			if (temp.next.val > val) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}

		}

		return head;
	}

}
