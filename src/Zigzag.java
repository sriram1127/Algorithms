
public class Zigzag {
	public static void main(String[] args) {

	}

	public String convert(String s, int numRows) {
		
		StringBuffer sb = new StringBuffer();
		
		for(int i= 0; i < numRows ; i++)
		{
			for(int j=i; j < s.length() ; j++)
			 sb.append(s.charAt(j));
		}
		return null;
	}
}
