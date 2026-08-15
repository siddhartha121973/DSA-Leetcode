class Solution {
   public int[] searchRange(int[] nums, int target) {
        int first=lower_bound(nums,target);
        int last=upper_bound(nums,target);
        int[] arr={first,last};
        return arr;
        
    }
     int lower_bound(int[] nums, int target)
    {
        int n=nums.length;
        int s=0,e=n-1,mid;
        int ans=-1;
        while(s<=e)
        {
            mid=(s+e)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                e=mid-1;
            }
            else if(nums[mid]<target)
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return ans;
    }
    int upper_bound(int[] nums, int target)
    {
        int n=nums.length;
        int s=0,e=n-1,mid;
        int ans=-1;
        while(s<=e)
        {
            mid=(s+e)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                s=mid+1;
            }
            else if(nums[mid]<target)
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return ans;
    }
    
}