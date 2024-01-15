class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1, l = 0, r = 0;
        while(r < nums.length && l <= r)
        {
            if(nums[r] == nums[l]) {
                r++;
            }
            else {
                int temp = nums[r];
                nums[r] = nums[k];
                nums[k] = temp;
                k++;
                l++;
                r++;
            }
        }
        return k;
    }
}