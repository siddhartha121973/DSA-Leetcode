class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        int j=0;
        int max_window=-1;
        while(j<n)
        {
            if(nums[j]==0)
            {
                k--;
            }
            while(k==-1)
            {
                if(nums[i]==0)
                {
                    k++;
                }
                i++;
            }
            int current_window=j-i+1;
            max_window = Math.max( max_window , current_window);
            j++;
        }
        return max_window;
    }
}