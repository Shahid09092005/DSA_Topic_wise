class Solution {
    public int minimumLength(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j && s.charAt(i) == s.charAt(j)) {
            char current = s.charAt(i);

            // Move `i` forward while characters are equal
            while (i <= j && s.charAt(i) == current) {
                i++;
            }

            // Move `j` backward while characters are equal
            while (i <= j && s.charAt(j) == current) {
                j--;
            }
        }

        // Remaining length
        return j - i + 1;
    }
}
