class Solution {
    public boolean isPerfectSquare(int num) {
      long s=0;
      long e=num;
      long mid;
      while(s<=e)
      {
        mid=(s+e)/2;
        if(mid*mid==num)
        {
            return true;
        }
        else if(mid*mid<num)
        {
            s=mid+1;
        }
        else{
            e=mid-1;
        }
      }
      return false;

    }
}