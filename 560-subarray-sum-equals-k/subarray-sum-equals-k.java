class Solution {
    public int subarraySum(int[] nums, int k) {
    int n=nums.length;
    int count=0;
    for(int i=0;i<=n-1;i++)
    {
        int sum=0;
        for(int j=i;j<=n-1;j++)
        {
            sum+=nums[j];
            if(sum==k)
            {
                count++;
            }
        }
    }
        return count ;
    }
}