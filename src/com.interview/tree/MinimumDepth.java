package com.tree;

public class MinimumDepth {

	public static void main(String[] args) {
		Tree tree = new Tree(10);
		tree.left = new Tree(2);
		tree.right = new Tree(3);
		tree.right.left = new Tree(3);
		tree.left.left = new Tree(20);
		tree.left.right = new Tree(25);
		depth(tree);
		if (tree == null) {
			System.out.println(-1);
		} else {
			System.out.println(depth(tree)-1);
		}
	}

	public static int depth(Tree tree) {
		if (tree == null) {
			return 0;
		}

		return Math.min(depth(tree.left), depth(tree.right)) + 1;

	}
}

class Tree {

	Tree(int v) {
		this.value = v;
	}

	int value;
	Tree left;
	Tree right;
}
