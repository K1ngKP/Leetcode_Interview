class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length- 1;
        int mid = (left +right)/2;
        while(left<right)
        {
            mid = (left+right)/2;
            if(nums[mid]>=nums[right])
            left = mid+1;
            else
            right = mid;
        }

        int start = left;
        left = 0;
        right = nums.length-1;
        if(target>=nums[start] && target<=nums[right])
        {
            left = start;
        }else
        {
            right = start;
        }

        mid = left+(right-left)/2;
        while(left<=right)
        {
            mid = left+ (right-left)/2;
            if(nums[mid]==target)
            return mid;
            else if(target>nums[mid])
            {
                left = mid+1;

            }else
            right = mid-1;


        }
        return -1;
    }
}