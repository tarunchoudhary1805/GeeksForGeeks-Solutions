//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int c = 0;
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int l = j+1;
                int r = n-1;
                while(l<r){
                    if((arr[i] + arr[j] + arr[l] + arr[r]) == k){
                        // list.add(new ArrayList());
                        ArrayList<Integer> news = new ArrayList<>();
                        
                        news.add(arr[i]);
                        news.add(arr[j]);
                        news.add(arr[l]);
                        news.add(arr[r]);
                        // set.add(news);
                        if(!set.contains(news)){
                            list.add(news);
                            set.add(news);
                        }
                        // Collections.sort(list.get(c));
                        c++;
                        l++;
                        r--;
                    }else if((arr[i] + arr[j] + arr[l] + arr[r]) < k){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
        }
        return list;
    }
}