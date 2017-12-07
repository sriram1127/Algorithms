import java.util.Arrays;

public class Duplicate3 {
	public static void main(String[] args) {
		System.out.println(containsNearbyAlmostDuplicate(new int [] {-1,-1},  1, 0 ));
	}

	public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

		Arrays.sort(nums);
		boolean kcheck = false;
		for (int i = 0, j = nums.length - 1; i < j;) {
			if (!kcheck) {
				if (Math.abs(nums[i] - nums[j]) <= t) {
					kcheck = true;
					if (j - i <= k) {
						return true;
					} else {
						i++;

					}
				} else {
					--j;
				}
			} else {
				if (j - i <= k) {
					return true;
				} else {
					i++;
				}
			}
		}

		return false;

	}
}
