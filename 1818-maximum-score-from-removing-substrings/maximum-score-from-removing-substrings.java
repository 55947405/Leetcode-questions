class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> st = new Stack<>();
        st.push('z');
        int ycount = 0;
        int xcount = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(x<y){
                if(st.peek()=='b' && ch=='a'){
                     ycount++;
                    st.pop();
                    
                }
                else{
                   st.push(ch);
                }
            }
            else{
                if(st.peek()=='a' && ch=='b'){
                    xcount++;
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }   
        }
        Stack<Character> st2 = new Stack<>();
        st2.push('q');
        while(!st.empty()){
            if(x<y){
                if(st2.isEmpty()){
                    st2.push(st.pop());
                }
                else if(st2.peek()=='b' && st.peek()=='a'){
                    xcount++;
                    st2.pop();
                    st.pop();
                }
                else{
                    st2.push(st.pop());
                }
            }
            else{
                if(st2.isEmpty()){
                    st2.push(st.pop());
                }
                else if(st2.peek()=='a' && st.peek()=='b'){
                    ycount++;
                    st.pop();
                    st2.pop();
                }
                else{
                    st2.push(st.pop());
                }
            }
        }
        return ycount*y + xcount*x;
    }
}