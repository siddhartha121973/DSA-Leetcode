class Solution {
    static void solve(int n, int k , List<List<Integer>>output , List<Integer>temp , int i ) {
        if(temp.size() == k){
            output.add(new ArrayList<>(temp) );
            return;
        }
        if(i > n){
            return;
        }
        temp.add(i);
        solve( n , k , output , temp , i+1 );

        temp.remove(temp.size()-1);

        solve( n , k  , output , temp , i+1 );
        

    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>output=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        int i = 1;
        solve( n , k , output , temp , i );
        return output;
    }
}