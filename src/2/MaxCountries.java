
public class MaxCountries {
	public static void main(String args[]) {
		// int[][] in = new int[][] { { 1, 1, 1, 0 }, { 1, 1, 0, 1 }, { 0, 0, 0, 1 } };
		// int[][] in = new int[][] { { 5, 4, 4 }, { 4, 3, 4 }, { 3, 2, 4 }, { 2, 2, 2
		// }, { 3, 3, 4 }, { 1, 4, 4 },
		// { 4, 1, 1 }, };

		int[][] in = new int[][] { {} };
		System.out.println(solution(in));
	}

	public static int solution(int A[][]) {
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; ++j) {
				if (A[i][j] != Integer.MAX_VALUE) {
					++count;
					fillArea(A, i, j, A[i][j]);
				}
			}
		}
		return count;
	}

	public static void fillArea(int A[][], int i, int j, int no) {
		if (i >= 0 && j >= 0 && i < A.length && j < A[0].length && A[i][j] != Integer.MAX_VALUE && no == A[i][j]) {
			A[i][j] = Integer.MAX_VALUE;
			fillArea(A, i + 1, j, no);
			fillArea(A, i, j + 1, no);
			fillArea(A, i - 1, j, no);
			fillArea(A, i, j - 1, no);
		}
	}
}
