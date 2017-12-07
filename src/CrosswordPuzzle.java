
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CrosswordPuzzle {

	private static boolean func(ArrayList<String> words, ArrayList<Integer[]> up, ArrayList<Integer[]> down, HashSet<String> madeup,
			char[][] square) {
		if (madeup.size() == words.size()) {
			show(square);
			return true;
		}
		for (String word : words) {
			if (!madeup.contains(word)) {
				for (Integer[] sit : up) {
					int row = sit[0];
					int col = sit[1];
					boolean isfine = true;
					char[] store = Arrays.copyOf(square[row], 10);
					for (int i = col; i < col + word.length(); i++) {
						if (i > 9 || square[row][i] == '+'
								|| (square[row][i] != '-' && square[row][i] != word.charAt(i - col))) {
							isfine = false;
							break;
						}
						square[row][i] = word.charAt(i - col);
					}
					if (isfine) {
						madeup.add(word);
						boolean found = func(words, up, down, madeup, square);

						if (found) {
							return true;
						}

						madeup.remove(word);
					}
					square[row] = Arrays.copyOf(store, 10);
				}

				for (Integer[] sit : down) {
					int row = sit[0];
					int col = sit[1];
					boolean isOkie = true;
					char[] backup = new char[10];
					for (int r = 0; r < 10; r++) {
						backup[r] = square[r][col];
					}
					for (int i = row; i < row + word.length(); i++) {
						if (i >= 10 || square[i][col] == '+'
								|| (square[i][col] != '-' && square[i][col] != word.charAt(i - row))) {
							isOkie = false;
							break;
						}
						square[i][col] = word.charAt(i - row);
					}
					if (isOkie) {
						madeup.add(word);
						boolean found = func(words, up, down, madeup, square);

						if (found) {
							return true;
						}
						madeup.remove(word);
					}
					for (int r0 = 0; r0 <= 9; r0++) {
						square[r0][col] = backup[r0];
					}
				}

			}
		}

		return false;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		ArrayList<Integer[]> up = new ArrayList<Integer[]>();
		ArrayList<Integer[]> down = new ArrayList<Integer[]>();
		ArrayList<String> words = new ArrayList<String>();
		char[][] square = new char[10][10];
		for (int r = 0; r <= 9; r++) {
			square[r] = in.next().toCharArray();
		}
		String[] warray = in.next().split(";");

		for (String word : warray) {
			words.add(word);
		}
		for (int r0 = 0; r0 < 10; r0++) {
			for (int ch = 0; ch < 10; ch++) {
				if (square[r0][ch] == '-') {
					int init = ch;
					while (init > 0 && square[r0][init - 1] == '-') {
						init--;
					}
					up.add(new Integer[] { r0, init });
					init = r0;
					while (init > 0 && square[init - 1][ch] == '-') {
						init--;
					}
					down.add(new Integer[] { init, ch });
				}
			}
		}

		func(words, up, down, new HashSet<String>(), square);
	}

	private static void show(char[][] board) {
		for (int r = 0; r <= 9; r++) {
			System.out.println(new String(board[r]));
		}
	}

}