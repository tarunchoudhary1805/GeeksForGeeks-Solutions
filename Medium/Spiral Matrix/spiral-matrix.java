//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			Solution obj = new Solution();
			System.out.println(obj.findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
   
	public int findK(int a[][], int n, int m, int k)
	{
	    // Your code goes here
	    int total = n*m;
	    int count = 0;
	    int colLeft = 0;
	        int colRight = m-1;
	        int rowTop = 0;
	        int rowBottom = n-1;
	        ArrayList<Integer> list = new ArrayList<>(); 
	    while(rowTop <= rowBottom && colLeft <= colRight){
	        for(int i=colLeft;i<=colRight;i++){
	            list.add(a[rowTop][i]);
	           // count++;
	        }
	        rowTop++;
	        for(int i=rowTop;i<=rowBottom;i++){
	            list.add(a[i][colRight]);
	           // count++;
	        }
	        colRight--;
	        for(int i=colRight;i>= colLeft;i--){
	            list.add(a[rowBottom][i]);
	           // count++;
	        }
	        rowBottom--;
	        for(int i=rowBottom;i>= rowTop;i--){
	            list.add(a[i][colLeft]);
	           // cou/nt++;
	        }
	        colLeft++;
	    }
	    int ans = list.get(k-1);
	   // System.out.print(list);
	    return ans;
	}
	
}