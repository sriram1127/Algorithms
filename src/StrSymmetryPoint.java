
public class StrSymmetryPoint {
	public static void main(String[] args) {
			System.out.println(solution("CarvraC"));
	}
	 public static int solution(String S) {
	        int length = S.length();
	        if(length % 2 !=0){
	            if(length == 1){
	                
	                return 0;
	                }else{
	                    int middle = (length -1)/2;
	                    StringBuffer sb = new StringBuffer(S.substring(middle +1, length));
	                    StringBuffer sb1 = new StringBuffer(S.substring(0,middle));
	                    sb.reverse();
	                    System.out.println(sb1);
	                    System.out.println(sb.reverse());
	                    System.out.println(sb.reverse().equals(sb1));
	                    if(sb.toString().equals(sb1.toString()))
	                    {
	                        return middle;
	                        }else{
	                            return -1;	
	                            }
	                    }
	            
	            }else{
	                return -1;    
	                }
	    }
}
