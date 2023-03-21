//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        // Your code here
        String res = "";
        Stack<Character> s = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                res += c;
            }else if(c == '('){
                s.push('(');
            }else if(c==')'){
                while(!s.isEmpty() && s.peek() != '('){
                    res += s.pop();
                }
                s.pop();
            }else{
                while(!s.isEmpty() && Prec(c) <= Prec(s.peek())){
                    res += s.pop();
                }
                s.push(c);
            }
        }
        while(!s.isEmpty()){
            res += s.pop();
        }
        return res;
    }
    public static int Prec(char c){
        switch(c){
            case '+':
            case '-':
                return 1;
                case '*':
    case '/':
      return 2;

    case '^':
      return 3;
    }
    return -1;
        
    }
}