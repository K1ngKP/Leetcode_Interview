class Solution {
    public void sortColors(int[] nums) {
        int i = 1;
        int n = nums.length;

        while(i<n)
        {
            int j = i;
            int curr = nums[i];
            while(j>0 && nums[j-1]>curr)
            {
                nums[j] = nums[j-1];
                j--;

            }
            nums[j] = curr;
            i++;
        }
    }
}