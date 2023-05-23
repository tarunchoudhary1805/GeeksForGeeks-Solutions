//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            long[] product = obj.minAnd2ndMin(a, n); 
            if(product[0]==-1)
                System.out.println(product[0]);
            else
                System.out.println(product[0]+" "+product[1]);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        long [] arr = new long[2];
        long smallest = Integer.MAX_VALUE;
        long secondSmallest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i] < smallest){
                secondSmallest = smallest;
                smallest = a[i];
            }else if(a[i] != smallest && a[i] < secondSmallest){
                secondSmallest = a[i];
            }
        }
        arr[0] = smallest;
        arr[1] = secondSmallest;
        if(smallest == Integer.MAX_VALUE || secondSmallest == Integer.MAX_VALUE){
        long ar [] = new long[1];
        ar[0] = -1;
        return ar;
        } 
        return arr;
    }
}
