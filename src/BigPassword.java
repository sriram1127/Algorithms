
public class BigPassword {
	public int solution(String S) {
	       String[] pass = S.split(" ");
	       String temp = null;
	       boolean valid = true;
	       int max = 0;
	       int letters;
	       int digits;
	       for(int i =0; i < pass.length; i++){
	           temp = pass[i];
	           letters =0;
	           digits =0;
	           char c = ' ';
	           for(int j=0; j<temp.length(); j++){
	               c = temp.charAt(j);
	               if(('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')){
	               ++letters;
	               } else if ('0' <= c && c <= '9'){
	                   ++digits;
	                   } else{
	                       valid = false;
	                       }
	           }
	           if(valid && letters % 2 ==0 && digits % 2 == 1){
	               max = Math.max(max, temp.length());
	               }
	           
	    }
	    return max !=0 ? max : -1;
	}
}
