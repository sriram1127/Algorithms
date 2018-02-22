import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Flower {
	public static void main(String[] args) {
		int input[][] = new int[][] { { 1, 10 }, { 1, 6 }, { 2, 8 }, { 4, 5 } };
		System.out.println(maxFlorists(9, input));

		// int input[][] = new int[][] { { 0, 5 }, { 0, 5 }, { 4, 9 }, { 3, 9 }, { 0, 2
		// } };
		// System.out.println(maxFlorists(5, input));
	}

	static int maxFlorists(int pathLength, int[][] floristIntervals) {
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();
		for (int i = 0; i < floristIntervals.length; i++) {
			list.add(new Integer[] { floristIntervals[i][0], floristIntervals[i][1] });
		}
		Collections.sort(list, new Comparator<Integer[]>() {
			public int compare(Integer[] a, Integer[] b) {
				if ((a[1] - a[0]) > (b[1] - b[0])) {
					return 1;
				} else if ((a[1] - a[0]) < (b[1] - b[0])) {
					return -1;
				} else {
					return 0;
				}
			}
		});

		int no = 0;

		Set<Integer> fulls = new HashSet<Integer>();
		boolean b = false;
		boolean add = true;
		int length = 0;

		for (int i = 0; i < floristIntervals.length; i++) {
			length = Math.max(length, floristIntervals[i][1]);
		}
		int count[] = new int[length];
		for (int i = 0; i < list.size(); i++) {
			Integer[] array = list.get(i);
			int start = array[0];
			int end = array[1];

			for (int j : fulls) {
				if (start <= j && j <= end) {
					add = false;
					break;
				}
			}
			if (add && start < pathLength) {
				for (int j = start; j < end; j++) {
					count[j] += 1;
					if (count[j] == 3) {
						if (!b)
							fulls.add(j);
						b = true;

					} else {
						if (b) {
							fulls.add(j - 1);
							b = false;
						}

					}
				}
				++no;
			}
			add = true;
		}

		return no;
	}
}
