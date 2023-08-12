//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends


class Solution
{
    public:
    //Function to find length of longest increasing subsequence.
    int longestSubsequence(int n, int a[])
    {
       // your code here
       int dp[n+1];
        dp[0] = INT_MIN;
        for(int i = 1; i <= n; i++) dp[i] = INT_MAX;
        
        for(int i = 0; i < n; i++){
            int ub = upper_bound(dp,dp + (n+1),a[i]) - dp;
            if(a[i] > dp[ub-1] && a[i] < dp[ub]){
                dp[ub] = a[i];
            }
        }
        
        int len = n;
        while(len >= 0 && dp[len] == INT_MAX) len--;
        return (len);
    }
};

//{ Driver Code Starts.
int main()
{
    //taking total testcases
    int t,n;
    cin>>t;
    while(t--)
    {
        //taking size of array
        cin>>n;
        int a[n];
        
        //inserting elements to the array
        for(int i=0;i<n;i++)
            cin>>a[i];
        Solution ob;
        //calling method longestSubsequence()
        cout << ob.longestSubsequence(n, a) << endl;
    }
}

// } Driver Code Ends