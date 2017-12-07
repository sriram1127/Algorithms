
public class SmallestSubArray {
	public static void main(String[] args) {
		getSmallestSubArray(9, new int[] { 1, 10, 5, 2, 7 });
	}

	private static void getSmallestSubArray(int x, int[] arr) {
		if (arr.length != 0) {
			long minlen = arr.length + 1;
			long tempSum = 0;
			int length = 0;
			for (int i = 0, j = 0; i < arr.length && j < arr.length;) {
				tempSum += arr[j];
				if (tempSum > x) {
					minlen = Math.min(minlen, j - i + 1);
					while (i <= j) {
						if (tempSum - arr[i] > x) {
							tempSum = tempSum - arr[i];
							++i;
							minlen = Math.min(minlen, j - i + 1);
						} else {
							++j;
							break;

						}
					}
				} else {
					++j;
				}

			}
			System.out.println(minlen);
		}
		// return -1;
	}
}
