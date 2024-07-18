class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int ind = 0;
        int[] temp = new int[n/2];
        for(int i =0; i<n; i++)
        {
            if(nums[i]<0)
            {
                temp[ind++]=nums[i];
            }
        }

        int ans[] = new int[n];
        int j = 0;
        int flag = 0;
        for(int i=0; i<n; i++)
        {
            if(nums[i]>=0)
                {   
                    ans[j++] = nums[i];
                    ans[j] = temp[j/2];
                    j++;

                }

        }
        return ans;
    }
}