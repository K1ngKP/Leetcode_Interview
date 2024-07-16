class Solution {
    public int majorityElement(int[] nums) {
        int maxi = 0;
        int cnt = 0;

        for(int i =0; i<nums.length; i++)
        {
            if(cnt==0)
            {
                cnt = 1;
                maxi = nums[i];
            }
            else if(nums[i]==maxi)
            cnt++;
            else
            cnt--;

        }

        return maxi;
    }
}