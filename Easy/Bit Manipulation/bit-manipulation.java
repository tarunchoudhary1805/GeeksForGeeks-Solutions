//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int i = sc.nextInt();

            Solution obj = new Solution();
            obj.bitManipulation(n, i);
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static void bitManipulation(int num, int i) {
        // code here
        // System.out.println(num & (1 << i-1));
        int ans =  num & (1 << i-1);
        String ans1 = (ans == (1 << i-1)) ? "1 " : "0 ";
        System.out.print(ans1);
        int ans2 = num | (1<<i-1);
        System.out.print(ans2 + " ");
        int ans3 = num & (~(1 << i-1));
        System.out.print(ans3);
        
        
    }
}
