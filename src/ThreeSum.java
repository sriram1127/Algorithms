import java.util.*;

public class ThreeSum {
	public static void main(String[] args) {
		double sum = 0;
		int secondNumber = 0;
		int thirdNumber = 0;
		//double[] numbers = { -1, 0, 1, 2, -1, -4 };
		double[] numbers = { -4,-1,-1,0,2,2 };
		List<double[]> result = new ArrayList<double[]>();

		Arrays.sort(numbers);

		for (int i = 0; i < numbers.length - 2; i++) {
			if (i == 0 || numbers[i] != numbers[i - 1]) {
				secondNumber = i + 1;
				thirdNumber = numbers.length - 1;

				while (secondNumber < thirdNumber) {
					if (numbers[i] + numbers[secondNumber] + numbers[thirdNumber] == sum) {
						result.add(new double[] { numbers[i], numbers[secondNumber], numbers[thirdNumber] });
						++secondNumber;
					} else {
						if (numbers[i] + numbers[secondNumber] + numbers[thirdNumber] > sum) {
							--thirdNumber;
						} else {
							++secondNumber;
						}
					}
				}
			}
		}
		for (double[] ds : result) {
			for (int i = 0; i < ds.length; i++) {
				System.out.print(ds[i] + ", ");
			}
			System.out.println();
		}

	}

}
