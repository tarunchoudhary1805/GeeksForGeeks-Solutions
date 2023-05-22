//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    
		    int n = Integer.parseInt(br.readLine());
		    int arr[] = new int[n];
		    
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split(" ");
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Check obj = new Check();
		    
		    System.out.println(obj.lastSeenElement(arr,n));
		        
		}
		
	}
}


// } Driver Code Ends


//User function Template for Java

class Check{
    
    static int lastSeenElement(int arr[], int n) 
    { 
        HashMap<Integer, Integer> hm = new HashMap<>();
        int min_index = n-1;
        
        for(int i=0; i<n; i++){
            hm.put(arr[i], i);
        }
        
        for(int x : hm.values()){
            if(min_index > x){
                min_index = x;
            }
        }
        
        return arr[min_index];
    } 
}

