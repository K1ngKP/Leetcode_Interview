class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack();
        int n = nums1.length;
        int m = nums2.length;

        int[] ans= new int[n];
        for(int i:nums2)
        {
            while(!st.isEmpty() && st.peek()<i)
            {
                map.put(st.pop(), i);
            }
            st.push(i);
        }

        for(int i=0; i<n; i++)
        {
            ans[i] = map.getOrDefault(nums1[i], -1);
        }

        return ans;

    }
}