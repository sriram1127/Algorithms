import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		/*
		 * String s = "ssSs"; StringBuffer sb = new StringBuffer(s); sb.replace('s',
		 * '5'); sb.replace('S', '5'); // s.re System.out.println(s);
		 */
		String[] results = strengthenPasswords(
				new String[] { "GoCardinals", "Doge", "nExTcapITalxnextcapital", "ThreeSThree" });

		// String[] results = strengthenPasswords(new String[] { "Doge" });

		for (String string : results) {
			System.out.println(string);
		}

	}

	static String[] strengthenPasswords(String[] passwords) {
		String[] results = new String[passwords.length];
		int middle = 0;
		int length = 0;
		String result = null;
		char c = '\0';
		for (int i = 0; i < passwords.length; ++i) {
			result = passwords[i];
			if (result != null && !result.trim().equals("")) {
				length = result.length();
				// 1
				result = result.replace('s', '5');
				result = result.replace('S', '5');
				// 2

				if (result.length() > 1 && result.length() % 2 == 1) {
					middle = result.length() / 2;
					c = result.charAt(middle);
					if (c > '0' && c <= '9') {
						result = result.substring(0, middle) + (2 * Integer.parseInt(c + ""))
								+ result.substring(middle + 1, result.length());
					}
				}
				// 3
				length = result.length();
				if (length > 1 && length % 2 == 0) {

					char first = result.charAt(length - 1);
					char last = result.charAt(0);
					first = Character.isUpperCase(first) ? Character.toLowerCase(first) : Character.toUpperCase(first);
					last = Character.isUpperCase(last) ? Character.toLowerCase(last) : Character.toUpperCase(last);
					result = first + result.substring(1, length - 1) + last;

				}

				// 4
				int index = result.toLowerCase().indexOf("nextcapital");
				if (index != -1) {
					String temp = new StringBuffer(result.substring(index, index + 4)).reverse().toString();
					result = result.substring(0, index) + temp + result.substring(index + 4, result.length());
				}
			}
			results[i] = result;
		}
		return results;
	}
}
