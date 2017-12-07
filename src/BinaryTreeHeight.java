
public class BinaryTreeHeight {
	public int solution(Tree T) {
		if (T == null) {
			return -1;
		} else {
			return height(T) - 1;
		}

	}

	private int height(Tree T) {
		if (T == null)
			return 0;
		else {
			return Math.max(height(T.l), height(T.r)) + 1;
		}

	}

}

class Tree {
	Tree(int v) {
		this.v = v;
	}

	int v;
	Tree l;
	Tree r;
}
