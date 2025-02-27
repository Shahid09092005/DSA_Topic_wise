class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true ; // no need for plantation
        for(int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];
                
                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1; // Place the flower
                    n--; // Reduce the required flower count
                    if (n == 0) return true; // If no more flowers are needed, return true
                }
            }
        }
        return n == 0; // Return true if all flowers are placed, otherwise false
    }
}
