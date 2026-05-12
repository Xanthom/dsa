//brute
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i =0; i < nums.length; i++){

            for(int j =0; j < nums.length; j++){

                if(i==j) continue;
                if(nums[i]+nums[j]==target){

                    return new int[]{i,j};       
                }
            }
        }
        return new int[]{-1,-1};
    }
}

//better
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> mpp = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int more = target -nums[i];
            if(mpp.containsKey(more)){
                return new int[]{mpp.get(more), i};
            }
            mpp.put(nums[i], i);

        }
        return new int[]{-1,-1};
    }
}


//optimal
