class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[] map = new int[128];
        int cnt = 0;
        int start = 0;
        int end = 0;
        int minStart = 0;
        int window = Integer.MAX_VALUE;
        for(int i =0; i<n; i++)
        {
            map[t.charAt(i)]++;
            cnt++;
        }
        while(end<m)
        {
            if(map[s.charAt(end++)]-- > 0)
            {
                cnt--;
            }

            while(cnt==0)
            {
                if(end - start<window)
                {
                    minStart = start;
                    window = end - start;
                }
                if(map[s.charAt(start++)]++ == 0)cnt++;
                
            }
        }

        return window == Integer.MAX_VALUE ? "" : s.substring(minStart, window+minStart);
    }
}
