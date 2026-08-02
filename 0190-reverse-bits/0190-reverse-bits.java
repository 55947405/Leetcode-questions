class Solution {
    public int reverseBits(int n) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<32;i++){
            str.append(Math.abs(n%2));
            n = n/2;
        }

        int ans = 0;
        for(int i=0;i<32;i++){
            if(str.charAt(i)=='1'){
                ans+=(int)Math.pow(2,31-i);
            }
        }
        return ans;
    }
}