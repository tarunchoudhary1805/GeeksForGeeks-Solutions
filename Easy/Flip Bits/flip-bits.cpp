//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends


class Solution{
    public:
    int maxOnes(int a[], int n)
    {
        // Your code goes here
         // Your code goes here
        int ans = 0;
        int one = 0;
        int zero = 0;
        int k =0;
        for(int i =0;i<n;i++){
          if(a[i]){one++;
          k++;
              
          }
          
          else zero++;
          
          if(one>=zero){
              one =0;
              zero = 0;
          }
          else{
              ans = max(ans,zero-one);
          }
           
        }
        return ans+k;
    }
};


//{ Driver Code Starts.
int main()
{
    int t; cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int a[n+5];
        for(int i=0;i<n;i++)
            cin>>a[i];
        Solution ob;
        cout<< ob.maxOnes(a, n) <<endl;
    }
    return 0;
}

// } Driver Code Ends