//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
    
        // HashSet<Integer> set = new HashSet<>();
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i=0;i<arr.length;i++){
        //     if(set.contains(arr[i]) && !list.contains(arr[i])){
        //         list.add(arr[i]);
        //     }else{
        //         set.add(arr[i]);
        //     }
        // }
        // if(list.size() == 0) list.add(-1);
        // Collections.sort(list);
        // return list;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() >= 2){
                list.add(entry.getKey());
            }
        }
        if(list.size() == 0) list.add(-1);
        Collections.sort(list);
        
        return list;
    }
}
