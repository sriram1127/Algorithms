
public class ChocolateByNumbers {

}
class Solution {

    
    public int solution(int N, int M) {
        
        if (N%M ==0)
        {
            return N/M;
            }else{
             
            return    N/gcd(N,M);
                }
    }
    
    public int gcd(int a, int b){
        if(a%b != 0)
            {
            return gcd(b, a%b);
            }
        return b;
        }
}