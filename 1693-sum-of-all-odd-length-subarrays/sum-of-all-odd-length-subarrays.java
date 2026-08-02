class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int temp=0;
        for(int i=0;i<=n-1;i++)
        {
            int sum=0;
            for(int j=i;j<=n-1;j++)
            {
                sum+=arr[j];
                if((j-i+1)%2==1)
                {
                    temp+=sum;
                }
            }
        }
        return temp;
    }
}