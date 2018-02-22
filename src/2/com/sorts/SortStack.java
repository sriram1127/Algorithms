package com.sorts;

import java.util.Stack;

public class SortStack {
	public static void main(String[] args) {
		Stack<Integer> o = new Stack<Integer>();
		o.push(91);
		o.push(7);
		o.push(4);
		o.push(11);
		o.push(8);
		System.out.println(new SortStack().sort(o));
	}

	public Stack sort(Stack<Integer> stack) {
		Stack<Integer> temp = new Stack<Integer>();
		Integer ele = null;
		while (!stack.isEmpty()) {
			ele = stack.pop();
			while (!temp.isEmpty() && temp.peek() > ele) {
				stack.push(temp.pop());
			}
			temp.push(ele);
		}
		return temp;
	}
}
