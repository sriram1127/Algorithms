import java.util.Arrays;

public class medianOfTwoArrays {

	public static void main(String[] args) {
		int[] num1 = { 100001};
		int[] num2 = {  100000};
		//int[] num1 = {2000};
		//int[] num2 = {3000};
		System.out.println(Math.round((float)3/2));
		System.out.println(new medianOfTwoArrays().findMedianSortedArrays(num1, num2));
	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int length1 = nums1.length;
		int length2 = nums2.length;
		int ele[] = new int[2];
        int sumLength = length1 + length2;
		int middleElement = (int) Math.ceil((float)(sumLength + 1) / 2);
		int i =0, j =0;
		for (int in = 0; in < middleElement; in++) {
			ele[1] = ele[0];
			if (length2 > 0 && j< length2 && (i == nums1.length || nums1[i] > nums2[j])) {
				ele[0] = nums2[j];
				++j;
			} else {

				ele[0] = nums1[i];
				++i;
			}
		
		}
		if (sumLength % 2 == 0) {
			return (double)(ele[0] + ele[1]) / 2;
		} else {
			return (double)ele[0];
		}
	}

}
