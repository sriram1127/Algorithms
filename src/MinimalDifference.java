
public class MinimalDifference {
	public static void main(String[] args) {
		solution(new int[] { -1, 2, 3 });
	}
	// you can also use imports, for example:
	// import java.util.*;

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	public static int solution(int[] A) {
		// write your code in Java SE 8
		int left = 0;
		int right = 0;
		int min = Integer.MAX_VALUE;
		
		int temp = 0;
		for (int i = 0; i < A.length; i++) {
			right += A[i];
		}
		for (int i = 1; i < A.length; i++) {
			left += A[i-1];
			right -= A[i-1];
			temp = Math.abs(left - right);
			min = min > temp ? temp : min;
		}
		System.out.println(min);
		return min;

	}
}
