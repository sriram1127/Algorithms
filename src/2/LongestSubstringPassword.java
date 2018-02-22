import java.util.HashSet;
import java.util.Set;

public class LongestSubstringPassword {

	public static void main(String[] args) {
		System.out.println(new LongestSubstringPassword().solution("12zZAa213"));
	}

	public int solution(String S) {
		int max = -1;
		String tempStr = null;
		int length = S.length();
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j <= length; j++) {
				tempStr = S.substring(i, j);
				if (checkValid(tempStr)) {
					max = Math.max(max, tempStr.length());
				}
			}
		}
		return max;
	}

	public boolean checkValid(String str) {
		boolean isVal = false;
		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				isVal = true;
			} else if (c >= '0' && c <= '9') {
				return false;
			}
		}
		return isVal;
	}

}
