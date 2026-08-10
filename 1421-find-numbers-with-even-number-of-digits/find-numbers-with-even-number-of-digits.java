class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int dig=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            while(nums[i]>0)
            {
                int s=nums[i]%10;
                nums[i]=nums[i]/10;
                count++;
            }
            if(count%2==0)
            {
                dig++;
            }
        }
        return dig;
        
    }
}