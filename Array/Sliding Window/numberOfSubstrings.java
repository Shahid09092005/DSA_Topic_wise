//                                           by using array
class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] freq = new int[3]; // Array to store frequency of 'a', 'b', 'c'
        int left = 0, count = 0, unique = 0;

        for (int right = 0; right < n; right++) {
            int chIndex = s.charAt(right) - 'a'; // Convert 'a', 'b', 'c' to indices (0,1,2)
            if (freq[chIndex] == 0) {
                unique++; // Count unique characters in window
            }
            freq[chIndex]++;

            // Shrink window when all three characters are present
            while (unique == 3) {
                count += (n - right); // Count all valid substrings

                int leftIndex = s.charAt(left) - 'a';
                freq[leftIndex]--;
                if (freq[leftIndex] == 0) {
                    unique--; // Remove character from window
                }
                left++;
            }
        }
        return count;
    }
}


// by using hashmap
import java.util.HashMap;

class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int left = 0, count = 0;

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // Shrink the window while it contains all three characters
            while (map.size() == 3) {
                count += (n - right); // All substrings starting from left to right

                char left_char = s.charAt(left);
                map.put(left_char, map.get(left_char) - 1);
                if (map.get(left_char) == 0) {
                    map.remove(left_char);
                }
                left++; // Move left pointer to shrink the window
            }
        }
        return count;
    }
}
