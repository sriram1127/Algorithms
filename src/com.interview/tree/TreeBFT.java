package com.tree;

import java.util.*;

public class TreeBFT {
	public static void main(String[] args) {
		Node tree = new Node(5);
		Node treeLeft = new Node(4);
		Node ll = new Node(3);
		Node treeRight = new Node(6);
		tree.l = treeLeft;
		tree.r = treeRight;
		treeLeft.l = ll;
		BFT(tree);
	}

	public static void BFT(Node node) {
		if (node == null)
			return;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		while (queue.size() != 0) {
			Node tempnode = queue.poll();
			System.out.println(tempnode.value);
			if (tempnode.l != null)
				queue.add(tempnode.l);
			if (tempnode.r != null)
				queue.add(tempnode.r);
		}

	}

}
