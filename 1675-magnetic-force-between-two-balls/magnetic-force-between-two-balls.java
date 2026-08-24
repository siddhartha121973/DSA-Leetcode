class Solution {
    static boolean Ans(int[] position, int m, int mid)
    {
        int BollCount=1;
        int lastPosition=0;
        for(int i=1;i<position.length;i++)
        {
            if(position[i] - position[lastPosition] >= mid)
            {
                BollCount++;
                 lastPosition=i;
            }
            if(BollCount==m)
            {
                return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int ans=-1;
        int s=1;
        int maximum = -1;
        for(int i=0;i<position.length;i++)
        {
            if(position[i] > maximum)
            {
                maximum = position[i];
            }
        }
        int e = maximum;
        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if( Ans(position, m ,  mid))
            {
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
        
    }
}