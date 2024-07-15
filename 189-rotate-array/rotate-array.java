class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %=n;
        reverse(nums, 0, n);
        reverse(nums, 0, k);
        reverse(nums, k, n);
    }

    public void reverse(int[] nums, int k, int n)
    {
        for(int i=k, j=n-1; i<j; i++, j--)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}