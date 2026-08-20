class Solution {
    static boolean isValidAns(int[] weights, int days,int mid)
    {
        int day=1;
        int ship_load=0;
        for(int i=0;i<weights.length;i++)
        {
            if(ship_load+weights[i]<=mid){
                ship_load+=weights[i];
            }
            else {
                day++;
                ship_load=0;
                ship_load+=weights[i];
            }
            if(day>days || weights[i]>mid)
            {
                return false;
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int ans=-1;
        int sum=0;
        int n=weights.length;
        for(int i=0;i<n;i++)
        {
            sum+=weights[i];
        }
        int s=1;
        int e=sum;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(isValidAns(weights,days,mid))
            {
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
        
        
    }
}