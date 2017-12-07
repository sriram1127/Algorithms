
public class TwoDKadaneAlgo {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, -1, -4, -20 }, { -8, -3, 4, 2, 1 }, { 3, 8, 10, 1, 3 }, { -4, -1, 1, 7, -6 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println();
		}

		System.out.println(getMaxSum(arr));

	}

	private static int getMaxSum(int[][] arr) {
		int tempArr[] = new int[arr.length];
		// int currentSum = arr[0][0];
		// int maxSum = arr[0][0];
		int currentSum = Integer.MIN_VALUE;
		int maxSum = Integer.MIN_VALUE;
		int left = 0;
		int right = 0;
		int up = 0;
		int down = 0;
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (j >= i) {
					if (i == j) {
						for (int k = 0; k < arr.length; k++)
							tempArr[k] = arr[k][j];
					} else {
						for (int k = 0; k < arr.length; k++)
							tempArr[k] += arr[k][j];
					}

					int start = 0;
					int end = 0;
					int tempSum, tempMaxSum;
					tempSum = tempMaxSum = tempArr[0];

					for (int l = 1; l < arr.length; l++) {
						if (tempSum + tempArr[l] > tempArr[l]) {
							tempSum = tempSum + tempArr[l];
							if (tempSum + tempArr[l] > tempSum) {
								end = l;
							}
						} else {
							tempSum = tempArr[l];
							start = end = l;
						}
						tempMaxSum = tempSum > tempMaxSum ? tempSum : tempMaxSum;
					}
					currentSum = tempMaxSum;
					if (maxSum < currentSum) {
						maxSum = currentSum;
						up = start;
						down = end;
						left = i;
						right = j;
					}
				}
			}
		}

		System.out.println(up + " " + down + " " + left + " " + right + " ");
		return maxSum;
	}
}
