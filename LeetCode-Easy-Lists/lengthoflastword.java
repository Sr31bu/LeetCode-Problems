import java.util.*;
/**
 Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
 */
public class lengthoflastword {
    public static int lengthOfLastWord(String s) {
        int lastSpace = 0;
         int firstSpace = 0;
         for(int j =s.length()-1;j>0;j--){
             if(s.substring(j,j+1).equals(" ")==false){
                 firstSpace = j;
                 break;
                
             }
         }
        
         for(int i=0;i<firstSpace;i++){
             if(s.substring(i,i+1).equals(" ")){
                 lastSpace = i+1;
             }    
         }
       
         return s.substring(lastSpace,firstSpace+1).length();
     }
    
}
