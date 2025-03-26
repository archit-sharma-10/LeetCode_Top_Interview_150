class Solution {
    public int removeElement(int[] nums, int val) {
        int last = nums.length - 1;
        if(nums.length == 1 && nums[0]==val){
            return 0;
        }
        for(int i=0;i<=last;i++){
            if(nums[i] == val){
                int temp = nums[i];
                nums[i] = nums[last];
                nums[last] = temp;
                last--;
                i--;
            }
        }        
        return last+1;
    }
}