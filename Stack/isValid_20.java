class Solution {
    public boolean isValid(String s) {
        int len=s.length();
        if(len==0) return true;
        if(len==1) return false;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }else{
                if(st.isEmpty()) return false; // if stack is empty
                char stackTop = st.peek();
                if((stackTop=='(' && ch==')') || (stackTop=='{' && ch=='}') || (stackTop=='[' && ch==']')){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        if(!st.isEmpty()) return false;
        return true;
    }
}
