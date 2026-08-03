class Solution {
    public int longestConsecutive(int[] nums) {
        // Arrays.sort(nums);
        // int count=1,ans =1;
        // if(nums.length==0) return 0;
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i+1]==nums[i])continue;
        //     else if(nums[i+1]-nums[i]==1) count++;
        //     else{
        //         count=1;
        //     }
        //     ans = Math.max(ans,count);
        // }
        // return ans;
        HashSet<Integer> hs = new HashSet<>();
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        for(int num:hs){
            if(!hs.contains(num-1)){
                int current = num;
                int length = 1;
                while(hs.contains(current+1)){
                    current++;
                    length++;
                }
                ans = Math.max(length,ans);
            }
        }
        return ans;
    }
}