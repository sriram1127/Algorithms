import java.util.Arrays;

public class ArrayToString {
	
	public static void main(String[] args) {
		char c [] = {'a','b','c'};
		System.out.println(c);
		System.out.println(Arrays.toString(c));
		System.out.println(new String(c));
	}

}
