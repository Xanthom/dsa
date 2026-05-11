import java.util.*;
class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        git config --global user.name
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++){
            
            if(arr[i] != arr[i-1]){
                
                list.add(arr[i]);
            }    
        }
        return list;
    }
}
