class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int sum=0;
        int sum2=0;
        int[] ls=new int[n];
        int[] rs=new int[n];
        ls[0]=0;
        for(int i=1;i<=n-1;i++)
        {
            sum+=nums[i-1];
            ls[i]=sum;
        }
        rs[n-1]=0;
        for(int i=n-2;i>=0;i--)
        {
            sum2+=nums[i+1];
            rs[i]=sum2;

        } 
        int[] result=new int[n];
        for(int i=0;i<n;i++)
        {
            result[i]=Math.abs(ls[i] - rs[i]);
        }
        return result;
    }
}