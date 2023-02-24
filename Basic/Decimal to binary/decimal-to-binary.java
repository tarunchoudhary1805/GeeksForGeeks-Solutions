//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int N = sc.nextInt();
			Solution obj = new Solution();
			obj.toBinary(N);
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	void toBinary(int N) {
		//Write your code here
		int ans = 0;
		int i=0;
		while(N!=0){
		    int bit = N & 1;
		    ans += bit * Math.pow(10,i);
		    N = N>>1;
		    i++;
		}
		System.out.print(ans);
	}
}