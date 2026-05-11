//brute

import java.util.*;
class Solution {
    int single(int[] arr) {
        // code here
        int maxi = arr[0];
        
        for(int i =0; i <arr.length; i++){
            maxi = Math.max(maxi, arr[i]);
        }
        
        int[] hash = new int[maxi+1];
        
        for(int i =0; i < arr.length; i++){
            
            hash[arr[i]]++;
        }
        
        for(int i =0; i < arr.length; i++){
            
            if(hash[arr[i]]==1){
                return arr[i];
            }
        }
        return -1;
    }
}