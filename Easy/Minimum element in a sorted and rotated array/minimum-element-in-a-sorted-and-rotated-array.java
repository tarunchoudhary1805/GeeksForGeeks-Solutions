//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findMin(A, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int findMin(int arr[], int n)
    {
        //complete the function here
        int ans =  BinarySearch(arr);
     return arr[ans];
    }
    public static int BinarySearch(int [] arr){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
           int mid = start + (end-start)/2;
           int next = (mid+1)%arr.length;
           int prev = (mid +arr.length-1)%arr.length;
           if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]){
               return mid;
           }else if(arr[mid] <= arr[end]){
               end = mid-1;
           }else if(arr[start] <= arr[mid]){
               start = mid+1;
           }
        }
        return ans;
    }
}
