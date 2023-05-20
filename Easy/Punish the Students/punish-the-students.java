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
            int n = sc.nextInt();
            double avg = sc.nextDouble ();
            int[] roll = new int[n];
            int[] marks = new int[n];
            
            for (int i = 0; i < n; ++i)
                roll[i] = sc.nextInt ();
                
            for (int i = 0; i < n; ++i)
                marks[i] = sc.nextInt ();

    		System.out.println (new Solution().shouldPunish (roll, marks, n, avg));
        }
        
    }
}

// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int shouldPunish (int roll[], int marks[], int n, double avg)
    {
        // your code here
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(roll[j-1] > roll[j]){
                    count++;
                    int temp = roll[j];
                    roll[j] = roll[j-1];
                    roll[j-1] = temp;
                }
            }
        }
        count += count;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += marks[i];
        }
        sum -= count;
        double res = sum / n;
        if(res > avg){
            return 1;
        }
        return 0;
    }
}