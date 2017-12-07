package com.saggezza;

public class SeparateNumbers {
	public static void main(String[] args) {
		System.out.println(separate("99100"));
	}

	private static String separate(String s) {
		long init = 0;
		long end = 0;
		long length = 0;
		long n1 = 0;
		long n2 = 0;
		long tempEnd = 0;
		boolean found = true;
		StringBuffer sb = new StringBuffer(s);
		for (int i = 1; i <= s.length() / 2; i++) {
			length = i;
			found = true;
			init = 0;
			end = init + length;
			while (end < s.length()) {
				n1 = Long.parseLong(sb.substring((int) init, (int) end));
				tempEnd = end + (String.valueOf(n1 + 1).length());
				if (tempEnd > s.length()) {
					found = false;
					break;
				}
				n2 = Long.parseLong(sb.substring((int) end, (int) tempEnd));
				if (n1 != n2 - 1) {
					found = false;
					break;
				}
				init = end;
				end = tempEnd;
			}
			if (found) {
				return ("YES" + " " + sb.substring(0, i));
			}
		}
		return "NO";
	}
}
