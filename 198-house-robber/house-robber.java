class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return f(nums, dp, 0, n);
        

    }

    public int f(int []nums, int[] dp, int i, int n)
    {
        if(i>=n)
        return 0;
        if(dp[i]!=-1)
        return dp[i];

        int pick = 0;
        
        pick = nums[i]+f(nums, dp, i+2, n);
        int notPick = f(nums, dp, i+1, n);

        return dp[i] = Math.max(pick, notPick);
    }
}