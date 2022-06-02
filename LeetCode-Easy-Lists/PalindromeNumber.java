import java.util.*;
/**
 Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.


 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        while(x!=0){
            stack.push(x%10);
            q.add(x%10);
            x = x/10;
        }
        while(stack.empty()==false){
            if(stack.pop()!=q.remove()){
                return false;
            }
        }
        return true;
        
    }

    
}
