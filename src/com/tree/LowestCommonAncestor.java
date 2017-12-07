package com.tree;

public class LowestCommonAncestor {

	public static void main(String[] args) {
		Node tree = new Node(5);
		Node treeLeft = new Node(4);
		Node ll = new Node(3);
		Node treeRight = new Node(6);
		tree.l = treeLeft;
		tree.r = treeRight;
		treeLeft.l = ll;
		System.out.println(LCA(tree, 4, 3).value);
	}

	public static Node LCA(Node node, int v1, int v2) {
		if (node.value > Math.max(v1, v2))
			return LCA(node.l, v1, v2);
		else if (node.value < Math.min(v1, v2))
			return LCA(node.r, v1, v2);
		else
			return node;
	}

}

class Node {
	Node(int v) {
		this.value = v;
	}

	int value;
	Node l;
	Node r;
}