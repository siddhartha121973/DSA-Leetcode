class Solution {
    static void solve(int[] candidates, int target , List<List<Integer>>output , List<Integer>temp , int i ) {
        if( target == 0){
            output.add(new ArrayList<>(temp) );
            return;
        }
        if( target < 0){
            return;
        }
        if(i == candidates.length){
            return;
        }
        temp.add(candidates[i]);
        solve( candidates , target - candidates[i] , output , temp , i );

        temp.remove(temp.size()-1);
        solve( candidates , target  , output , temp , i+1 );
        

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>output=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        int i = 0;
        solve( candidates , target , output , temp , i );
        return output;
    }
}