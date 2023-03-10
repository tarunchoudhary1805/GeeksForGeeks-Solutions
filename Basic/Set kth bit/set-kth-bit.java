//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N = sc.nextInt();
            int K = sc.nextInt();
           
            Solution ob = new Solution();
            int ans = ob.setKthBit(N,K);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static int setKthBit(int N,int K){
        // code here
        // int x = N;
        // int count = 0;
        // while(x!=0){
        //     count++;
        //     x = x>>1;
        // }
        int mask = 1 << K;
        int ans = N | mask;
        // System.out.println(count +" "+ mask);
        return ans;
    }
}