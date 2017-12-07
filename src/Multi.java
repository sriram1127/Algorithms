import java.util.HashSet;
import java.util.Set;

public class Multi {

	public static void main(String[] args) {
		//System.out.println(multi(5, 5));
		
		Set<Integer> set = new HashSet<Integer>();
		System.out.println(set.add(1));
		System.out.println(set.add(1));
		
	}

	private static long multi(long base, long exp) {
		if (exp == 0) {
			return 1;
		}
		if (exp % 2 == 0) {
			return multi(base * base, exp / 2);
		} else {
			return base * multi(base * base, (exp - 1) / 2);
		}
	}
}
