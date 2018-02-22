
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class New {
	public static void main(String args[]) throws Exception {
		int temp = 0;
		HashMap<Character, Integer> map = null;
		HashMap<Character, Integer> a = new HashMap<Character, Integer>();
		Scanner scanner = new Scanner(System.in);
		char first = 'a';
		int t = Integer.parseInt(scanner.nextLine());
		String[] result = new String[t];
		char no[] = new char[26];
		for (int i = 0; i < 26; ++i) {
			no[i] = first;
			a.put((char) first, i + 1);
			first = (char) (first + 1);
		}
		for (int i = 0; i < t; ++i) {
			
				map = new HashMap<Character, Integer>();
				int length = Integer.parseInt(scanner.nextLine());
				StringBuffer sb = new StringBuffer();
				String str = scanner.nextLine();
				for (char c : str.toCharArray()) {
					if (map.get(c) == null) {
						map.put(c, 1);
						sb.append(c);
					} else {
						temp = (a.get(c) + map.get(c));
						sb.append(no[(temp-1) % 26]);
						map.put(c, map.get(c) + 1);
					}
				}
				result[i] = sb.toString();
				result[i].split(" ");
		

		}

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
