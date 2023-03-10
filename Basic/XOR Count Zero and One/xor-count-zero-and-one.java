//{ Driver Code Starts

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.find_xor(n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends



class Solution
{
    public int find_xor(int n)
    {
        // Code here
        int setCount = 0;
        int unsetCount = 0;
        while(n != 0){
            int ans = n & 1;
            n = n>>1;
            if(ans == 1) setCount++;
            else unsetCount++;
        }
        return setCount ^ unsetCount;
    }
}