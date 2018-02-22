public class ReverseString {

	public static void main(String args[]) {

		//String str = " Northen California USA ";
	    String str = "";
		int i, j;
		// String result = "";

		for (i = j = str.length() -1; i > -1; --i) {

			if (str.charAt(i) == ' ') {

				System.out.print(str.substring(i + 1, j + 1) + " ");
				j = i - 1;

			}else if(i == 0)
			{
				System.out.print(str.substring(i, j + 1));
			}

		}

	}

}