class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            int n1=accounts[i].length;
            for(int j=0;j<n1;j++)
            {
                sum=sum+accounts[i][j];
            }
                max=Math.max(max,sum);
            
        }
        return max;
    }
}