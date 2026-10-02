class Solution {
    static void solve( int n , List<String> output , String temp , int open , int close){
        if(temp.length() == 2*n){
            output.add(temp);
            return;
        }
        if(open < n){
            solve( n , output , temp + "(" , open+1 ,close);
        }
        if(close < open){
            solve( n , output , temp + ")" , open ,close+1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> output=new ArrayList<>();
        String temp = "" ;
        int open = 0;
        int close = 0;
        solve( n , output , temp ,open ,close);
        return output;
    }
}