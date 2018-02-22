
public class Solution {

	public static void main(String[] args) {
		System.out.println(getMin("896bb1"));
	}

	static int getMin(String s) {
		try {
		int value = Integer.parseInt(s, 16);
		double sqrt = Math.sqrt(value);
		int x = (int) sqrt;
		if(s.length() <1) {
			return -1;
		}
		if (Math.pow(sqrt, 2) == Math.pow(x, 2)) {
			return 1;
		} else {
			for (int i = 1; i < s.length(); i++) {
				String temp = s.substring(0, i);
				value = Integer.parseInt(temp, 16);
				sqrt = Math.sqrt(value);
				x = (int) sqrt;
				if (Math.pow(sqrt, 2) == Math.pow(x, 2)) {
					int te = getMin(s.substring(i, s.length()));
					if (te == -1) {
						return -1;
					}
					return 1 + te;
				}
			}

		}
		}catch(Exception e) {
			return -1;
		}
		return -1;
	}

}
