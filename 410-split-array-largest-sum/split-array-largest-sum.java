class Solution {
    public boolean isPossible(int []nums, int k, int mid)
    {
        int currSum = 0;
        int parts = 1;
        for(int i =0; i< nums.length; i++)
        {
            if(currSum+nums[i]>mid)
            {
                currSum = 0;
                parts++;
                if(parts>k || nums[i]>mid)
                return false;
            }
            currSum += nums[i];
        }

        return true;
    }
    public int splitArray(int[] nums, int k) {
        int sum = 0;
        int maxi = 0;

        for(int i : nums)
        {
            sum += i;
            maxi = Math.max(maxi, i);
        }

        int low = maxi;
        int high = sum;
        int ans = 0;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(isPossible(nums, k, mid))
            {
                ans = mid;
                high = mid-1;

            }else
            {
                low = mid+1;
            }
        }

        return ans;
    }

}