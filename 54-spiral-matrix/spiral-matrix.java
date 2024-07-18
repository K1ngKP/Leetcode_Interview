class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int total = m*n;
        int count =0;
        int srow = 0;
        int erow = m-1;
        int scol = 0;
        int ecol = n-1;

        while(count<total)
        {
            for(int i = scol; i<=ecol && count<total; i++)
            {
                list.add(matrix[srow][i]);
                count++;
            }
            srow++;

            for(int i = srow; i<=erow && count<total; i++)
            {
                list.add(matrix[i][ecol]);
                count++;
            }
            ecol--;

            for(int i = ecol; i>=scol && count<total; i--)
            {
                list.add(matrix[erow][i]);
                count++;
            }
            erow--;

            for(int i = erow; i>=srow && count<total; i--)
            {
                list.add(matrix[i][scol]);
                count++;
            }
            scol++;
        }

        return list;
    }
}