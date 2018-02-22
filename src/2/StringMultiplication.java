public class StringMultiplication {
	public static void main(String args[]) {
		String str1 = "0";
		String str2 = "99";
		int z = 0;
		int[] result = new int[str1.length() + str2.length()];
		for (int i = str1.length() - 1, j = str2.length() - 1, in = 0; j > -1; j--, ++in) {
			z = result.length - 1 - in;
			for (; i > -1; i--, --z) {
				result[z] += (str1.charAt(i) - '0') * (str2.charAt(j) - '0');
			}
			i = str1.length() - 1;
		}
		int temp = 0;
		for (int i = result.length - 1; i > -1; --i) {
			if (result[i] > 9) {
				temp = result[i];
				result[i] = result[i] % 10;
				result[i - 1] += temp / 10;
			}
			temp = 0;
		}
		for (int i : result) {
			System.out.print(i);
		}
	}
}