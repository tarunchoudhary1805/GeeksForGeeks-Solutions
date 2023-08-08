//{ Driver Code Starts
//Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++
class Solution
{
    public:
    int countFractions(int n, int numerator[], int denominator[])
    {
           // Using of the Approach of Unordered_map function 
        
        unordered_map<float, int>mp;
        int ans = 0;
        
        for(int i = 0; i<n; i++){
            
            if(mp.find((float) (denominator[i]-numerator[i])/ denominator[i])!=mp.end())
            ans += mp[(float)(denominator[i]-numerator[i])/ denominator[i]];
            
            mp[(float) numerator[i]/ denominator[i]]++;
        }
        
        return ans;
    }
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int numerator[n],denominator[n];
        for(int i=0;i<n;i++)
            cin>>numerator[i];
        for(int i=0;i<n;i++)
            cin>>denominator[i];
        Solution ob;
        int ans=ob.countFractions(n,numerator,denominator);
        cout<<ans<<endl;
    }
}
// } Driver Code Ends