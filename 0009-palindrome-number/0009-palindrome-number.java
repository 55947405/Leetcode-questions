class Solution {
    public boolean isPalindrome(int x) {
        boolean ans = false;
        int rev = 0,n=x;
        if(n<0) return ans;
        while(n!=0){
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        if(rev==x) {
            ans = true;
        }
        return ans;
    }
}