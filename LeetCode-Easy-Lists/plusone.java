import java.util.*;
/**
You are given a large integer represented as an integer array digits, where each digits[i] is 
the ith digit of the integer. The digits are ordered from most significant to least 
significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
 */
public class plusone {
    public int[] plusOne(int[] digits) {
        int[] digits1 = new int[digits.length+1];
        int num = 0;
          for(int i = digits.length-1;i>=0;i--){
               if(num!=0){
                      digits1[i+1]=digits[i];
                  }else if(digits[i]==9){
                  digits1[i+1]=0;
                 if(i==0){
                     digits1[i]= digits1[0]+1;
                 }else{
                  digits1[i]= digits1[i-1]+1;
                 }
              }else if(i!=digits.length-1&&digits1[i+1]!=1){
                  digits1[i+1]=digits[i];
                  num++;
              }else {
                  digits1[i+1]=digits[i]+1;
                  num++;
              }
              digits[i]=digits1[i+1];
          }
          if(digits1[0]==0){
              return digits;
          }else{
              return digits1;
          }
  }
    
}
