class Solution {
    boolean sumIsValid(int[] weights, int days, long mid)
    {
        int currSum = 0;
        int count = 0;
        for(int i =0; i<weights.length; i++)
        {
            if(weights[i]>mid)
            return false;
            if(currSum+weights[i]>mid)
            {
                count++;
                currSum = 0;
                
            }
            currSum += weights[i];
        }


        return (count<days) ? true : false;
    }
    public int shipWithinDays(int[] weights, int days) {
        long low = 0;
        long high = 0;

        for(int i: weights)
        {
            low = Math.max(low, i);
            high += i;
        }
        
        long mid = (low+high)/2;
        long ans = 0;

        if(days == 1)
        {
            return (int) high;
        }
        while(low<high)
        {
            mid = (low+high)/2;
            if(sumIsValid(weights, days, mid))
            {
                ans = mid;
                high = mid;
            }else
            {
                low = mid+1;
            }
        }

        return (int) ans;

    }
}