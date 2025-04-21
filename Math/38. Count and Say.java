class Solution { 
    // Recursively
    public String countAndSay(int n) {
        // Base case
        if (n == 1) return "1";

        // Get the (n-1)th term recursively
        String prev = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();

        int count = 1;
        for (int i = 1; i < prev.length(); i++) {
            if (prev.charAt(i) == prev.charAt(i - 1)) {
                count++;
            } else {
                result.append(count);
                result.append(prev.charAt(i - 1));
                count = 1;
            }
        }

        // Append the last group
        result.append(count);
        result.append(prev.charAt(prev.length() - 1));

        return result.toString();
    }
}
