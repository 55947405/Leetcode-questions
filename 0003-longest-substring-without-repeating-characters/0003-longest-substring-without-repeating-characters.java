class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];  // Tracks last index of each character
        Arrays.fill(hash, -1);      // Fill with -1 to indicate "not seen yet"

        int l = 0, r = 0, max = 0;
        int n = s.length();

        while (r < n) {
            char ch = s.charAt(r);
            int ascii = (int) ch;

            // If character was seen and is within current window
            if (hash[ascii] >= l) {
                l = hash[ascii] + 1; // move left pointer right after the last occurrence
            }

            hash[ascii] = r;  // Update the last seen index of the character
            int len = r-l+1;
            max = Math.max(max,len); // Update max length
            r++;
        }

        return max;
    }
}
