//brute
class Solution {
    public int longestConsecutive(int[] nums) {

        int longest =0;
        for(int i =0; i < nums.length; i++){

            int x = nums[i];
            int cnt =1;
            while(linearSearch(nums, x+1)==true){
                cnt++;
                x++;
            }
            longest = Math.max(cnt, longest);
        }
        return longest;
        
    }

    public boolean linearSearch(int[] a, int searchElement){

        for(int i =0; i < a.length; i++){
            if(a[i]==searchElement){
                return true;
            }
        }
        return false;
    }
}


//better
class Solution {
    public int longestConsecutive(int[] nums) {

        int longest =1;
        int lastSmaller =Integer.MIN_VALUE;
        int cnt =0;

        if(nums.length==0) return 0;

        Arrays.sort(nums);
        for(int i =0; i < nums.length;i++){

            if(nums[i]-1==lastSmaller){

                cnt++;
                lastSmaller = nums[i];
            }
            else if(nums[i]!=lastSmaller){
                cnt =1;
                lastSmaller = nums[i];
            }

            longest = Math.max(longest, cnt);
        }
        
        return longest;
        
    }

    
}

//optimal
class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n = nums.length;
        if(n==0) return 0;
        int longest =1;
        
        Set<Integer> st = new HashSet<>();

        for(int i =0; i < n; i++){
            st.add(nums[i]);
        }

        for(int s:st){

            if(!st.contains(s-1)){
                int cnt = 1;
                int x = s;

            while(st.contains(x+1)){
                x++;
                cnt++;

            }
            longest = Math.max(cnt, longest);

        }
        }
        return longest;

    }
}