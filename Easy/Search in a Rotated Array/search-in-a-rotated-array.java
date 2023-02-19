//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            int A[] = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for (int i = 0;i < n;i++)
            {
                A[i] = Integer.parseInt(s[i]);
            }
            int key = Integer.parseInt(in.readLine().trim());
            
            out.println(new Solution().search(A, 0, n - 1, key));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int search(int nums[], int l, int h, int target)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        int index = BinarySearchFindIndex(nums);
        int one = BinarySearch(nums,0, index,target);
        int two = BinarySearch(nums, index, nums.length-1,target);
        if(one == -1 && two == -1){
            return -1;
        }else if(one == -1) return two;
        else return one;
    }
    public static int BinarySearchFindIndex(int [] arr){
     int start = 0;
     int end = arr.length-1;
     while(start<=end){
        int mid = start+(end-start)/2;
        int prev = (mid+arr.length-1)%arr.length;
        int next = (mid+1)%arr.length;
        if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]){
            return mid;
        }else if(arr[mid] <= arr[end]){
            end = mid-1;
        }else if(arr[start]<=arr[mid]){
            start = mid+1;
        }
     }
     return -1;
    }
    public static int BinarySearch(int [] arr, int s, int e,int target){
        int start = s;
        int end = e;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}