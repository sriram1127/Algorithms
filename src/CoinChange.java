
public class CoinChange {
	public static void main(String[] args) {
		coin(29);
	}

	public static void coin(int amount) {
		int[] coins = new int[] { 1, 5, 10, 25 };
		int count = 0;
		int temp = 0;
		for (int i = coins.length - 1; i >= 0 && amount > 0; i--) {
			temp = amount / coins[i];
			count += temp;
			amount = amount % coins[i];
		}
		System.out.println(count);
	}
}
