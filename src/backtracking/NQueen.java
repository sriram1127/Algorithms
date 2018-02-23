package backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueen {

	static List<int[]> list = new ArrayList<int[]>();

	public static void main(String[] args) {
		place(8);
	}

	private static void place(int q) {
		if (placeLevel(q, 0)) {
			for (int[] p : list) {
				System.out.println(p[0] + " " + p[1]);
			}
		} else {
			System.out.println("Not possible");
		}
	}

	private static boolean placeLevel(int n, int row) {
		if (n <= row)
			return true;
		for (int i = 0; i < n; ++i) {
			if (safe(row, i)) {
				int[] temp = new int[] { row, i };
				list.add(temp);
				if (placeLevel(n, row + 1)) {
					return true;
				} else {
					list.remove(temp);
				}
			}
		}

		return false;
	}

	private static boolean safe(int row, int col) {
		for (int[] p : list) {
			if (p[0] == row || p[1] == col || (p[0] - p[1] == row - col) || (p[0] + p[1] == row + col)) {
				return false;
			}
		}
		return true;
	}

}
