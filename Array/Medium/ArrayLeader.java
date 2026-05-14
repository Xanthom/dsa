//brute
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i =0; i < arr.length; i++){
            
            boolean flag = true;
            for(int j=i+1; j < arr.length;j++){
                
                if(arr[j] > arr[i]){
                    
                    flag = false;
                }
            }
            if(flag==true){
                
                res.add(arr[i]);
            }
        }
        
        return res;
    }
}

//bettersolution
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        
        ArrayList<Integer> res = new ArrayList<>();
        
        int maxi =Integer.MIN_VALUE;
        for(int i =arr.length-1; i >=0; i--){
            
            if(arr[i]>= maxi){
                res.add(arr[i]);
            }
            maxi = Math.max(maxi, arr[i]);
        }
        
        Collections.reverse(res);
        return res;
    }
}
