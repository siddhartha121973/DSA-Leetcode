class Solution {
    static boolean isvalidAns(int[] piles,int h,int k)
    {
        long hour=0;
        for(int i=0;i<piles.length;i++)
        {
            hour+=((long)piles[i]+k-1)/k;
        }
        if(hour<=h)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=0;
        int ans=-1;
        for(int i=0;i<n;i++)
        {
            if(piles[i]>max)
            {
                max=piles[i];
            }
        }
        int low=1;
        int high=max;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(isvalidAns(piles,h,mid))
            {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}