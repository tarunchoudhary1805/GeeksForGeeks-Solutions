//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findKRotation(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int findKRotation(int arr[], int n) {
        int ans = BinarySearch(arr);
        return ans;
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