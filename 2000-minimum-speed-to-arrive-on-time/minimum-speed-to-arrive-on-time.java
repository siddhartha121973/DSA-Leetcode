class Solution {
     static boolean isValidAns(int[] dist, double hour,int speed)
     {
        double time=0.0;
        for(int i=0;i<dist.length;i++)
        {
            double t= (double)dist[i]/speed;
            if(i!=(dist.length-1))
            {
                time+=Math.ceil(t);
            }
            else{
                time+=t;
            }
            if(time>hour)
            {
                return false;
            }
        }
        return true;
     }
    public int minSpeedOnTime(int[] dist, double hour) {
        int s=1;
        int e=1000000000;
        int ans=-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(isValidAns(dist,hour,mid))
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