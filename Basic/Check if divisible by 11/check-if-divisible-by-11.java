//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();

    		System.out.println (new Sol().divisibleBy11 (s));
        }
        
    }
}

// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Sol
{
    int divisibleBy11 (String S)
    {
        // Your Code Here
        int count = 0;
        int sum = 0;
        while(count < S.length()){
            int ans = (int)(S.charAt(count)-'0');
            if(count % 2 == 0){
                sum += ans;
            }else{
                sum -= ans;
            }
            // System.out.println("sum"+sum);
            count++;
        }
        if(sum % 11 == 0) return 1;
        else return 0;
    }
}