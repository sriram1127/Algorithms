import java.util.*;

public class SocksWash {
	public static void main(String[] args) {
		solution(2, new int[] { 1, 2, 1, 1 }, new int[] { 1, 4, 3, 2, 4 });
	}

	public static int solution(int K, int[] C, int[] D) {
		Map<Integer, Integer> clean = new HashMap<Integer, Integer>();
		Map<Integer, Integer> dirty = new HashMap<Integer, Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		int count = 0;
		for (int i = 0; i < C.length; i++) {
			if (clean.get(C[i]) == null) {
				clean.put(C[i], 1);
			} else {
				clean.put(C[i], clean.get(C[i]) + 1);
			}
		}
		for (int i = 0; i < D.length; i++) {
			if (dirty.get(D[i]) == null) {
				dirty.put(D[i], 1);
			} else {
				dirty.put(D[i], dirty.get(D[i]) + 1);
			}
		}

		for (Map.Entry<Integer, Integer> item : clean.entrySet()) {
			count += item.getValue() / 2;
			if (item.getValue() % 2 != 0) {
				stack.push(item.getKey());
			}
		}
		int temp = 0;
		int c =K;
		for (; c > 0;) {
			if (stack.size() != 0) {
				while (stack.size() != 0) {
					temp = stack.pop();
					if (dirty.get(temp) != null && dirty.get(temp) != 0) {
						dirty.put(temp, dirty.get(temp) - 1);
						++count;
						--c;
						break;
					}
				}
			} else {
				break;
			}
		}

		for (Map.Entry<Integer, Integer> item : dirty.entrySet()) {
			if (c > 1) {
				if (item.getValue() % 2 == 0) {
					dirty.put(item.getKey(), item.getValue() - 2);
					++count;
					c -= 2;
				}
			} else {
				break;
			}
		}

		return count;

	}

}
