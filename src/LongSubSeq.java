
public class LongSubSeq {

	public static void printString(int[][] table, char char1[], char char2[]) {
		// int no = char[][];
		for (int i = table.length - 1; i > 0; --i) {
			for (int j = table[0].length -1; j > 0; --j) {
				if (table[i][j] == Math.max(table[i][j - 1], table[i - 1][j])) {
					
				} else {
					System.out.print(char1[i - 1]);
					--i;
				}
			}
		}
	}

	public static int getLongSubSeq(char char1[], char char2[]) {

		int table[][] = new int[char1.length + 1][char2.length + 1];

		for (int i = 1; i <= char1.length; i++) {

			for (int j = 1; j <= char2.length; j++) {

				if (char1[i - 1] == char2[j - 1]) {
					table[i][j] = table[i - 1][j - 1] + 1;
				} else {
					table[i][j] = Math.max(table[i][j - 1], table[i - 1][j]);
				}
			}

		}
		/*
		 * for (int[] is : table) { for (int i : is) { System.out.print(i); }
		 * System.out.println(); }
		 */
		printString(table, char1, char2);
		return table[char1.length][char2.length];

	}

	public static void main(String args[]) {
		String str1 = "abcdef";
		String str2 = "acbcf";

		// String str1 = "abcdaf";
		// String str2 = "acrtbdf";
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		System.out.println(LongSubSeq.getLongSubSeq(char1, char2));

	}

}