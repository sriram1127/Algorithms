
public class LongestPassword {

	public static void main(String args[]) {
		System.out.println(solution("test 5 a0A pass007 ?xy1"));
	}

	public static int solution(String S) {
		String input[] = S.split(" ");
		int max = -1;
		int digits = 0;
		int ch = 0;
		boolean valid = true;
		for (String s : input) {
			ch = 0;
			digits = 0;
			valid = true;
			s = s.trim();
			if (s.length() > 0) {
				for (char c : s.toCharArray()) {
					if (c >= '0' && c <= '9') {
						++digits;
					} else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
						++ch;
					} else {
						valid = false;
						break;
					}

				}
				if (ch % 2 != 0 || digits % 2 == 0) {
					valid = false;
				}
				if (valid) {
					max = Math.max(max, s.length());
				}

			}

		}

		return max;

	}

}
