class Solution {
    public int findPairs(int[] nums, int k) {
        int n=nums.length;
        if(k<0)
        {
            return 0;
        }
        int count=0;
        int i=0;
        int j=1;
        Arrays.sort(nums);
        while(j<n)
        {
            
            if(i==j||(nums[j]-nums[i])<k)
            {
                j++;
            }
            else if((nums[j]-nums[i])>k)
            {
                i++;
            }
            else if((nums[j]-nums[i])==k)
            {
                count++;
                int L=nums[i];
                int R=nums[j];
                while(i<n && nums[i]==L)
                {
                    i++;
                }
                while(j<n && nums[j]==R)
                {
                    j++;
                }
                
            }
            
        }
        return count;
    }
}