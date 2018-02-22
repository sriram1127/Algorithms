
public class AppearOnce {
	public static void main(String[] args) {
		int b[] = { 2, 2, 3 };
		int a[] = { 0, 0 };
		int result = 0;
		for (int i = 0; i < a.length; ++i) {
			result ^= a[i];
		}
		System.out.println(result);
		char o = 'a' +1 ;
		System.out.println(o);
	}

}
