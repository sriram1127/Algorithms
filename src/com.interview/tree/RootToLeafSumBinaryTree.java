package com.tree;

import java.util.*;

public class RootToLeafSumBinaryTree {
	static List<Node> nodes = new ArrayList<Node>();

	public static void main(String[] args) {
		Node tree = new Node(5);
		Node treeLeft = new Node(4);
		Node ll = new Node(3);
		Node treeRight = new Node(6);
		tree.l = treeLeft;
		tree.r = treeRight;
		treeLeft.l = ll;
		List<Node> nodes = new ArrayList<Node>();
		System.out.println(checkSum(tree, 12));
		System.out.println();
	}

	public static boolean checkSum(Node node, int v) {
		if (node != null) {
			if (v - node.value == 0 && node.l == null && node.r == null) {
				nodes.add(node);
				return true;
			}

			if (checkSum(node.l, v - node.value)) {
				nodes.add(node);
				return true;
			} else if (checkSum(node.r, v - node.value)) {
				nodes.add(node);
				return true;
			}
		}

		return false;
	}

}
