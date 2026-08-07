class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maximum=0;
        int current_max=0;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            int sum=(Math.min(height[i],height[j]))*(j-i);
            current_max=sum;
            maximum=Math.max(maximum,current_max);
            if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
          
            }
        }
        return maximum;
    }
}