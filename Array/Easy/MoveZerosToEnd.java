//brute force Approach

class Solution {
    void pushZerosToEnd(int[] arr) {
            
        int[] temp = new int[arr.length];
            
            int count =0;
            for(int i =0; i < arr.length; i++){
                
                if(arr[i]!=0){
                    temp[count]=arr[i];
                    count++;
                }
            }
            
            int nonzero = temp.length;
            
            for(int i =0; i <temp.length;i++){
                arr[i] = temp[i];
            }
            
            for(int i =nonzero; i< arr.length; i++){
                 arr[i]=0;
            } 
    }
}


// optimal solution

import java.util.*;
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int j = -1;
        for(int i =0; i < arr.length; i++){
            
            if(arr[i]==0){
                j =i;
                break;
            }
        }
        
        if(j==-1)
            return;
        for(int i = j+1; i < arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}