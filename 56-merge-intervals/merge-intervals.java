class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals, (a, b)-> a[0]-b[0]);
       List<int[]> list = new ArrayList<>();
        int[] prev = intervals[0];
       for(int i=1; i<intervals.length; i++)
       {
        int[] inter = intervals[i];
        if(inter[0]<=prev[1])
        {
            prev[1] = Math.max(prev[1], inter[1]);
        }
        else
        {
            list.add(prev);
            prev = inter;
        }
       }
       list.add(prev);
       return list.toArray(new int[list.size()][]);
    }
}