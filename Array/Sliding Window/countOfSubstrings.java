class Solution {
    // is vowel
    private boolean isvol(char c){
        return c=='a' || c=='e'|| c=='i'||c=='o'||c=='u';
    }
    // main
    public long countOfSubstrings(String word, int k) {
        long count=0;
        // count the freq of each vowel
        HashMap<Character,Integer> map = new HashMap<>();
        int const_count=0; // count consonant
        int n=word.length(); // length of the word 
        int[] nextConsonant = new int[n]; // storing the idx of next consonant
        int const_idx=n; // letting the last idx is const 
        for (int i = n - 1; i >= 0; i--) {
            nextConsonant[i] = const_idx;  // Store the index of next consonant
            if (!isvol(word.charAt(i))) {
                const_idx = i;
            }
        }// for loop end
        int left=0;
        for(int i=0;i<n;i++){
            Character ch = word.charAt(i);
            if(isvol(ch)){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }else{
                const_count++;
            }
            // if consonant count is greater than k
            while(const_count>k){
                Character lft_char = word.charAt(left);
                if(isvol(lft_char)){ //vol. remove from  left or shrinking window size
                    map.put(lft_char,map.get(lft_char)-1);
                    if(map.get(lft_char)==0){
                        map.remove(lft_char);
                    }
                }else{ //consonant remove from  left or shrinking window size
                    const_count--;
                }
                left++;
            } // while loop end
            while(left<n && map.size()==5 && const_count==k){
                count += nextConsonant[i]-i ;// next const - current const
                 Character lft_char = word.charAt(left);
                if(isvol(lft_char)){ //vol. remove from  left or shrinking window size
                    map.put(lft_char,map.get(lft_char)-1);
                    if(map.get(lft_char)==0){
                        map.remove(lft_char);
                    }
                }else{ //consonant remove from  left or shrinking window size
                    const_count--;
                }
                left++;
            } // while loop end
        } // for loop end
        return count;
    }
}
