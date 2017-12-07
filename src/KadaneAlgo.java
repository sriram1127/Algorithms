
public class KadaneAlgo {
	public static void main(String[] args) {

		double[] a = { 1, -3, -5, -4, -9, 50 };
		
		double maxSum = a[0];
		double curSum = a[0];
		
		for(int i =1; i< a.length; i++)
		{
			
			curSum = Math.max(a[i], curSum + a[i]);
			maxSum = Math.max(curSum, maxSum);
		}
		
		System.out.println(maxSum);

	}

}
