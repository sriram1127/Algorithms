
public class Mine {
	public static void main(String[] args) {
		String input[][] = new String[][] { { ".", "m", ",", "." }, { ".", ".", ",", "." }, { ".", ".", ",", "m" },
				{ "m", ".", ",", "." } };
		int op[][] = solveMinesweeper(input);
		for (int i = 0; i < op.length; i++) {
			for (int j = 0; j < op[0].length; j++) {
				System.out.print(op[i][j]);
			}
			System.out.println();
		}
	}

	static int[][] solveMinesweeper(String[][] puzzleArray) {
		String m = "m";
		int a = puzzleArray.length;
		int b = puzzleArray[0].length;
		int[][] result = new int[a][b];
		// 1
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {

				if (i > 0 && puzzleArray[i - 1][j].equals(m))
					result[i][j] += 1;

				if (i < a - 1 && puzzleArray[i + 1][j].equals(m))
					result[i][j] += 1;

				if (j > 0 && puzzleArray[i][j - 1].equals(m))
					result[i][j] += 1;

				if (j < b - 1 && puzzleArray[i][j + 1].equals(m))
					result[i][j] += 1;

				if (i < a - 1 && j < b - 1 && puzzleArray[i + 1][j + 1].equals(m))
					result[i][j] += 1;

				if (i > 0 && j > 0 && puzzleArray[i - 1][j - 1].equals(m))
					result[i][j] += 1;

				if (i > 0 && j < b - 1 && puzzleArray[i - 1][j + 1].equals(m))
					result[i][j] += 1;

				if (i < a - 1 && j > 0 && puzzleArray[i + 1][j - 1].equals(m))
					result[i][j] += 1;
			}
		}
		// 2
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {

				if (i < a - 1 && puzzleArray[i][j].equals(m))
					result[i + 1][j] = 2;

			}
		}
		// 3
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (j < b - 1 && puzzleArray[i][j].equals(m))
					result[i][j + 1] = 0;
			}
		}
		// 4
		boolean ismine = false;
		for (int i = 1; i < a; i = i + 2) {
			ismine = false;
			for (int j = 0; j < b; j++) {
				if (puzzleArray[i][j].equals(m))
					ismine = true;
			}
			if (ismine) {
				for (int j = 0; j < b; j++) {
					result[i][j] *= 3;
				}
			}
		}
		// 5
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {

				if ((i < a - 1 && j < b - 1 && puzzleArray[i + 1][j + 1].equals(m))
						|| (i > 0 && j > 0 && puzzleArray[i - 1][j - 1].equals(m))
						|| (i > 0 && j < b - 1 && puzzleArray[i - 1][j + 1].equals(m))
						|| (i < a - 1 && j > 0 && puzzleArray[i + 1][j - 1].equals(m))) {
					result[i][j] *= 2;
				}

			}
		}
		// 6
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (puzzleArray[i][j].equals(m)) {
					result[i][j] = -1;
				}
			}
		}

		return result;
	}

}
