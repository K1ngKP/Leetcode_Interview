class Solution {
    int mod = (int) 1e9+7;
    public int colorTheGrid(int m, int n) {
        Map<Integer, Long> state = new HashMap();
        dfs(state, 0, m, -1, 0);
        Set<Integer> set = new HashSet<>(state.keySet());
            for(int i =1; i<n; i++)
            {
                Map<Integer, Long> dp = new HashMap();
                for(int a:set )
                {for(int b : set)
                {
                    if((a & b)==0)
                    {
                        dp.put(a, (dp.getOrDefault(a, 0L)+state.get(b))%mod);
                    }
                }
                
                }
                state = dp;
            }
            long res = 0L;
            for(long val: state.values())
            res = (res + val) % mod;
            return (int) res;
    }

    void dfs(Map<Integer, Long> state, int j, int m, int prev, int curr)
    {
        if(j==m)
        {
            state.put(curr, state.getOrDefault(curr, 0L)+1);
            return;
        }

        for(int i =0; i<3; i++)
        {
            if(i==prev)
            continue;
            dfs(state, j+1, m, i, (curr<<3) | (1<<i));
        }
    }
}