import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {

		int x = 0;
		int y = 1;
		int temp = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println(x);
			temp = y;
			y = x + y;
			x = temp;
		}
	}
}
