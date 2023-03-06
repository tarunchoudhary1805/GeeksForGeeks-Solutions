//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String s = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.reverseString(s));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String reverseString(String s)
    {
        //code here.
        HashSet<Character> set = new HashSet<>();
        StringBuilder ss = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(!set.contains(s.charAt(i)) && s.charAt(i) != ' '){
                set.add(s.charAt(i));
                ss.append(s.charAt(i));
            }
        }
        return ss.toString();
    }
}