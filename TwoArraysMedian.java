//Note: Works only if the arrays are sorted and of equal length
class TwoArraysMedians {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return findMedianSortedArrays(nums1, nums2, 0,(nums1.length - 1), 0, (nums2.length - 1));
}
    public double findMedianSortedArrays(int[] nums1, int[] nums2, int start_a, int end_a, int start_b, int end_b) {
        if ((end_a - start_a == 1) && (end_b - start_b == 1)){
            return (1.0 * (Math.max(nums1[start_a], nums2[start_b])) + (Math.min(nums1[end_a], nums2[end_b])))/2;
        }
        
        int median_a = (start_a + end_a )/ 2;
        int median_b = (start_b + end_b )/ 2;
        
        int m1 = nums1[median_a];
        int m2 = nums2[median_b];
        
        if ( m1 == m2){
            return m1;
        }
        
        if (m1 < m2){
            start_a = median_a;
            end_b = median_b;
        }
        else{
             start_b = median_b;
             end_a = median_a;
        }
        return findMedianSortedArrays(nums1, nums2, start_a, end_a, start_b, end_b);
    }
}
