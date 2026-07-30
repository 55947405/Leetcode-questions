class Solution {
    public int maxSubArray(int[] nums) {
        int maxi=nums[0],ans=nums[0];
        for(int i=1;i<nums.length;i++){
            maxi+=nums[i];
            maxi = Math.max(maxi,nums[i]);
            ans = Math.max(maxi,ans);
        }
        return ans;
    }
}