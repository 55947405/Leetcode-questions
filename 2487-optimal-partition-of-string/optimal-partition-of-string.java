class Solution {
    public int partitionString(String s) {
        HashSet<Character> st = new HashSet();
        int count = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(st.contains(ch)){
                count++;
                st.clear();
                st.add(ch);
            }
            else{
                st.add(ch);
            }
        }
        return count+1;
    }
}