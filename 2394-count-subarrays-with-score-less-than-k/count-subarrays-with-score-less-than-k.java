class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n=nums.length;
        int i=0,j=0;
        long sum=0,count=0;
        while(j<n)
        {
            sum+=nums[j];
            long score=sum*(j-i+1);
            while(score>=k && i<=j)
            {
                sum-=nums[i];
                i++;
                score=sum*(j-i+1);
            }
            count+=(j-i+1);
            j++;
        }
        return count;
    }
}