
public class BSTTree {

	public static void main(String[] args) {
		// Treec tree = null;
		Tree tree = new Tree(5);
		Tree treeLeft = new Tree(4);
		Tree ll = new Tree(3);
		Tree treeRight = new Tree(6);
		tree.l = treeLeft;
		tree.r = treeRight;
		treeLeft.l = ll;
		dft(tree);

	}

	public static void dft(Tree T) {
		if (T == null)
			return;
		System.out.println(T.v);
		dft(T.l);
		dft(T.r);

	}

}
