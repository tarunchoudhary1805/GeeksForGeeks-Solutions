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

            Solution ob = new Solution();
            String ans = ob.getBinaryRep(N);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String getBinaryRep(int N){
        // code here
        StringBuilder s = new StringBuilder();
        int count = 0;
        while(N !=0){
            int rem = N % 2;
            s.append(rem);
            N = N/2;
            count++;
        }
        
        for(int i=0 ; i<30-count;i++){
        // System.out.println(i);
            s.append(0);
        }
        StringBuilder xs = new StringBuilder();
        
        for(int i = s.length()-1;i>=0;i--){
            xs.append(s.charAt(i));
        }
        return xs.toString();
    }
}