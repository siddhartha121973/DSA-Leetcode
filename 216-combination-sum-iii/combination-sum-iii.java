class Solution {
    static void solve(int k, int target , List<List<Integer>>output , List<Integer>temp , int i ) {
        if( target == 0 && temp.size() == k){
            output.add(new ArrayList<>(temp) );
            return;
        }
        if( target < 0){
            return;
        }
        if(i > 9){
            return;
        }
        temp.add(i);
        solve( k , target - i , output , temp , i+1 );

        temp.remove(temp.size()-1);

        solve( k , target  , output , temp , i+1 );
        

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
         List<List<Integer>>output=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        int i = 1;
        solve( k , n , output , temp , i );
        return output;
    }
}
    

