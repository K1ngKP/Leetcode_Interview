class NumArray {
    HashMap<Integer, Integer> map = new HashMap<>();
    public NumArray(int[] nums) {
        int sum = 0;
        for(int i= 0; i<nums.length; i++)
        {
            sum+=nums[i];
            map.put(i, sum);
        }
    }
    
    public int sumRange(int left, int right) {
        return (left==0) ? map.get(right) : map.get(right)-map.get(left-1);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */