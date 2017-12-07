
public class GCD {
	public static void main(String[] args) {
		System.out.println(gcd(40, 45));
		System.out.println(2 * 3 / gcd(2, 3));
	}

	public static int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return gcd(b, a % b);
	}
}
