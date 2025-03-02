class Solution {
    public int appendCharacters(String s, String t) {
        if(s.contains(t)) return 0; // this for directly check 
        int s_len = s.length();
        int t_len = t.length();
        int s_idx = 0;
        int t_idx =0;
        // int c=0;
        while(s_idx<s_len && t_idx<t_len){
            if(s.charAt(s_idx)==t.charAt(t_idx)){
                // c++;
                t_idx++;
            }
            s_idx++;
        }
        return t_len-t_idx;
        
    }
}
