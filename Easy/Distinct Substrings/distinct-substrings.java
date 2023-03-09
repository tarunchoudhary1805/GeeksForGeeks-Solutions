//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.fun(s);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int fun(String s) 
    {
        // code here
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<s.length()-2+1;i++){
            StringBuilder xs = new StringBuilder();
            for(int j=i;j<2+i;j++){
                xs.append(s.charAt(j));
            }
            set.add(xs.toString());
        }
        return set.size();
    }
} 