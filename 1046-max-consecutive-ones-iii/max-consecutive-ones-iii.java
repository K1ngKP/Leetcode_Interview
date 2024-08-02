class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        int cnt = k;
        int currStart = 0;
        while(end<nums.length)
        {
            if(nums[end++] == 0 )cnt--;
            while(cnt < 0 )
            {
                
                if(nums[start++]==0)
                cnt++;
            }
            maxLength = Math.max(maxLength, end-start);

        
        }
        return maxLength;

    }
}