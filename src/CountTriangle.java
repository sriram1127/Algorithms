//you can also use imports, for example:
import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class CountTriangle {
 public int solution(int[] A) {
     Arrays.sort(A);
     int k =0;
     int count =0;
     for(int i=0;i < A.length-2;i++){
          k = i+2;
         for(int j=i+1;j < A.length-1;j++){ 
                 while(k <  A.length && A[i] + A[j] > A[k]){
                     ++k;
                     }
                     count += k-1-j;
             }
         }
         return count;
 }
}
