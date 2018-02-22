
public class CompareVersion {

	public static void main(String[] args) {
		System.out.println(new CompareVersion().compareVersion("1.0.1", "1"));
	}

	public int compareVersion(String version1, String version2) {
		String v1[] = version1.split("\\.");
		String v2[] = version2.split("\\.");
		int length = v1.length > v2.length ? v2.length : v1.length;
		int result = 0, j;
		for (j = 0; j < length; j++) {
			if (Double.parseDouble(v1[j]) > Double.parseDouble(v2[j])) {
				result = 1;
				break;
			} else if (Double.parseDouble(v1[j]) < Double.parseDouble(v2[j])) {
				result = -1;
				break;
			} else {
				if (v1[j].length() < v2[j].length()) {
					result = 1;
				} else if (v1[j].length() > v2[j].length()) {
					result = -1;
				}
			}
		}
		if (result == 0 && v1.length != v2.length) {
			if (v1.length > v2.length) {
				while (j < v1.length) {
					if (Double.parseDouble(v1[j]) > 0) {
						result = 1;
						break;
					}
					++j;
				}
			} else {
				while (j < v2.length) {
					if (Double.parseDouble(v2[j]) > 0) {
						result = -1;
						break;
					}
					++j;
				}
			}

		}
		return result;
	}
}
