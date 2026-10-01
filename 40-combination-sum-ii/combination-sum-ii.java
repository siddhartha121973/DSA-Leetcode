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
        solve( candidates , target - candidates[i] , output , temp , i+1 );

        temp.remove(temp.size()-1);

        while(i+1 < candidates.length && candidates[i] == candidates[i+1]){
            i++;
        }
        solve( candidates , target  , output , temp , i+1 );
        

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>output=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        Arrays.sort(candidates);
        int i = 0;
        solve( candidates , target , output , temp , i );
        return output;
    }
}
    
