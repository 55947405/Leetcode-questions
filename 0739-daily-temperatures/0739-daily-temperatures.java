class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            if(st.size()==0){
                ans[i] = 0;
                st.push(i);
            }
            else{
                int k = st.peek();
                if(temperatures[i]<temperatures[k]){
                    ans[i] = k-i;
                    st.push(i);
                }
                else{
                    while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()]){
                        st.pop();
                    }
                    if(st.isEmpty()){
                        ans[i] = 0;
                        st.push(i);
                    }
                    else{
                        ans[i] = st.peek()-i;
                        st.push(i);
                    }

                }
            }
        }
        return ans;
    }
}