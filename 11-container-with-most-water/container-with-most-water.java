class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int left = 0;
        int right = height.length - 1;
        while(left<right)
        {
            int diff = right - left;
            int h = 0;
            if(height[left]<height[right])
            h = height[left++];
            else
            h = height[right--];
            ans = Math.max(ans, diff*h);
        }

        return ans;
    }
}