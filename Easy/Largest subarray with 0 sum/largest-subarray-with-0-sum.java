//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefixSum[] = new int[n];
        prefixSum[0] = arr[0];
        for(int i=1;i<prefixSum.length;i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        int max = 0;
        map.put(0,-1);
        for(int i=0;i<n;i++){
            if(map.containsKey(prefixSum[i])){
                int res = i - map.get(prefixSum[i]);
                if(res > max){
                    max = res;
                }
            }
            else{
                map.put(prefixSum[i],i);
            }
        }
        return max;
    }
}