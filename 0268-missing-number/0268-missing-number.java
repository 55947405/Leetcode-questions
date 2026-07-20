class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // int sum = n*(n+1)/2;
        // int asum = 0;
        // for(int i=0;i<nums.length;i++){
        //     asum+=nums[i];
        // }
        // return sum-asum;


        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=i){
        //         return i;
        //     }
        // }
        // return nums.length;

        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        for(int i=1;i<nums.length+1;i++){
            xor^=i;
        }
        return xor;
    }
}