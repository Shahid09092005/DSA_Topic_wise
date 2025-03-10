class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int res = 0;

        for (int i = 2; i < colors.length; i++) {
            
            if (colors[i - 2] != colors[i - 1] && colors[i - 1] != colors[i]) {
                res++;
            }
        }

        
        if (colors[0] != colors[1] && colors[0] != colors[colors.length - 1]) {
            res++;
        }

     
        if (colors[0] != colors[colors.length - 1] && colors[colors.length - 2] != colors[colors.length - 1]) {
            res++;
        }

        return res;
    }
}
