class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        if(j<0){
            return;
        }
        while(index>=0){
            if(j<0){
                return;
            }
            if(i>=0 && nums1[i] > nums2[j]){
                nums1[index] = nums1[i];
                i--; index--;
            }else{
                nums1[index] = nums2[j];
                j--; index--;
            }
        }
    }
}