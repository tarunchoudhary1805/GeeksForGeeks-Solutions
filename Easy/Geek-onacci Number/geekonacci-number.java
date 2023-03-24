
import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int N = in.nextInt();
            System.out.println(ans(A,B,C,N));
        }
    }
    public static int ans(int a, int b, int c , int n){
        if(n==3) return c;
        if(n==2) return b;
        if(n==1) return a;
        return ans(a,b,c,n-1) +  ans(a,b,c,n-2) + ans(a,b,c,n-3);
        
    }
}