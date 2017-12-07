package com.tree;

public class LowestCommonAncestorBinaryTree {
	public static void main(String[] args) {
		Node tree = new Node(5);
		Node treeLeft = new Node(4);
		Node ll = new Node(6);
		Node treeRight = new Node(6);
		tree.l = treeLeft;
		tree.r = treeRight;
		treeLeft.l = ll;
		System.out.println(LCA(tree, 6, 6));
	}

	public static Integer LCA(Node node, int v1, int v2) {
		Integer left = null;
		Integer right = null;
		if (node == null)
			return null;
		if (node.value == v1 || node.value == v2)
			return node.value;
		left = LCA(node.l, v1, v2);
		right = LCA(node.r, v1, v2);
		if (left != null && right != null)
			return node.value;
		if (left != null)
			return left;
		if (right != null)
			return left;

		return left != null ? left : right;
	}
}
