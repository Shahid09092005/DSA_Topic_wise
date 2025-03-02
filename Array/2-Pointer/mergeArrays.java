import java.util.*;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        ArrayList<int[]> res = new ArrayList<>();
        int len_1 = nums1.length; // nums1 length
        int len_2 = nums2.length; // nums2 length
        int idx_1 = 0; // indexing for nums1
        int idx_2 = 0; // indexing for nums2

        while (idx_1 < len_1 && idx_2 < len_2) {
            if (nums1[idx_1][0] == nums2[idx_2][0]) { // If IDs are equal
                res.add(new int[]{nums1[idx_1][0], nums1[idx_1][1] + nums2[idx_2][1]});
                idx_1++;
                idx_2++;
            } else if (nums1[idx_1][0] > nums2[idx_2][0]) { // nums2 ID smaller
                res.add(new int[]{nums2[idx_2][0], nums2[idx_2][1]});
                idx_2++;
            } else { // nums1 ID smaller
                res.add(new int[]{nums1[idx_1][0], nums1[idx_1][1]});
                idx_1++;
            }
        }

        // Add remaining elements of nums1 if any
        while (idx_1 < len_1) {
            res.add(new int[]{nums1[idx_1][0], nums1[idx_1][1]});
            idx_1++;
        }

        // Add remaining elements of nums2 if any
        while (idx_2 < len_2) {
            res.add(new int[]{nums2[idx_2][0], nums2[idx_2][1]});
            idx_2++;
        }

        // Convert ArrayList to int[][] array
        return res.toArray(new int[res.size()][]);
    }
}
