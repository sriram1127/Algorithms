package backtracking;

public class Sudoku {
	public static void main(String[] args) {
		new Sudoku().solveSudoku(new char[][] { { '.', '.', '9', '7', '4', '8', '.', '.', '.' },
				{ '7', '.', '.', '.', '.', '.', '.', '.', '.' }, { '.', '2', '.', '1', '.', '9', '.', '.', '.' },
				{ '.', '.', '7', '.', '.', '.', '2', '4', '.' }, { '.', '6', '4', '.', '1', '.', '5', '9', '.' },
				{ '.', '9', '8', '.', '.', '.', '3', '.', '.' }, { '.', '.', '.', '8', '.', '3', '.', '2', '.' },
				{ '.', '.', '.', '.', '.', '.', '.', '.', '6' }, { '.', '.', '.', '2', '7', '5', '9', '.', '.' } });
	}

	public void solveSudoku(char[][] board) {
		boolean[][] unfilled = new boolean[board.length][board[0].length];
		checkUnfilled(unfilled, board);
		solve(unfilled, board, '9', 0, 0);
	}

	private boolean solve(boolean[][] unfilled, char[][] board, char n, int row, int col) {
		if (n - '0' <= row || n - '0' <= col)
			return true;
		if (!unfilled[row][col]) {
			if (col == 8) {
				col = -1;
				row = row + 1;
			}
			return solve(unfilled, board, n, row, col + 1);
		}
		for (char i = '1'; i <= n; i++) {
			if (safe(board, n, row, col, i)) {
				board[row][col] = i;
				if (col == 8) {
					if (solve(unfilled, board, n, row + 1, 0)) {
						return true;
					} else {
						board[row][col] = '.';
					}
				} else {
					if (solve(unfilled, board, n, row, col + 1)) {
						return true;
					} else {
						board[row][col] = '.';
					}
				}
			}
		}
		return false;
	}

	private boolean safe(char[][] board, char n, int row, int col, char v) {
		for (char i = '0'; i < n; ++i) {
			if (board[i - '0'][col] == v)
				return false;
		}
		for (char j = '0'; j < n; ++j) {
			if (board[row][j - '0'] == v)
				return false;
		}
		row = (row / 3) * 3;
		col = (col / 3) * 3;
		if (board[row][col] == v || board[row][col + 1] == v || board[row + 1][col] == v || board[row][col + 2] == v
				|| board[row + 2][col] == v || board[row + 1][col + 1] == v || board[row + 2][col + 1] == v
				|| board[row + 1][col + 2] == v || board[row + 2][col + 2] == v)
			return false;
		return true;

	}

	private void checkUnfilled(boolean[][] unfilled, char[][] board) {
		for (int i = 0; i < board.length; ++i) {
			for (int j = 0; j < board[0].length; ++j) {
				if (board[i][j] == '.')
					unfilled[i][j] = true;
			}
		}
	}
}
