import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Elevator {
	public static void main(String[] args) {

		int[] A = new int[] { 60, 80, 40 };
		int[] B = new int[] { 2, 3, 5 };
		int M = 5;
		int X = 2;
		int Y = 200;
		System.out.println(solution(A, B, M, X, Y));
		// 5


		A = new int[] { 40, 40, 100, 80, 20 };
		B = new int[] { 3, 3, 2, 2, 3 };
		M = 3;
		X = 5;
		Y = 200;
		System.out.println(solution(A, B, M, X, Y));
		// 6

		A = new int[] { 40, 40, 100, 200, 20 };
		B = new int[] { 3, 3, 2, 2, 3 };
		M = 3;
		X = 5;
		Y = 200;
		System.out.println(solution(A, B, M, X, Y));
		// 7

		A = new int[] { 40, 40, 100, 200, 20 };
		B = new int[] { 3, 3, 2, 2, 3 };
		M = 3;
		X = 1;
		Y = 200;
		System.out.println(solution(A, B, M, X, Y));
		// 10
	}

	public static int solution(int[] A, int[] B, int M, int X, int Y) {
		return solve(A, B, M, X, Y);
	}

	private static int solve(int[] weights, int[] floorStops, int totalFloors, int liftCapacity, int liftWeight) {
		Set<Integer> levels = new HashSet<Integer>();
		int length = weights.length;
		int index = 0;
		int stops = 0;
		int capacity = 0;
		long totalWeight = 0;
		while (index < length) {
			totalWeight = 0;
			capacity = 0;
			levels.clear();
			while (capacity < liftCapacity && index < length && (totalWeight + weights[index] <= liftWeight)) {
				totalWeight += weights[index];
				levels.add(floorStops[index++]);
				++capacity;
			}
			stops += levels.size() + 1;
		}
		return stops;
	}
}
