import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MatrixRotation {
	static int[][] a;
	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		a = new int[row][col];
		int rotate = scanner.nextInt() * -1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		int n = a.length - 1;
		int m = a[0].length - 1;
		int start = 0;
		int end = Math.min(n, m) / 2;
		do {
			func(start++, rotate, n--, m--);
		} while (start <= end);
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void func(int start, int rotate, int n, int m) {
		for (int i = start, j = start; j <= m; j++) {

			list.add(a[i][j]);
		}
		for (int i = start + 1, j = m; i <= n - 1; i++) {

			list.add(a[i][j]);
		}
		for (int i = n, j = m; j >= start; --j) {

			list.add(a[i][j]);
		}
		for (int i = n - 1, j = start; i > start; --i) {

			list.add(a[i][j]);
		}
		Collections.rotate(list, rotate);
		int index = 0;
		for (int i = start, j = start; j <= m; j++) {
			a[i][j] = list.get(index);
			++index;
		}
		for (int i = start + 1, j = m; i <= n - 1; i++) {
			a[i][j] = list.get(index);
			++index;
		}
		for (int i = n, j = m; j >= start; --j) {
			a[i][j] = list.get(index);
			++index;
		}
		for (int i = n - 1, j = start; i > start; --i) {
			a[i][j] = list.get(index);
			++index;
		}
		list.clear();
	}

}
