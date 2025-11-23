class Solution {
    // my solution
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            arr.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            arr.add(nums2[i]);
        }
        Collections.sort(arr);
        double output ; 
        int len = arr.size();
        if(arr.size()%2!=0){
            output = arr.get(len/2);
        }
        else{
            int req = len/2;
            output = (arr.get(req)+arr.get(req-1))/2.0;
        }
        return output;
    }
}