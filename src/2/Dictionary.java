import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Dictionary {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\srira\\eclipse-workspace\\Coding\\abc.txt");
		Map<Character, HashSet<Character>> map = new HashMap<Character, HashSet<Character>>();
		for (Character i = 'a'; i <= 'z'; i++) {
			map.put(i, new HashSet<Character>());
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line1 = br.readLine().trim();
		String line2 = null;
		int length = 0;
		int end = 0;
		while ((line2 = br.readLine()) != null) {
			line2 = line2.trim();
			/*if (line1.charAt(0) != line2.charAt(0)) {
				line1 = line2;
				continue;
			}*/
			length = line2.length();
			for (int i = 0; i < length; i++) {
				if (i < line1.length()) {
					if (line1.charAt(i) != line2.charAt(i)) {
						addToSet(map, line2.charAt(i), map.get(line2.charAt(i)), line1.charAt(i));
						break;
					}
				} else {
					break;
				}
			}
			line1 = line2;
		}
		br.close();
		for (Map.Entry<Character, HashSet<Character>> m : map.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue().size());
		}
	}

	private static void addToSet(Map<Character, HashSet<Character>> map, char a, HashSet<Character> set, char c) {
		if (a != c)
			set.add(c);
		set.addAll(map.get(a));
		System.out.print(a + " ");
		System.out.print(c);
		System.out.println();
	}
}
