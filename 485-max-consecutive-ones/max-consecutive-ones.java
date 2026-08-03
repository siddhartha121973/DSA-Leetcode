class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count=0,res=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                count++;
            }
            res=Math.max(res,count);
            if(nums[i]!=1)
            {
                count=0;
            }
        }
        return res;
    }
}