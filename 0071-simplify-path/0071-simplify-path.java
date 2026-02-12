class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] compo = path.split("/");
        for(String comp:compo){
            if(comp.equals(".") || comp.equals(""))continue;
            else if(comp.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(comp);
            }
            
        }
        if(st.isEmpty()){
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for(String str:st){
            sb.append("/").append(str);
        }
        return sb.toString();
    }
}